package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	
	
	public PersonController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public @ResponseBody Hashtable<String,Person> getAll(){
		return ps.getAll();
	}
	
	@RequestMapping("/{id}")
	public @ResponseBody Person getPerson(@PathVariable("id") String id) {
		return ps.getPerson(id);
	}

}
