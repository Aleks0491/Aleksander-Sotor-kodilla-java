package com.kodilla.hibernate.task.manytomany.dao;

import com.kodilla.hibernate.task.manytomany.Company;
import com.kodilla.hibernate.task.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveCompanyWithNameStartLike(@Param("PART_OF_COMPANY_NAME") String partName);

    @Query(nativeQuery = true)
    List<Company> retrieveCompanyWithPartName(@Param("PART_OF_COMPANY_NAME") String partName);

}
