package mrwedge.fgodb.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import mrwedge.fgodb.entity.Servant;

@Service
public class SearchService {
	
	@PersistenceContext
	EntityManager em;
	
	private List<String> allTraits;
	private List<String> allClasses;
	private List<String> allAttributes;
	private List<String> allAlignments;
	
	private List<String> getTraits() {
		if(allTraits == null) {
			Query q = em.createNativeQuery("SELECT * FROM trait");
			allTraits = q.getResultList();
		}
		
		return allTraits;
	}
	
	private List<String> getClasses() {
		if(allClasses == null) {
			Query q = em.createNativeQuery("SELECT * FROM class");
			allClasses = q.getResultList();
		}
		
		return allClasses;
	}
	
	private List<String> getAttributes() {
		if(allAttributes == null) {
			Query q = em.createNativeQuery("SELECT * FROM attributes");
			allAttributes = q.getResultList();
		}
		
		return allAttributes;
	}
	
	private List<String> getAlignments() {
		if(allAlignments == null) {
			Query q = em.createNativeQuery("SELECT * FROM alignments");
			allAlignments = q.getResultList();
		}
		
		return allAlignments;
	}
	
	@SuppressWarnings("unchecked")
	public List<Servant> searchServants(String q) {
		String[] params = q.split(",");
		
		String sqlStr = "SELECT * FROM servant WHERE servant_class IN :class AND traits LIKE :traits AND attribute IN :attribute AND alignments IN :alignments";
		
		Query sqlQuery = em.createNativeQuery(sqlStr, Servant.class);
		
		List<String> classes = new ArrayList<>();
		List<String> traits = new ArrayList<>();
		List<String> attributes = new ArrayList<>();
		List<String> alignments = new ArrayList<>();
		
		for(int i = 0; i < params.length; i++) {
			String[] where = params[i].split("=");
			
			switch (where[0]) {
			case "Classes":
				classes.add(where[1]);
				break;
			case "Traits":
				traits.add(where[1]);
				break;
			case "Attributes":
				attributes.add(where[1]);
				break;
			case "Alignments":
				alignments.add(where[1]);
				break;
			}
		}
		
		if (classes.isEmpty())
			classes = this.getClasses();
		if (!traits.isEmpty())
			Collections.sort(traits);
		if (attributes.isEmpty())
			attributes = this.getAttributes();
		if (alignments.isEmpty())
			alignments = this.getAlignments();
		
		sqlQuery.setParameter("class", classes);
		sqlQuery.setParameter("traits", "%" + String.join("%", traits) + "%");
		sqlQuery.setParameter("alignments", alignments);
		sqlQuery.setParameter("attribute", attributes);
		
		List<Servant> results = sqlQuery.getResultList();
		
		return results;
	}

}
