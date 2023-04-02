package com.company.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.company.entities.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}