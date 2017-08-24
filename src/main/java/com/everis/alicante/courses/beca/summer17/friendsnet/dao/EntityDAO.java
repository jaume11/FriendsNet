package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

public interface EntityDAO<E, ID> {
	
	Iterable<E> findAll();
	
	E findById(ID id);
	
	void save(E e);
	
	void save(Iterable<E> es);
	
	void update(E e);
	
	void update(Iterable<E> es);
	
	void remove(E e);

}
