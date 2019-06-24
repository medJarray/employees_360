package com.services.api.v1.employees.models.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "experience")
public class Experience implements Serializable {

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

    @OneToMany(mappedBy="experience")
    private List<Technology> technology;

    @OneToOne
    @JoinColumn(name = "costumer_id")
    private Costumer costumer;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id")
    private Employee employee;

}
