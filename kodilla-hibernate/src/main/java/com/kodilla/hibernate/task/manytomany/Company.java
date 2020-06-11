package com.kodilla.hibernate.task.manytomany;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompanyWithNameStartLike",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%',:PART_OF_COMPANY_NAME, '%')",
        resultClass = Company.class
)
@NamedNativeQuery(
        name = "Company.retrieveCompanyWithPartName",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%',:PART_OF_COMPANY_NAME, '%')",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
@Service
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    @GeneratedValue
    @NotNull
    @Id
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
