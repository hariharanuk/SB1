package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {

	public PersonService() {
		// TODO Auto-generated constructor stub
		ht = new Hashtable<>();
		Person ps = new Person();
		ps.setId("1");
		ps.setAge(25);
		ps.setGender("Male");
		ps.setFirstname("Hari");
		ps.setLastname("Kanna");
		ht.put("S1", ps);
		
		ps = new Person();
		ps.setId("2");
		ps.setAge(35);
		ps.setGender("Female");
		ps.setFirstname("Tammna");
		ps.setLastname("Bhatia");
		ht.put("S2", ps);
	}
	
	Hashtable<String,Person> ht  = new Hashtable<>();
	
	
	public Hashtable<String,Person> getAll() {
		return ht;
	}
	
	public Person getPerson(String id) {
		return ht.containsKey(id) ? ht.get(id) : null;
	}
	
}
