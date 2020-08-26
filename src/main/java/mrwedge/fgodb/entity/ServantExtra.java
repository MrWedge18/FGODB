package mrwedge.fgodb.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ServantExtra {
	
	@Id
	Integer id;

	String servantClass;
	String name;
	
	String saintGraphUrl;
	String iconUrl;
	
	Integer stars;
	Integer minAtk;
	Integer maxAtk;
	Integer minHp;
	Integer maxHp;

	Integer starAbsorption;
	Integer starGeneration;
	Integer npChargeAtk;
	Integer npChargeNp;	
	Integer npChargeDef;
	Integer deathRate;
	
	String alignments;
	String traits;
	
	String upgradeCondition;
	
	@ManyToMany
	List<Skill> skills1;
	@ManyToMany
	List<Skill> skills2;
	@ManyToMany
	List<Skill> skills3;
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
	public Integer getNpChargeNp() {
		return npChargeNp;
	}
	public void setNpChargeNp(Integer npChargeNp) {
		this.npChargeNp = npChargeNp;
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
	public String getTraits() {
		return traits;
	}
	public void setTraits(String traits) {
		this.traits = traits;
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
	public String getUpgradeCondition() {
		return upgradeCondition;
	}
	public void setUpgradeCondition(String upgradeCondition) {
		this.upgradeCondition = upgradeCondition;
	}

	
}
