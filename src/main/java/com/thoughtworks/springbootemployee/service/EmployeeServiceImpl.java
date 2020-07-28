package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> findAllEmployees() {
        return employees;
    }

    @Override
    public Employee findEmployeeById(int employeeId) {
        for ( Employee employee: employees) {
            if (employee.getId() == employeeId)
                return employee;
        }
        return null;
    }


}