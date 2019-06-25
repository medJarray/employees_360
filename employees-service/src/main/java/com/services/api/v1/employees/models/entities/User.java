package com.services.api.v1.employees.models.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(name = "email_professional")
    private String professionalEmail;

    @Column(name = "phone_personnel")
    private String personnelPhone;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "password")
    private String password;

    @Column(name = "account_status")
    private boolean isActif;
}
