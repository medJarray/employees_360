package com.services.api.v1.employees.repositories;

import com.services.api.v1.employees.models.entities.Collaborater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollaboraterRepository extends JpaRepository<Collaborater, Long> {

    List<Collaborater> findAllByCostumerId(Long costumerId);
}
