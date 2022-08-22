package com.learner.starter1.service;

import com.learner.starter1.entity.Department;
import com.learner.starter1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department departmentData) {
       return departmentRepository.save(departmentData);
    }

    @Override
    public List<Department> getDepartment() {
        return  departmentRepository.findAll();
    }

    @Override
    public Optional<Department> fetchDepById(Long depId) {
        return departmentRepository.findById(depId);
    }

    @Override
    public void DeleteDepById(Long depId) {
        departmentRepository.deleteById(depId);
    }

    @Override
    public Department updateDepartment(Long depId, Department dep) {
      Department depDB = departmentRepository.findById(depId).get();
      if(Objects.nonNull(dep.getDepartmentName()) && !"".equalsIgnoreCase(dep.getDepartmentName())){
          depDB.setDepartmentName(dep.getDepartmentName());
      };

        if(Objects.nonNull(dep.getDepartmentName()) && !"".equalsIgnoreCase(dep.getDepartmentName())){
            depDB.setDepartmentName(dep.getDepartmentName());
        };

        if(Objects.nonNull(dep.getDepartmentAddress()) && !"".equalsIgnoreCase(dep.getDepartmentAddress())){
            depDB.setDepartmentAddress(dep.getDepartmentAddress());
        };

        if(Objects.nonNull(dep.getDepartmentCode()) && !"".equalsIgnoreCase(dep.getDepartmentCode())){
            depDB.setDepartmentCode(dep.getDepartmentCode());
        };

        return departmentRepository.save(depDB);
    }

    @Override
    public Department fetchDepByName(String depName) {
        return departmentRepository.findBydepartmentName(depName);
    };
}
