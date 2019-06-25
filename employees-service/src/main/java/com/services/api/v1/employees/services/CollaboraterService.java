package com.services.api.v1.employees.services;

import com.services.api.v1.employees.models.entities.Collaborater;

import java.util.List;

public interface CollaboraterService {

    List<Collaborater> getAllCollaborater();
    List<Collaborater> getAllCollaboraterByCostumer(Long costumerId);

    Collaborater save(Collaborater collaborater);
}
