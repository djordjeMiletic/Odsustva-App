package com.ftninfowrmatika.jwd48.testback.service;

import java.util.List;

import com.ftninfowrmatika.jwd48.testback.model.Odsustvo;

public interface OdsustvoService {

	List<Odsustvo> findAll();
	
	Odsustvo findOneById(Long id);
	
	Odsustvo save(Odsustvo odsustvo);
}
