package mrwedge.fgodb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PassiveEffect {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String iconUrl;
	
	@ManyToOne
	Effect effect;
	
	Integer value;
	Boolean valueIsPercentage;
	Integer chance;
	
	String notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getChance() {
		return chance;
	}

	public void setChance(Integer chance) {
		this.chance = chance;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getValueIsPercentage() {
		return valueIsPercentage;
	}

	public void setValueIsPercentage(Boolean valueIsPercentage) {
		this.valueIsPercentage = valueIsPercentage;
	}
}
