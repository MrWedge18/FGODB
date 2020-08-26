package mrwedge.fgodb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mrwedge.fgodb.entity.Servant;;

public interface ServantRepo extends JpaRepository<Servant, Integer>{
	
	public List<Servant> findByNameContainingOrAkaContainingOrJpNameContaining(String name, String aka, String jpName);
	
	public Servant findByName(String name);
	
	//@Query("select s.name from Servant s where s.firstname like %?1% or s.aka like %?2% or s.jpName like %?3%")
	//public List<String> findByNames(String name, String aka, String jpName);

}
