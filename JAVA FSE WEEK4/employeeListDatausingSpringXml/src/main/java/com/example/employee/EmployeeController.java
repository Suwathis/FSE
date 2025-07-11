package com.example.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        return (List<Employee>) context.getBean("employeeList");
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        List<Employee> employees = (List<Employee>) context.getBean("employeeList");
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }
}
