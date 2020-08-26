package mrwedge.fgodb.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PassiveSkill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String iconUrl;
	String name;
	String rank;
	
	@ManyToMany
	List<PassiveEffect> passiveEffects;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PassiveEffect> getPassiveEffects() {
		return passiveEffects;
	}

	public void setPassiveEffects(List<PassiveEffect> passiveEffects) {
		this.passiveEffects = passiveEffects;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}
