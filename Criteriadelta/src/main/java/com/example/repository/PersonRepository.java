package com.example.repository;

import java.util.List;

import org.apache.deltaspike.data.api.EntityRepository;

import org.apache.deltaspike.data.api.Repository;

import com.example.model.Person;
@Repository
public interface PersonRepository extends EntityRepository<Person, Integer> {
	

}
