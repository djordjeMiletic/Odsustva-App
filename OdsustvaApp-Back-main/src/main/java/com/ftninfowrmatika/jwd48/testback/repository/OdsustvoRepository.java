package com.ftninfowrmatika.jwd48.testback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninfowrmatika.jwd48.testback.model.Odsustvo;

@Repository
public interface OdsustvoRepository extends JpaRepository<Odsustvo, Long> {

	Odsustvo findOneById(Long id);
}
