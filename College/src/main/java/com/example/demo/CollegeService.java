package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.transaction.Transactional;
@Service
@Transactional

public class CollegeService {

	@Autowired
	private CollegeRepository rep;
   public List<College> listAll() {
	return rep.findAll();}

public College get(Integer id) {
	return rep.findById(id).get();
}

public void save(College college) {
	
	rep.save(college);
}

public void delete(Integer id) {
	rep.deleteById(id);
	
}

}

