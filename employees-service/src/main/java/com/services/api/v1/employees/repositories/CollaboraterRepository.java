package com.services.api.v1.employees.repositories;

import com.services.api.v1.employees.models.entities.Collaborater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Collaborater, Long> {
}
