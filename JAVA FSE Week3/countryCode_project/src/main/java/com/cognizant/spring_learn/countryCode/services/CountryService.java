package com.cognizant.spring_learn.countryCode.services;

import com.cognizant.spring_learn.countryCode.model.Country;
import com.cognizant.spring_learn.countryCode.service.exception.CountryNotFoundException;
import com.cognizant.spring_learn.countryCode.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country with code " + countryCode + " not found");
        }
        return result.get();
    }
}
