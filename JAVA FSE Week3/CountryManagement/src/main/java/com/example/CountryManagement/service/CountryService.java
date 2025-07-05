package com.example.CountryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CountryManagement.model.Country;
import com.example.CountryManagement.repository.CountryRepository;

import javax.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(Country country) {
        countryRepository.save(country); // same method used
    }

    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> findCountriesByPartialName(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
