package com.services.api.v1.employees.services.impl;

import com.services.api.v1.employees.models.entities.Experience;
import com.services.api.v1.employees.repositories.ExperienceRepository;
import com.services.api.v1.employees.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public List<Experience> getAllExperienceByCollaboraterId(Long collaboraterId) {

        List<Experience> experiences = experienceRepository.findAllByCollaboraterId(collaboraterId);
        return experiences;

    }

    @Override
    public void deleteById(Long experienceId) {
        experienceRepository.deleteById(experienceId);
    }

    @Override
    public Experience saveExperience(Experience experience) {
        Experience experienceSave = experienceRepository.save(experience);
        return experienceSave;
    }
}
