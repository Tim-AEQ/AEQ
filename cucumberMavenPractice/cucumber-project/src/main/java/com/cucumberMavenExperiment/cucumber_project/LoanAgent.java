package com.cucumberMavenExperiment.cucumber_project;

public class LoanAgent {
	
	private CreditAgency  agency ;
	
	public void setCreditAgency(CreditAgency agency)  {
		this.agency = agency;
	}
	
	public boolean processLoan(int ssn)  {
	boolean result = false;
	
	if (agency.getCreditScore(ssn) > 719) 
		result = true;
	
	return result;
	}

}
