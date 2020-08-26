package mrwedge.fgodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mrwedge.fgodb.entity.Servant;
import mrwedge.fgodb.service.ServantService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ServantController {
	
	@Autowired
	private ServantService service;

	@GetMapping("/servants")
	public List<Servant> all() {
		return service.getServants();
	}
	
//	@PostMapping("/servants")
//	public Servant newServant(@RequestBody Servant newServant) {
//		return servRepo.save(newServant);
//	}
	
	@GetMapping("/servants/{id}")
	public Servant one(@PathVariable Integer id) {
		return service.getServant(id);
	}
	
	
//	@PutMapping("/servants/{id}")
//	public Servant replaceServant(@RequestBody Servant newServant, @PathVariable Integer id) {
//		return servRepo.findById(id)
//				.map(servant -> {
//					servant.setName(newServant.getName());
//					return servRepo.save(servant);
//				})
//				.orElseGet(() -> {
//					newServant.setId(id);
//					return servRepo.save(newServant);
//				});
//	}
	
//	@DeleteMapping("/servants/{id}")
//	public void deleteServant(@PathVariable Integer id) {
//		servRepo.deleteById(id);
//	}
}
