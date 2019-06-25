package com.services.api.v1.employees.models.dto;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressDTO {

    private String recipientName;
    private String streetNumber;
    private String complementAddress;
    private String postalCode;
}
