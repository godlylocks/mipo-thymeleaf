package com.firstfewlines.service;

import com.firstfewlines.domain.Organism;
import com.firstfewlines.repository.OrganismRepository;
import com.firstfewlines.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContributeService {

    @Autowired
    private OrganismRepository organismRepository;

    public Iterable<Organism> getOrganisms(){
        System.out.println ("******" + organismRepository.findAll());
        return organismRepository.findAll();
    }
}
