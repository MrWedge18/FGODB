package mrwedge.fgodb.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String iconUrl;
	String name;
	String unlockCondition;
	
	String rank;
	
	Integer cdLvl1;
	Integer cdLvl6;
	Integer cdLvl10;
	
	Integer unlockOrder;
	
	@ManyToMany
	List<SkillEffect> skillEffects;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnlockCondition() {
		return unlockCondition;
	}
	public void setUnlockCondition(String unlockCondition) {
		this.unlockCondition = unlockCondition;
	}
	public Integer getCdLvl1() {
		return cdLvl1;
	}
	public void setCdLvl1(Integer cdLvl1) {
		this.cdLvl1 = cdLvl1;
	}
	public Integer getCdLvl6() {
		return cdLvl6;
	}
	public void setCdLvl6(Integer cdLvl6) {
		this.cdLvl6 = cdLvl6;
	}
	public Integer getCdLvl10() {
		return cdLvl10;
	}
	public void setCdLvl10(Integer cdLvl10) {
		this.cdLvl10 = cdLvl10;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public Integer getUnlockOrder() {
		return unlockOrder;
	}
	public void setUnlockOrder(Integer unlockOrder) {
		this.unlockOrder = unlockOrder;
	}
	public List<SkillEffect> getSkillEffects() {
		return skillEffects;
	}
	public void setSkillEffects(List<SkillEffect> skillEffects) {
		this.skillEffects = skillEffects;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
}
