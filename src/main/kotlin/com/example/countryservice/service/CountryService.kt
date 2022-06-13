package com.example.countryservice.service

import com.example.countryservice.domain.Country
import com.example.countryservice.repository.CountryRepository
import org.springframework.stereotype.Service

@Service
class CountryService(val countryRepository: CountryRepository) {

    fun findCountries(): List<Country> = countryRepository.findCountries()

    fun post(country: Country){
        countryRepository.save(country)
    }
}