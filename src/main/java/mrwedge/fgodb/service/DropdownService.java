package mrwedge.fgodb.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mrwedge.fgodb.entity.Servant;
import mrwedge.fgodb.repository.ServantRepo;

@Service
public class DropdownService {
	
	@PersistenceContext
	EntityManager em;
	
	@Autowired
	ServantRepo servantRepo;
	
	@SuppressWarnings("unchecked")
	private List<String> getAttributes(String search) {
		Query q = this.createSearchQuery("*", "attributes", "attribute", search);
		return q.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	private List<String> getAlignments(String search) {
		Query q = this.createSearchQuery("*", "alignments", "alignments", search);
		return q.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	private List<String> getTraits(String search) {
		Query q = this.createSearchQuery("*", "trait", "trait", search);
		return q.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	private List<String> getClasses(String search) {
		Query q = this.createSearchQuery("*", "class", "servant_class", search);
		return q.getResultList();
	}
	
	private Query createSearchQuery(String select, String from, String where, String search) {
		if (search == null)
			search = "";
		
		search = "%" + search + "%";
		
		Query q = em.createNativeQuery("SELECT " + select + " FROM " + from + " WHERE " + where + " LIKE :search");


		q.setParameter("search", search);
		
		return q;
	}
	
	private List<String> getServants(String search) {
		if (search == null || search == "")
			return new ArrayList<>();
		
		List<Servant> servants = servantRepo.findByNameContainingOrAkaContainingOrJpNameContaining(search, search, search);
		List<String> servantNames = new ArrayList<>();
		
		System.out.println(servants);
		
		for(Servant s: servants) {
			servantNames.add(s.getName());
		}
		
		return servantNames;
	}
	
	private void dropdownPut(Map<String, List<String>> dropdown, List<String> dropdownGroup, String groupName) {
		if (!dropdownGroup.isEmpty())
			dropdown.put(groupName, dropdownGroup);
	}
	
	public Map <String, List<String>> getDropdown(String search) {
		Map<String, List<String>> dropdown = new LinkedHashMap<>();
		
		this.dropdownPut(dropdown, this.getServants(search), "Servants");
		this.dropdownPut(dropdown, this.getClasses(search), "Classes");
		this.dropdownPut(dropdown, this.getAttributes(search), "Attributes");
		this.dropdownPut(dropdown, this.getAlignments(search), "Alignments");
		this.dropdownPut(dropdown, this.getTraits(search), "Traits");
		
		for(String k: dropdown.keySet()) {
			System.out.println(k);
		}
		
		return dropdown;
	}
}
