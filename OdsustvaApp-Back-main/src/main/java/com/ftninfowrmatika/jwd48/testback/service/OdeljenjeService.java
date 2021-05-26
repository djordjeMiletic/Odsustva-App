package com.ftninfowrmatika.jwd48.testback.service;

import java.util.List;

import com.ftninfowrmatika.jwd48.testback.model.Odeljenje;

public interface OdeljenjeService {

	List<Odeljenje> findAll();
	
	Odeljenje findOneById(Long id);
}
