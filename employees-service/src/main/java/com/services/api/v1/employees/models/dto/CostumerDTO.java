package com.services.api.v1.employees.models.dto;

import com.services.api.v1.employees.models.entities.Address;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CostumerDTO {

    private String costumerName;
    private String activityArea;
    private String status;
    private Address costumerAddress;
}
