file = open('traits.txt')
text = file.read()
file.close()

text = text.replace('\n', ', ')
text = text.replace('"', '')

traits = text.split(', ')
traits = set(traits)

insert_str = ''
for t in traits:
	insert_str += 'INSERT INTO trait VALUES("' + t + '");\n'

file = open('traits_insert.txt', 'w')
file.write(insert_str)
file.close()