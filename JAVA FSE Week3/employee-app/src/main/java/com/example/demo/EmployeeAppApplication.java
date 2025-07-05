package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeeAppApplication.class, args);

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        Employee employee = new Employee();
        employee.setName("Suwathi");
        employee.setDepartment("IT");
        employee.setSalary(50000.0);

        employeeService.addEmployee(employee);

        System.out.println("Employee added: " + employee);
    }
}

