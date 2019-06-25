package com.services.api.v1.employees.services.impl;

import com.services.api.v1.employees.models.entities.Collaborater;
import com.services.api.v1.employees.repositories.CollaboraterRepository;
import com.services.api.v1.employees.services.CollaboraterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaboraterServiceImpl implements CollaboraterService {

    @Autowired
    private CollaboraterRepository collaboraterRepository;


    @Override
    public List<Collaborater> getAllCollaborater() {
        List<Collaborater> collaboraters = collaboraterRepository.findAll();
        return collaboraters;
    }

    @Override
    public List<Collaborater> getAllCollaboraterByCostumer(Long costumerId) {
        List<Collaborater> collaboraters = collaboraterRepository.findAllByCostumerId(costumerId);
        return collaboraters;
    }

    @Override
    public Collaborater save(Collaborater collaborater) {
        Collaborater collaboraterSaved = collaboraterRepository.save(collaborater);
        return collaborater;
    }
}
