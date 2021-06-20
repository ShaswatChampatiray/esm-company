package com.techacademy.esm.company.repository;

import org.springframework.data.repository.CrudRepository;

import com.techacademy.esm.company.model.Company;

public interface CompanyRepository extends CrudRepository<Company, String> {

}
