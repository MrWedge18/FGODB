package mrwedge.fgodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mrwedge.fgodb.entity.Servant;
import mrwedge.fgodb.exception.ServantNotFoundException;
import mrwedge.fgodb.repository.ServantRepo;

@Service
public class ServantService {
	
	@Autowired
	private ServantRepo servRepo;
	
	public List<Servant> getServants() {
		return servRepo.findAll();
	}
	
	public Servant getServant(int id) {
		return servRepo.findById(id)
				.orElseThrow(() -> new  ServantNotFoundException(id));
	}
	
}
