package com.example.ormlearn.repository;

import com.example.ormlearn.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    // HQL Query to fetch departments by name
    @Query("SELECT d FROM Department d WHERE d.name = ?1")
    List<Department> findByNameUsingHQL(String name);

    // HQL with aggregation
    @Query("SELECT COUNT(d) FROM Department d")
    long countDepartments();

    // Native Query
    @Query(value = "SELECT * FROM department WHERE name = ?1", nativeQuery = true)
    List<Department> findByNameNative(String name);
}