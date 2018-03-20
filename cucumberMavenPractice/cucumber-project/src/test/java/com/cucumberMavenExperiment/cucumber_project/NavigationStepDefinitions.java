package com.cucumberMavenExperiment.cucumber_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigationStepDefinitions {
	
	WebDriver driver ;
	
	@Before
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\billf\\Desktop\\CucumberJar\\LatestChromeDriver\\chromedriver.exe");
	}
	
	@Given("^I have a browser open$")
	public void i_have_a_browser_open() throws Throwable {
		driver = new ChromeDriver();
	    
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String url) throws Throwable {
		driver.get(url);
	    
	}

	@Then("^I am on the \"([^\"]*)\" page$")
	public void i_am_on_the_page(String arg1) throws Throwable {
	  driver.quit(); 
	}

}
