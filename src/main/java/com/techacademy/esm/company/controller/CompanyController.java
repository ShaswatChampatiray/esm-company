package com.techacademy.esm.company.controller;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techacademy.esm.company.model.Companies;
import com.techacademy.esm.company.model.Company;
import com.techacademy.esm.company.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("register")
	public void registerCompany(@RequestBody Company company) {
		logger.info("CompanyController :: Invoked registerCompany method");
		companyService.registerCompany(company);
	}

	@GetMapping("/info/{companyCode}")
	public Optional<Company> getCompanyByCode(@PathVariable String companyCode) {
		logger.info("CompanyController :: Invoked getCompanyByCode method");
		return companyService.getCompanyByCode(companyCode);
	}

	@GetMapping("/getall")
	public Companies getAllCompanies() {
		logger.info("CompanyController :: Invoked getAllCompanies method");
		return companyService.getAllCompanies();
	}

	@DeleteMapping("/delete/{companyCode}")
	public void deleteCompanyByCode(@PathVariable String companyCode) {
		logger.info("CompanyController :: Invoked deleteCompanyByCode method");
		companyService.deleteCompanyByCode(companyCode);
	}

}
