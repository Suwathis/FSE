package com.example.ormlearn;

import com.example.ormlearn.model.Department;
import com.example.ormlearn.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== HQL Query ===");
        List<Department> departments = departmentRepository.findByNameUsingHQL("HR");
        departments.forEach(d -> System.out.println(d.getId() + " - " + d.getName()));

        System.out.println("=== Native Query ===");
        List<Department> nativeDepartments = departmentRepository.findByNameNative("Finance");
        nativeDepartments.forEach(d -> System.out.println(d.getId() + " - " + d.getName()));

        System.out.println("=== HQL Aggregation ===");
        long count = departmentRepository.countDepartments();
        System.out.println("Total departments: " + count);
    }
}