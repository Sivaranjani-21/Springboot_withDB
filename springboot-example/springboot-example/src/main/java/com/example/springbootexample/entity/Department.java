package com.example.springbootexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;

    //@NotBlank(message = "Please Add Department Name !!")
    //@Length
    private String deptName;
    private String deptAdd;
    private String deptCode;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAdd() {
        return deptAdd;
    }

    public void setDeptAdd(String deptAdd) {
        this.deptAdd = deptAdd;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Department(Long deptId, String deptName, String deptAdd, String deptCode) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptAdd = deptAdd;
        this.deptCode = deptCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptAdd='" + deptAdd + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }
}
