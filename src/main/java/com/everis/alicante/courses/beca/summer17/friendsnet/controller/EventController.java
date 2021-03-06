package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.EventManager;

@RestController
@RequestMapping("/event")
@Transactional
public class EventController {
	
	@Autowired
	private EventManager manager;
	
	@GetMapping
	public List<Event> getAll(){

		List<Event> persons =(List<Event>)manager.findAll();
		return persons;
	}
	
	@GetMapping("/{id}")
	public Event getById(@PathVariable Long id) {

		return (Event)manager.findById(id);
	}

	//TODO
//	@GetMapping
//	public Event addPerson(@PathVariable Long person, @PathVariable Long id) {
//		return manager.save(e);
//	}
	
	@PostMapping("/person{id}")
	public List<Event> getByPersonId(@PathVariable Long id){
		return (List<Event>)this.manager.findById(id);
		
	}
	
	@PostMapping
	public Event create(@RequestBody Event event) {

		return manager.save(event);
	}
	
	@DeleteMapping
	public void remove(@RequestParam Long id) {

		manager.remove(manager.findById(id));
	}

}
