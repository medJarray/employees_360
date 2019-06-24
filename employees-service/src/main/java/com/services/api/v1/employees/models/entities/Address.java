package com.services.api.v1.employees.models.entities;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address implements Serializable {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "address_id")
    private long id;

    @Column(name = "recipient_name")
    private String recipientName;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "complement_address")
    private String complementAddress;

    @Column(name = "postal_code")
    private String postalCode;
}
