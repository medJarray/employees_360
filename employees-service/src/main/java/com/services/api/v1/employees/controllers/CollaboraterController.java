package com.services.api.v1.employees.controllers;

import com.services.api.v1.employees.models.dto.CollaboraterDTO;
import com.services.api.v1.employees.models.entities.Collaborater;
import com.services.api.v1.employees.services.CollaboraterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Api("Collaborateur Controller")
@RequestMapping("/collaborater")
public class CollaboraterController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CollaboraterService collaboraterService;

    @ApiOperation(value = "View a list of collaborater", response = Collaborater.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @GetMapping
    public List<Collaborater> getCollaborater(){
        return collaboraterService.getAllCollaborater();
    }

    @ApiOperation(value = "Save collaborater", response = Collaborater.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @PostMapping
    public Collaborater saveCollaborater(@RequestBody @NotNull CollaboraterDTO collaboraterDTO){

         Collaborater collaborater = collaboraterService.save(modelMapper.map(collaboraterDTO, Collaborater.class));
         return collaborater;
    }
}
