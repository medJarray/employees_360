package com.services.api.v1.employees.controllers;

import com.services.api.v1.employees.models.dto.CollaboraterDTO;
import com.services.api.v1.employees.models.dto.ExperienceDTO;
import com.services.api.v1.employees.models.entities.Collaborater;
import com.services.api.v1.employees.models.entities.Experience;
import com.services.api.v1.employees.services.ExperienceService;
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
@Api("Experience Controller")
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ExperienceService experienceService;

    @ApiOperation(value = "View a list of experience for one collaborater", response = Experience.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @GetMapping
    public List<Experience> getAllExperienceByCollaborater(@RequestBody  @NotNull Long collaboraterId){
        return experienceService.getAllExperienceByCollaboraterId(collaboraterId);
    }

    @ApiOperation(value = "Save experience", response = Experience.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")})
    @PostMapping
    public Experience saveExperience(ExperienceDTO experienceDTO){

        Experience experience = experienceService.saveExperience(modelMapper.map(experienceDTO, Experience.class));
        return experience;
    }
}
