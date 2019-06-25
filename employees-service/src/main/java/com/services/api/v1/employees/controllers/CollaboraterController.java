package com.services.api.v1.employees.controllers;

import com.services.api.v1.employees.models.entities.Collaborater;
import com.services.api.v1.employees.services.CollaboraterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("TEST")
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private CollaboraterService collaboraterService;

    @ApiOperation(value = "View a list of available languages", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @GetMapping
    public List<Collaborater> getAllEmployees(){
        return collaboraterService.getAllEmployee();
    }
}
