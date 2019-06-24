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
@Table(name = "costumer")
public class Costumer implements Serializable {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "costumer_id")
    private long id;

    @Column(name = "costumer_name")
    private String costumerName;

    @Column(name = "activity_area")
    private String activityArea;

    @OneToOne
    @JoinColumn(name = "costumer_address_id")
    private Address costumerAddress;
}
