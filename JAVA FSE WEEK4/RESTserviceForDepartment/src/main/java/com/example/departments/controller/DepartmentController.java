package com.example.departments.controller;

import com.example.departments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<String> getAllDepartments() {
        System.out.println("Department REST service called");
        return departmentService.getAllDepartments();
    }
}
