package com.example.ormlearn.repository;

import com.example.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByNameContaining(String text);
    List<Country> findByNameContainingOrderByNameAsc(String text);
    List<Country> findByNameStartingWith(String prefix);
}