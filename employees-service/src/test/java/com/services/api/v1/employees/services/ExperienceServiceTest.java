package com.services.api.v1.employees.services;

import com.services.api.v1.employees.models.entities.Experience;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExperienceServiceTest {

    @Autowired
    private ExperienceService experienceService;

    @DisplayName("Test List Experience for collaborater")
    @Test
    public void emptyListOfExperience_OK() {

        List<Experience> listOfExperience = experienceService.getAllExperienceByCollaboraterId(Long.valueOf(1));
        Assert.assertTrue("There are no experience for collaborateur",0 == listOfExperience.size());
    }

    @DisplayName("Test List Experience for collaborater")
    @Test
    public void listExperienceNotEmpty_OK() {


        List<Experience> listOfExperience = experienceService.getAllExperienceByCollaboraterId(Long.valueOf(1));
        Assert.assertTrue("There are no experience for collaborateur",0 == listOfExperience.size());
    }
}
