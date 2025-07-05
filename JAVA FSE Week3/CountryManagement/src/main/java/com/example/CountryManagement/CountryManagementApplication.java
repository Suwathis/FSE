package com.example.CountryManagement;

import com.example.CountryManagement.model.Country;
import com.example.CountryManagement.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
@SpringBootApplication
public class CountryManagementApplication {

	@Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryManagementApplication.class, args);
    }

    public void run(String... args) throws Exception {
        System.out.println("Start");

        Country country = countryService.findCountryByCode("IN");
        System.out.println("Find IN: " + country.getName());

        Country newCountry = new Country();
        newCountry.setCode("XX");
        newCountry.setName("TestLand");
        countryService.addCountry(newCountry);
        System.out.println("Added: " + newCountry.getName());

        newCountry.setName("TestLand Updated");
        countryService.updateCountry(newCountry);
        System.out.println("Updated: " + newCountry.getName());

        List<Country> list = countryService.findCountriesByPartialName("land");
        list.forEach(c -> System.out.println("Found: " + c.getName()));

        countryService.deleteCountry("XX");
        System.out.println("Deleted country with code XX");

        System.out.println("End");
    }

}
