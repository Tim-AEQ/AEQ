package com.cucumberMavenExperiment.cucumber_project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class LoanAgentTester {

	@Test
	public void test719() {
		LoanAgent agent = new LoanAgent();
		
		
		CreditAgency agency = Mockito.mock(CreditAgency.class);
		Mockito.when(agency.getCreditScore(123456789)).thenReturn(719);
		Mockito.when(agency.getCreditScore(234567891)).thenReturn(720);
		
		agent.setCreditAgency(agency);
		
		assertFalse(agent.processLoan(123456789));
		assertTrue(agent.processLoan(234567891));
		
	}

}
