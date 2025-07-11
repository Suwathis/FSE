package com.example.departments.dao;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class DepartmentDao {

    private static final List<String> DEPARTMENT_LIST = Arrays.asList(
        "HR", "Finance", "Engineering", "Marketing"
    );

    public List<String> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
