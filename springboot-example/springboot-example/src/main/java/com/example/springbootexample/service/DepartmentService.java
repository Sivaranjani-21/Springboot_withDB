package com.example.springbootexample.service;

import com.example.springbootexample.entity.Department;
import com.example.springbootexample.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long deptId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long deptId);

    public Department updateDepartment(Long deptId, Department department);

    Department fetchDepartmentByName(String deptName);
}
