package com.HMS_PROJECT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS_PROJECT.Entity.EmployeeDetails;

public interface EmployeeReposistory extends JpaRepository<EmployeeDetails, Integer> {

}
