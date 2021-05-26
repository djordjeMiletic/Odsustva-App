package com.ftninfowrmatika.jwd48.testback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninfowrmatika.jwd48.testback.model.Odeljenje;

@Repository
public interface OdeljenjeRepository extends JpaRepository<Odeljenje, Long> {
	
	Odeljenje findOneById(Long id);

}
