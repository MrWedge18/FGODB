package mrwedge.fgodb.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class NoblePhantasm {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String name;
	String cardType;
	String npType;
	String rank;
	
	Integer hits;
	Integer perHitPercentage;
	
	Integer unlockOrder;
	
	@ManyToMany
	List<SkillEffect> effects;
	@ManyToMany
	List<SkillEffect> overchargeEffects;
	
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
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getNpType() {
		return npType;
	}
	public void setNpType(String npType) {
		this.npType = npType;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Integer getPerHitPercentage() {
		return perHitPercentage;
	}
	public void setPerHitPercentage(Integer perHitPercentage) {
		this.perHitPercentage = perHitPercentage;
	}
	public Integer getUnlockOrder() {
		return unlockOrder;
	}
	public void setUnlockOrder(Integer unlockOrder) {
		this.unlockOrder = unlockOrder;
	}
	public List<SkillEffect> getEffects() {
		return effects;
	}
	public void setEffects(List<SkillEffect> effects) {
		this.effects = effects;
	}
	public List<SkillEffect> getOverchargeEffects() {
		return overchargeEffects;
	}
	public void setOverchargeEffects(List<SkillEffect> overchargeEffects) {
		this.overchargeEffects = overchargeEffects;
	}
	
	
}
