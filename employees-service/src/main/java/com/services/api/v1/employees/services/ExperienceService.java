package com.services.api.v1.employees.services;

import com.services.api.v1.employees.models.entities.Experience;

import java.util.List;

public interface ExperienceService {

    void deleteById(Long experienceId);
    Experience saveExperience(Experience experience);
    List<Experience> getAllExperienceByCollaboraterId( Long collaboraterId);
}
