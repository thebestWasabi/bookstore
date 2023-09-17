package ru.khamzin.controller;

import ru.khamzin.entity.Employee;
import ru.khamzin.entity.enums.EmployeeStatus;
import ru.khamzin.repository.EmployeeRepository;

import java.util.List;

public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(String firstname, String lastname, EmployeeStatus status) {
        var newEmployee = Employee.builder()
                .firstname(firstname)
                .lastname(lastname)
                .status(status)
                .build();
        return employeeRepository.save(newEmployee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAll();
    }

}
