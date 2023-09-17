package ru.khamzin.repository.impl;

import ru.khamzin.entity.Employee;
import ru.khamzin.repository.EmployeeRepository;
import ru.khamzin.util.IdGeneratorForEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final List<Employee> employees = new ArrayList<>();

    @Override
    public Employee getById(Long employeeId) {
        Employee currentEmployee = null;
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                currentEmployee = employee;
                break;
            }
        }
        return currentEmployee;
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee save(Employee employee) {
        var nextId = IdGeneratorForEmployee.generatedId(employees, Employee::getId);
        employee.setId(nextId);
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(Long employeeId) {

    }

}
