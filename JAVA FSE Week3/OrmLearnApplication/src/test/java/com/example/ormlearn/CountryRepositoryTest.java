package com.example.ormlearn;

import com.example.ormlearn.model.Country;
import com.example.ormlearn.repository.CountryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CountryRepositoryTest {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    void testFindByNameContaining() {
        List<Country> countries = countryRepository.findByNameContaining("ou");
        countries.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
    }

    @Test
    void testFindByNameContainingSorted() {
        List<Country> countries = countryRepository.findByNameContainingOrderByNameAsc("ou");
        countries.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
    }

    @Test
    void testFindByStartingLetter() {
        List<Country> countries = countryRepository.findByNameStartingWith("Z");
        countries.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
    }
}