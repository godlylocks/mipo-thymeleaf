package com.firstfewlines.repository;

import com.firstfewlines.domain.Organism;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganismRepository extends CrudRepository<Organism, Integer> {

}
