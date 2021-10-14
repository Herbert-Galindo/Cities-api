package com.github.herbertgalindo.countries.repositories;

import com.github.herbertgalindo.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
