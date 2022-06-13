package com.example.countryservice.web

import com.example.countryservice.domain.Country
import com.example.countryservice.service.CountryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CountryRestService(val countryService: CountryService) {

    @GetMapping
    fun get(): List<Country> = countryService.findCountries()

    @PostMapping
    fun post(@RequestBody country: Country) {
        countryService.post(country)
    }
}