package com.services.api.v1.employees.services;

import com.services.api.v1.employees.models.entities.Collaborater;
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
public class CollaboraterServiceTest {

    @Autowired
    private CollaboraterService collaboraterService;

    @DisplayName("Test List Employees Is Empty")
    @Test
    public void emptyListOfEmployees() {

        List<Collaborater> listOfCollaborater = collaboraterService.getAllCollaborater();
        Assert.assertTrue("There are no employers",0 == listOfCollaborater.size());
    }
}
