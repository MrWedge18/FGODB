package mrwedge.fgodb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SkillEffect {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String iconUrl;
	
	String target;
	
	@ManyToOne
	Effect effect;
	
	Integer valueLvl1;
	Integer valueLvl2;
	Integer valueLvl3;
	Integer valueLvl4;
	Integer valueLvl5;
	Integer valueLvl6;
	Integer valueLvl7;
	Integer valueLvl8;
	Integer valueLvl9;
	Integer valueLvl10;
	
	// If percentage, then stored as percentage * 100
	boolean valueIsPercentage;
	
	Integer duration;
	Integer stacks;
	Integer chance;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Effect getEffect() {
		return effect;
	}
	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	public Integer getValueLvl1() {
		return valueLvl1;
	}
	public void setValueLvl1(Integer valueLvl1) {
		this.valueLvl1 = valueLvl1;
	}
	public Integer getValueLvl2() {
		return valueLvl2;
	}
	public void setValueLvl2(Integer valueLvl2) {
		this.valueLvl2 = valueLvl2;
	}
	public Integer getValueLvl3() {
		return valueLvl3;
	}
	public void setValueLvl3(Integer valueLvl3) {
		this.valueLvl3 = valueLvl3;
	}
	public Integer getValueLvl4() {
		return valueLvl4;
	}
	public void setValueLvl4(Integer valueLvl4) {
		this.valueLvl4 = valueLvl4;
	}
	public Integer getValueLvl5() {
		return valueLvl5;
	}
	public void setValueLvl5(Integer valueLvl5) {
		this.valueLvl5 = valueLvl5;
	}
	public Integer getValueLvl6() {
		return valueLvl6;
	}
	public void setValueLvl6(Integer valueLvl6) {
		this.valueLvl6 = valueLvl6;
	}
	public Integer getValueLvl7() {
		return valueLvl7;
	}
	public void setValueLvl7(Integer valueLvl7) {
		this.valueLvl7 = valueLvl7;
	}
	public Integer getValueLvl8() {
		return valueLvl8;
	}
	public void setValueLvl8(Integer valueLvl8) {
		this.valueLvl8 = valueLvl8;
	}
	public Integer getValueLvl9() {
		return valueLvl9;
	}
	public void setValueLvl9(Integer valueLvl9) {
		this.valueLvl9 = valueLvl9;
	}
	public Integer getValueLvl10() {
		return valueLvl10;
	}
	public void setValueLvl10(Integer valueLvl10) {
		this.valueLvl10 = valueLvl10;
	}
	public boolean isValueIsPercentage() {
		return valueIsPercentage;
	}
	public void setValueIsPercentage(boolean valueIsPercentage) {
		this.valueIsPercentage = valueIsPercentage;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getStacks() {
		return stacks;
	}
	public void setStacks(Integer stacks) {
		this.stacks = stacks;
	}
	public Integer getChance() {
		return chance;
	}
	public void setChance(Integer chance) {
		this.chance = chance;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
}
