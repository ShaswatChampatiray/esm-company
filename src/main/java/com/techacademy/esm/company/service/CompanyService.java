package com.techacademy.esm.company.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techacademy.esm.company.model.Companies;
import com.techacademy.esm.company.model.Company;
import com.techacademy.esm.company.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;

	public void registerCompany(Company company) {
		companyRepository.save(company);
	}

	public Optional<Company> getCompanyByCode(String companyCode) {
		return companyRepository.findById(companyCode);
	}

	public Companies getAllCompanies() {
		List<Company> companyList = new ArrayList<Company>();
		companyRepository.findAll().forEach(companyList::add);
		return new Companies(companyList);
	}

	public void deleteCompanyByCode(String companyCode) {
		Company company = new Company(companyCode);
		companyRepository.delete(company);
		
	}

}
