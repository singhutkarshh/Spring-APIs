package com.learner.starter1.service;

import com.learner.starter1.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department saveDepartment(Department departmentData);

    List<Department> getDepartment();

    Optional<Department> fetchDepById(Long depId);

    void DeleteDepById(Long depId);

    Department updateDepartment(Long depId, Department dep);

    Department fetchDepByName(String depName);
}
