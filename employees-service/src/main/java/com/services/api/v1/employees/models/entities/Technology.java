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
@Table(name = "technologie")
public class Technology {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "technology_id")
    private String id;

    @Column(name = "technology_name")
    private String technologyName;

    @Column(name = "level")
    private String level;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="experience_id")
    private Experience experience;
}
