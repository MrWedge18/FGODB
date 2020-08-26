package mrwedge.fgodb.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mrwedge.fgodb.entity.Servant;
import mrwedge.fgodb.service.DropdownService;
import mrwedge.fgodb.service.SearchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SearchController {
	
	@Autowired
	private DropdownService dropdownService;
	
	@Autowired
	private SearchService searchService;
	
	@GetMapping("/dropdown")
	public Map<String, List<String>> dropdownSearch(@RequestParam(required=false) String term) {
		return dropdownService.getDropdown(term);
	}
	
	@GetMapping("/search")
	public List<Servant> searchServants(@RequestParam String q) {
		return searchService.searchServants(q);
	}

}
