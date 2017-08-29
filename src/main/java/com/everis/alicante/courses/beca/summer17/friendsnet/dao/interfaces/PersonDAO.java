package com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonDAO extends EntityDAO<Person, Long>{
	
	Person relatePersons(Person person, Iterable<Person> persons);
	
}
