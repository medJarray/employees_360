package com.services.api.v1.employees.models.dto;


import com.services.api.v1.employees.models.entities.Address;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CollaboraterDTO {

    private String lastName;
    private String firstName;
    private String personnelEmail;
    private String professionalEmail;
    private String personnelPhone;
    private String professionalPhone;
    private String manager;
    private String myRh;
    private boolean isInterco;
    private boolean resignation;
    private String typeContart;
    private LocalDate hiringDate;
    private LocalDate dateEndContract;
    private Address address;
}
