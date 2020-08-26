import requests
import traceback
import sys
import re
from bs4 import BeautifulSoup

base_url = 'https://fategrandorder.fandom.com'

def scrape_all_servants():
    classes = ['Saber', 'Archer', 'Lancer', 'Rider', 'Caster', 'Assassin', 'Berserker', 'Ruler', 'Avenger', 'Moon Cancer', 'Alter Ego', 'Foreigner']
    for c in classes:
        scrape_list(base_url + '/wiki/' + c, c)

def scrape(url, c):
    page = requests.get(url)
    servant_info = parse_servant(page)
    create_sql_insert_statements('servants.txt', servant_info, c)

def scrape_list(url, c):
    page = requests.get(url)
    soup = BeautifulSoup(page.text, 'html5lib')
    table = soup.find_all('table')[1].tbody
    trs = table.find_all('tr')
    for i in range(0, len(trs), 2):
        for td in trs[i].find_all('td'):
            a = td.find('a')
            if a:
                scrape(base_url + a['href'], c)

def parse_servant(page):
    soup = BeautifulSoup(page.text, 'html5lib')
    info = {}
    
    for linebreak in soup.find_all('br'):
        linebreak.extract()

    # ===========================
    # NAME
    name_p = soup.find_all('p', attrs={'class': 'ServantInfoName'})
    info['name'] = name_p[0].b.contents[0]
    # ===========================

    # ===========================
    # STARS
    stars_div = soup.find_all('div', attrs={'class': 'ServantInfoStars'})
    info['stars'] = stars_div[0].contents[0]
    info['stars_num'] = str(len(info['stars'].split()))
    # ===========================

    stats_table = soup.find_all('div', attrs={'class': 'ServantInfoStatsWrapper'})[0].table.tbody
    rows = stats_table.find_all('tr')
    for r in rows:
        tds = r.find_all('td')
        for td in tds:
            header = td.find('b').get_text()
            info[header[:-1].lower()] = (td.get_text().strip()[len(header):]).strip()

    # ===========================
    # DECK
    info['deck'] = stats_table.find('th').find('img')['alt']
    # HITS
    q_hits = stats_table.find_all('div', {'class': 'InumWrapper hidden'})[0].find('b').get_text()
    a_hits = stats_table.find_all('div', {'class': 'InumWrapper hidden'})[1].find('b').get_text()
    b_hits = stats_table.find_all('div', {'class': 'InumWrapper hidden'})[2].find('b').get_text()
    e_hits = stats_table.find_all('div', {'class': 'InumWrapper hidden'})[3].find('b').get_text()
    info['hits'] = q_hits + ',' + a_hits + ',' + b_hits + ',' + e_hits
    # DMG RATIO
    info['ratios'] = ','.join(re.findall('\([0-9,]*\)', stats_table.find_all('div', {'class': 'InumWrapper hidden'})[1].parent.get_text()))
    # ===========================


    #traits_table = soup.find_all('div', attrs={'class': 'ServantInfoStatsWrapper'})[0].find_all('table')[0].tbody
    # ===========================
    # TRAITS
    #info['traits'] = traits_table.contents[0].contents[1].contents[-1].strip()
    # ===========================

    return info

def parse_skills(page):
    soup = BeautifulSoup(page.text, 'html5lib')

    stats_table = soup.find_all('div', attrs={'class': 'ServantInfoStatsWrapper'})[0].table.tbody
    # ===========================
    # ID
    serv_id = stats_table.contents[4].contents[1].contents[1].strip()
    print('id: ' + serv_id)
    # ===========================

    first_skill_div = soup.find_all('div', attrs={'title': 'First Skill'})
    second_skill_div = soup.find_all('div', attrs={'title': 'Second Skill'})
    third_skill_div = soup.find_all('div', attrs={'title': 'Third Skill'})

    for i in range(3):
        skill_id = ((serv_id - 1) * 3) + i

def create_sql_insert_statements(file_name, info, c):
    for key in info:
        info[key] = info[key].replace("'", "''")

    file = open(file_name, 'a')
    append_str = ('INSERT INTO servant (id, servant_class, name, jp_name, aka, cost, stars, '
        'min_atk, max_atk, min_hp, max_hp, grail_atk, grail_hp, va, illustrator, attribute, '
        'growth_curve, star_absorption, star_generation, np_charge_atk, np_charge_def, death_rate, '
        'alignments, gender, traits, deck, hits, ratios) VALUES (')

    try:
        append_str += info['id']
        append_str += ", '" + c + "'"
        append_str += ", '" + info['name'] + "'"
        append_str += ", '" + info['japanese name'] + "'"
        if 'aka' in info:
            append_str += ", '" + info['aka'].replace('\r', ' ').replace('\n', ' ') + "'"
        else:
            append_str += ", ''"
        append_str += ', ' + info['cost']
        append_str += ', ' + info['stars_num']

        atk_split = info['atk'].split('/')
        hp_split = info['hp'].split('/')
        append_str += ', ' + atk_split[0].replace(',', '')
        append_str += ', ' + atk_split[1].replace(',', '')
        append_str += ', ' + hp_split[0].replace(',', '')
        append_str += ', ' + hp_split[1].replace(',', '')
        append_str += ', ' + info['grail atk'].replace(',', '')
        append_str += ', ' + info['grail hp'].replace(',', '')
        append_str += ", '" + info['voice actor'] + "'"
        append_str += ", '" + info['illustrator'] + "'"
        append_str += ", '" + info['attribute'] + "'"
        append_str += ", '" + info['growth curve'] + "'"
        append_str += ', ' + info['star absorption']

        append_str += ', ' + str(int(float(info['star generation'][:-1])*100))
        append_str += ', ' + str(int(float(info['np charge atk'][:-1])*100))
        append_str += ', ' + str(int(float(info['np charge def'][:-1])*100))
        append_str += ', ' + str(int(float(info['death rate'][:-1])*100))

        append_str += ", '" + info['alignments'].replace('・', ' ') + "'"
        append_str += ", '" + info['gender'] + "'"
        append_str += ", '" + info['traits'] + "'"
        append_str += ", '" + info['deck'] + "'"
        append_str += ", '" + info['hits'] + "'"
        append_str += ", '" + info['ratios'] + "'"
        file.write(append_str + ');\n')
    except:
        error_f = open('error.txt', 'a')
        error_f.write(append_str + '\n')
        e = sys.exc_info()
        print(e)
        traceback.print_tb(e[2])
        error_f.close()
    finally:
        file.close()

#scrape_all_servants()