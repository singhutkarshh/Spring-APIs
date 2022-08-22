package com.learner.starter1.controller;

import com.learner.starter1.entity.Department;
import com.learner.starter1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
      @Autowired
      private DepartmentService departmentService;

      @PostMapping("/saveDepartments")
      public Department saveDepartment(@RequestBody Department departmentData){
          return departmentService.saveDepartment(departmentData);
      };

      @GetMapping("/getDepartments")
      public List<Department> getDepartment(){
            return departmentService.getDepartment();
      };

      @GetMapping("/getDepartments/{id}")
      public Optional<Department> fetchDepById(@PathVariable("id") Long depId){
            return departmentService.fetchDepById(depId);
      };

      @DeleteMapping("/delDepartments/{id}")
      public String DeleteDepById(@PathVariable("id") Long depId){
            departmentService.DeleteDepById(depId);
            return "Successfully Deleted!";
      };

      @PutMapping("/updateDepartments/{id}")
      public Department updateDepartment(@PathVariable("id") Long depId , @RequestBody Department dep){
            return departmentService.updateDepartment(depId,dep);
      };

      @GetMapping("/getDepartmentsName/{name}")
      public Department fetchDepByName(@PathVariable("name") String depName){
            return departmentService.fetchDepByName(depName);
      };

}
