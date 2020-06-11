package com.kodilla.hibernate.task.manytomany.facade;

import com.kodilla.hibernate.task.manytomany.Company;

import java.util.List;

public class EmployeeDto {

    private int id;
    private String firstname;
    private String lastname;
    private List<CompanyDto> companiesDtoList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<CompanyDto> getCompaniesDtoList() {
        return companiesDtoList;
    }

    public void setCompaniesDtoList(List<CompanyDto> companiesDtoList) {
        this.companiesDtoList = companiesDtoList;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
