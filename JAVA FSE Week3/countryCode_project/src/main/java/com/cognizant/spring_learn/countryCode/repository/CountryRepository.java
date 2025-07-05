package com.cognizant.spring_learn.countryCode.repository;

import com.cognizant.spring_learn.countryCode.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
