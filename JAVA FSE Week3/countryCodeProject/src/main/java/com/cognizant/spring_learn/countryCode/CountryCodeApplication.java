package com.cognizant.spring_learn.countryCode;

import com.cognizant.spring_learn.countryCode.model.Country;
import com.cognizant.spring_learn.countryCode.services.CountryService;
import com.cognizant.spring_learn.countryCode.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CountryCodeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryCodeApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) throws CountryNotFoundException {
        ApplicationContext context = SpringApplication.run(CountryCodeApplication.class, args);
        countryService = context.getBean(CountryService.class);

        getAllCountriesTest();
        testAddCountry();
    }

    private static void getAllCountriesTest() throws CountryNotFoundException {
        LOGGER.info("Start");
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country: {}", country);
        LOGGER.info("End");
    }

    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start - testAddCountry");
        Country newCountry = new Country("JP", "Japan");
        countryService.addCountry(newCountry);
        Country fetched = countryService.findCountryByCode("JP");
        LOGGER.debug("Fetched Country: {}", fetched);
        LOGGER.info("End - testAddCountry");
    }
}