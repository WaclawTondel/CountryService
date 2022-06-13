package com.example.countryservice.repository

import com.example.countryservice.domain.Country
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface CountryRepository : CrudRepository<Country, String> {

    @Query("select * from COUNTRIES")
    fun findCountries(): List<Country>
}