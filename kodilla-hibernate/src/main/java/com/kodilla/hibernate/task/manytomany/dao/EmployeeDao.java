package com.kodilla.hibernate.task.manytomany.dao;

import com.kodilla.hibernate.task.manytomany.Company;
import com.kodilla.hibernate.task.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    default List<Employee> retrieveEmployeeByName(@Param("LASTNAME") String lastname) {
        return null;
    }

    @Query(nativeQuery = true)
    List<Employee> retrieveEmployeesWithPartName(@Param("PART_OF_LASTNAME") String partLastName);

}
