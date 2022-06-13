package com.example.countryservice.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("COUNTRIES")
data class Country(@Id val id: String?, val country: String)