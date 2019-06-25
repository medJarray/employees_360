package com.services.api.v1.employees.repositories;

import com.services.api.v1.employees.models.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

    List<Experience> findAllByCollaboraterId(Long idCollaborateur);
}
