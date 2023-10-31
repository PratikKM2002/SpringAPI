package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CollegeController {
	@Autowired
	private CollegeService service;
	
	//Retrieval
	@GetMapping("/college/2")
	public List<College> list()
	{
		return service.listAll();
	}
	//Retrieve by id
	@GetMapping("/college/{id}")
	public ResponseEntity<College>get(@PathVariable Integer id)
	{
		try {
			College college = service.get(id);
			return new ResponseEntity<College>(college, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	//create
	@PostMapping("/college/1")
		public void add(@RequestBody College college)
		{
			service.save(college);
		}
	//update
	@PutMapping("/college/{id}")
	public ResponseEntity<?>update(@RequestBody College college ,@PathVariable Integer id)
	{
		try {
			College exists = service.get(id);
			service.save(college);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/college/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
	
