
package com.services.api.v1.employees.models.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class Collaborater {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "collaborateur_id")
    private long collaborateurId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "email_personnel")
    private String personnelEmail;

    @Column(name = "email_professional")
    private String professionalEmail;

    @Column(name = "phone_personnel")
    private String personnelPhone;

    @Column(name = "phone_professional")
    private String professionalPhone;

    @Column(name = "manager")
    private String manager;

    @Column(name = "my_rh")
    private String myRh;

    @Column(name = "interco")
    private boolean isInterco;

    @Column(name = "resignation")
    private boolean resignation;

    @Column(name = "contract_type")
    private String typeContart;

    @Column(name = "hiring_date")
    private LocalDate hiringDate;

    @Column(name = "end_contract_date")
    private LocalDate dateEndContract;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "costumer_id")
    private Costumer costumer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private List<Experience> experiences;

}

