package com.example.departments.service;

import com.example.departments.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<String> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}
