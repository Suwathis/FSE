package com.example.ormlearn.service;

import com.example.ormlearn.model.Country;
import com.example.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountriesByNameContaining(String text) {
        return countryRepository.findByNameContaining(text);
    }

    public List<Country> getCountriesByNameContainingSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    public List<Country> getCountriesByStartingLetter(String letter) {
        return countryRepository.findByNameStartingWith(letter);
    }
}