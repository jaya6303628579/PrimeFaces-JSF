package com.example.service;

import com.example.model.Person;
import com.example.repository.PersonRepository;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PersonService {

    @Inject
    private PersonRepository personRepository;

   
    @Transactional
    public Person createPerson(Person user) {
        return personRepository.save(user);
    }

  
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    
    public Person getById(int id) {
    	return personRepository.findBy(id);
    }

   
    @Transactional
    public Person updatePerson(Person person) {
        Person existingPerson = personRepository.findBy(person.getId());
        if (existingPerson != null) {
            return personRepository.save(person);
        }
        return null;
    }

   
    @Transactional
    public void deletePerson(int id) {
        Person person = personRepository.findBy(id);
        if (person != null) {
        	personRepository.remove(person);
        }
    }
    
    public List<Person> getByName(String name){
    	return personRepository.findByName(name);
    }
    
    public List<Person> getByAddress(String address){
    	return personRepository.findByAddress(address);
    }
}
