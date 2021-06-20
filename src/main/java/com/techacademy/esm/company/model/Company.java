package com.techacademy.esm.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
public class Company {

	@Id
	@Column(name = "CompanyCode")
	private String companyCode;
	@Column(name = "CompanyName", nullable = false)
	@NotBlank(message = "CompanyName has to be present")
	private String companyName;
	@Column(name = "CompanyCEO")
	@NotBlank(message = "CompanyCEO has to be present")
	private String companyCEO;
	@Column(name = "CompanyTurnover")
	@Min(100000000)
	private Long companyTurnover;
	@Column(name = "CompanyWebsite")
	@NotBlank(message = "CompanyWebsite has to be present")
	private String companyWebsite;
	@Column(name = "StockExchange")
	@NotBlank(message = "StockExchange has to be present")
	private String stockExchange;

	public Company() {

	}

	public Company(String companyCode) {
		this.companyCode = companyCode;

	}

	public Company(String companyCode, String companyName, String companyCEO, Long companyTurnover,
			String companyWebsite, String stockExchange) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyCEO = companyCEO;
		this.companyTurnover = companyTurnover;
		this.companyWebsite = companyWebsite;
		this.stockExchange = stockExchange;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public Long getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(Long companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}


}
