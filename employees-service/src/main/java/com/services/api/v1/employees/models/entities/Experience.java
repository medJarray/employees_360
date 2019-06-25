package com.services.api.v1.employees.models.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "experience_id")
    private long id;

    @Column(name = "position_held")
    private String positionHeld;

    @Column(name = "start_date_of_service")
    private LocalDate startDateService;

    @Column(name = "end_date_of_service")
    private LocalDate endDateService;

    @Column(name = "collaborater_id")
    private Long collaboraterId;

    @OneToOne
    @JoinColumn(name = "costumer_id")
    private Costumer costumer;
}
