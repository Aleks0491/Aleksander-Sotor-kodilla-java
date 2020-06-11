package com.kodilla.hibernate.task.manytomany.facade;

import com.kodilla.hibernate.task.manytomany.Company;
import com.kodilla.hibernate.task.manytomany.Employee;
import com.kodilla.hibernate.task.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.task.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchFacade  {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<CompanyDto> searchingCompany(String partName) {
        List<Company> companyList = companyDao.retrieveCompanyWithPartName(partName);

        return companyList.stream()
                .map(this::mapToCompanyDto)
                .collect(Collectors.toList());
    }

    public List<EmployeeDto> searchingEmployees(String partName) {
        List<Employee> employeeList = employeeDao.retrieveEmployeesWithPartName(partName);
        if(employeeList.size() == 0) {

        }
        return employeeList.stream()
                .map(this::mapEmployeeToDto)
                .collect(Collectors.toList());
    }

    private CompanyDto mapToCompanyDto(Company company) {
        CompanyDto companyDto = new CompanyDto();
        companyDto.setId(company.getId());
        companyDto.setName(company.getName());
        companyDto.setEmployeeDtoList(employeeDtoList(company.getEmployees()));
        return companyDto;
    }

    private EmployeeDto mapEmployeeToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstname(employee.getFirstname());
        employeeDto.setLastname(employee.getLastname());
        return employeeDto;
    }

    private List<EmployeeDto> employeeDtoList (List<Employee> employeeList) {
        return employeeList.stream()
                .map(this::mapEmployeeToDto)
                .collect(Collectors.toList());
    }
}
