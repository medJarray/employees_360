package com.services.api.v1.employees.models.entities;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "costumer")
public class Costumer {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "costumer_id")
    private long costumerId;

    @Column(name = "costumer_name")
    private String costumerName;

    @Column(name = "activity_area")
    private String activityArea;

    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name = "costumer_address_id")
    private Address costumerAddress;
}
