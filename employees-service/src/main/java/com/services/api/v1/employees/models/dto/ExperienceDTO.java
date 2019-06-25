package com.services.api.v1.employees.models.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDTO {

    private String positionHeld;
    private LocalDate startDateService;
    private LocalDate endDateService;
    private Long employeeId;
    private CostumerDTO costumer;
}