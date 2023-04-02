package com.company.repository;

import java.util.List;

import com.company.entities.Country;

public interface ICountryService {

	List<Country> findPaginated(int pageNo, int pageSize);
}