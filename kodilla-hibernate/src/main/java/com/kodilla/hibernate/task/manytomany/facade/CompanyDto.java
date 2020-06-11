package com.kodilla.hibernate.task.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    private int id;
    private String name;
    private List<EmployeeDto> employeeDtoList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeDto> getEmployeeDtoList() {
        return employeeDtoList;
    }

    public void setEmployeeDtoList(List<EmployeeDto> employeeDtoList) {
        this.employeeDtoList = employeeDtoList;
    }
}
