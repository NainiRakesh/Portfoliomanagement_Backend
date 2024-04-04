package com.sonata.portfoliomanagement.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Revenue_VS_Budget")
public class RevenueVSBudget {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String vertical;
	private String classification;
	@Column(name="delivery_Manager")
	private String deliveryManager;
	private String account;
	@Column(name="project_Manager")
	private String projectManager;
	@Column(name="project_Name")
	private String projectName;
	@Column(name="financial_Year")
	private int financialYear;
	private Date month;
	private String quarter;
	private float budget;
	private float forecast;
	private float gap;
	public RevenueVSBudget(int id, String vertical, String classification, String deliveryManager, String account,
			String projectManager, String projectName, int financialYear, Date month, String quarter, float budget,
			float forecast, float gap) {
		super();
		this.id = id;
		this.vertical = vertical;
		this.classification = classification;
		this.deliveryManager = deliveryManager;
		this.account = account;
		this.projectManager = projectManager;
		this.projectName = projectName;
		this.financialYear = financialYear;
		this.month = month;
		this.quarter = quarter;
		this.budget = budget;
		this.forecast = forecast;
		this.gap = gap;
	}
	public RevenueVSBudget() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVertical() {
		return vertical;
	}
	public void setVertical(String vertical) {
		this.vertical = vertical;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getDeliveryManager() {
		return deliveryManager;
	}
	public void setDeliveryManager(String deliveryManager) {
		this.deliveryManager = deliveryManager;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(int financialYear) {
		this.financialYear = financialYear;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public float getForecast() {
		return forecast;
	}
	public void setForecast(float forecast) {
		this.forecast = forecast;
	}
	public float getGap() {
		return gap;
	}
	public void setGap(float gap) {
		this.gap = gap;
	}
	
	
 
}
 


