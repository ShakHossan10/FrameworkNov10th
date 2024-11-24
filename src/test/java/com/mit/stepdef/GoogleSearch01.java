package com.mit.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch01 {
	
	public WebDriver driver;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	    
	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {
	    
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	   
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
	    
		
	}

}
