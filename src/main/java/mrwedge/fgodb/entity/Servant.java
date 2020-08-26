package mrwedge.fgodb.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Nationalized;

@Entity
public class Servant {

	@Id
	Integer id;
	String servantClass;
	@Basic
	@Nationalized
	String name;
	@Basic
	@Nationalized
	String jpName;
	@Basic
	@Nationalized
	String aka;
	Integer cost;
	Integer stars;
	
	String saintGraphUrl;
	String iconUrl;
	
	Integer minAtk;
	Integer maxAtk;
	Integer minHp;
	Integer maxHp;
	Integer grailAtk;
	Integer grailHp;
	
	@Basic
	@Nationalized
	String va;
	@Basic
	@Nationalized
	String illustrator;
	
	String attribute;
	String growthCurve;
	
	Integer starAbsorption;
	// =====================
	// These are stored as the percentages * 100
	Integer starGeneration;
	Integer npChargeAtk;
	Integer npChargeDef;
	Integer deathRate;
	// =====================
	
	String alignments;
	String gender;
	String traits;
	String deck;
	String hits;
	String ratios;
	
	// Skills are a linked list with all versions of the skill
	@ManyToMany
	List<Skill> skills1;
	@ManyToMany
	List<Skill> skills2;
	@ManyToMany
	List<Skill> skills3;
	
	@ManyToMany
	List<PassiveSkill> passiveSkills;
	
	@OneToMany
	List<NoblePhantasm> noblePhantasms;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getServantClass() {
		return servantClass;
	}
	public void setServantClass(String servantClass) {
		this.servantClass = servantClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJpName() {
		return jpName;
	}
	public void setJpName(String jpName) {
		this.jpName = jpName;
	}
	public String getAka() {
		return aka;
	}
	public void setAka(String aka) {
		this.aka = aka;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	public Integer getMinAtk() {
		return minAtk;
	}
	public void setMinAtk(Integer minAtk) {
		this.minAtk = minAtk;
	}
	public Integer getMaxAtk() {
		return maxAtk;
	}
	public void setMaxAtk(Integer maxAtk) {
		this.maxAtk = maxAtk;
	}
	public Integer getMinHp() {
		return minHp;
	}
	public void setMinHp(Integer minHp) {
		this.minHp = minHp;
	}
	public Integer getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(Integer maxHp) {
		this.maxHp = maxHp;
	}
	public Integer getGrailAtk() {
		return grailAtk;
	}
	public void setGrailAtk(Integer grailAtk) {
		this.grailAtk = grailAtk;
	}
	public Integer getGrailHp() {
		return grailHp;
	}
	public void setGrailHp(Integer grailHp) {
		this.grailHp = grailHp;
	}
	public String getVa() {
		return va;
	}
	public void setVa(String va) {
		this.va = va;
	}
	public String getIllustrator() {
		return illustrator;
	}
	public void setIllustrator(String illustrator) {
		this.illustrator = illustrator;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public String getGrowthCurve() {
		return growthCurve;
	}
	public void setGrowthCurve(String growthCurve) {
		this.growthCurve = growthCurve;
	}
	public Integer getStarAbsorption() {
		return starAbsorption;
	}
	public void setStarAbsorption(Integer starAbsorption) {
		this.starAbsorption = starAbsorption;
	}
	public Integer getStarGeneration() {
		return starGeneration;
	}
	public void setStarGeneration(Integer starGeneration) {
		this.starGeneration = starGeneration;
	}
	public Integer getNpChargeAtk() {
		return npChargeAtk;
	}
	public void setNpChargeAtk(Integer npChargeAtk) {
		this.npChargeAtk = npChargeAtk;
	}
	public Integer getNpChargeDef() {
		return npChargeDef;
	}
	public void setNpChargeDef(Integer npChargeDef) {
		this.npChargeDef = npChargeDef;
	}
	public Integer getDeathRate() {
		return deathRate;
	}
	public void setDeathRate(Integer deathRate) {
		this.deathRate = deathRate;
	}
	public String getAlignments() {
		return alignments;
	}
	public void setAlignments(String alignments) {
		this.alignments = alignments;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTraits() {
		return traits;
	}
	public void setTraits(String traits) {
		this.traits = traits;
	}
	public String getSaintGraphUrl() {
		return saintGraphUrl;
	}
	public void setSaintGraphUrl(String saintGraphUrl) {
		this.saintGraphUrl = saintGraphUrl;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getDeck() {
		return deck;
	}
	public void setDeck(String deck) {
		this.deck = deck;
	}
	public String getHits() {
		return hits;
	}
	public void setHits(String hits) {
		this.hits = hits;
	}
	public String getRatios() {
		return ratios;
	}
	public void setRatios(String ratios) {
		this.ratios = ratios;
	}
	public List<Skill> getSkills1() {
		return skills1;
	}
	public void setSkills1(List<Skill> skills1) {
		this.skills1 = skills1;
	}
	public List<Skill> getSkills2() {
		return skills2;
	}
	public void setSkills2(List<Skill> skills2) {
		this.skills2 = skills2;
	}
	public List<Skill> getSkills3() {
		return skills3;
	}
	public void setSkills3(List<Skill> skills3) {
		this.skills3 = skills3;
	}
	public List<PassiveSkill> getPassiveSkills() {
		return passiveSkills;
	}
	public void setPassiveSkills(List<PassiveSkill> passiveSkills) {
		this.passiveSkills = passiveSkills;
	}
	public List<NoblePhantasm> getNoblePhantasms() {
		return noblePhantasms;
	}
	public void setNoblePhantasms(List<NoblePhantasm> noblePhantasms) {
		this.noblePhantasms = noblePhantasms;
	}
	
}
