package com.services.api.v1.employees.services.impl;

import com.services.api.v1.employees.models.entities.Collaborater;
import com.services.api.v1.employees.repositories.EmployeesRepository;
import com.services.api.v1.employees.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesRepository  employeesRepository;

    @Override
    public List<Collaborater> getAllEmployee() {
        return employeesRepository.findAll();
    }
}
