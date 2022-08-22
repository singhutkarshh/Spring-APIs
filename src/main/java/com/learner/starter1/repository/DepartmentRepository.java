package com.learner.starter1.repository;

import com.learner.starter1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findBydepartmentName(String departmentName);

/*
    @Query("pass your sql/jpql query")
    public Department findBydepartmentNameIgnoreCase(String departmentName);
*/
}
