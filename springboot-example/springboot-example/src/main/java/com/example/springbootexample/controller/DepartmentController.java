package com.example.springbootexample.controller;

import com.example.springbootexample.entity.Department;
import com.example.springbootexample.error.DepartmentNotFoundException;
import com.example.springbootexample.service.DepartmentService;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {

        //DepartmentService service = new DepartmentServiceImpl(); - AutoWired
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {

        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long deptId) throws DepartmentNotFoundException {

        LOGGER.info("Inside fetchDepartmentById of DepartmentController");
        return  departmentService.fetchDepartmentById(deptId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long deptId) {

        departmentService.deleteDepartmentById(deptId);
        LOGGER.info("Inside deleteDepartmentById of DepartmentController");
        return "DEPARTMENT DELETED SUCCESSFULLY !!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long deptId,
                                       @RequestBody Department department)
    {
        LOGGER.info("Inside UpdateDepartmentById of DepartmentController");
        return departmentService.updateDepartment(deptId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String deptName) {

        LOGGER.info("Inside fetchDepartmentByname of DepartmentController");
        return departmentService.fetchDepartmentByName(deptName);
    }

}
