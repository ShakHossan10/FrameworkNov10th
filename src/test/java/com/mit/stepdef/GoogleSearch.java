package com.mit.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

import com.mit.common.googleBase;
import com.mit.pages.GoogleHome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public void class GoogleSearch extends googleBase {
	
	
	
	public WebDriver driver;
	GoogleHome gh;
	
	
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowsers();
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		//driver.get("https://www.google.com");
		//driver.manage().window().maximize();
	    
	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {
		
		GoogleHome gh = new GoogleHome(driver);
		gh.enterSearch(string);
		
	 //1.1.Find/Locate the element
		//WebElement searchBox;
	 //searchBox = driver.findElement(By.name("q"));
	 
	 //2. perform action
	 //searchBox.sendKeys(string);
	 
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		gh.clickSearch();
		
		//WebElement searchBtn;
		//searchBtn = driver.findElement(By.name("btnk"));
		
		//searchBtn.click();
		//searchBtn.submit();
		
		
	    
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		closeBrowser();
	    
	}
	
}
	
//	@Given("I am on the google homepage")
//	public void i_am_on_the_google_homepage() {
//	    
//		//WebDriver driver;
//		
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//		
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//	    
//	}
//
//	@When("I enter the search {string}")
//	public void i_enter_the_search(String string) {
//		
//		WebElement searchBox;
//		searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys(string);
//	   
//	}
//
//	@When("I click on google search button")
//	public void i_click_on_google_search_button() {
//		
//		WebElement searchBtn;
//		searchBtn = driver.findElement(By.name("btnk"));
//		searchBtn.click();
//		searchBtn.submit();
//	   
//	}
	
//	@Then("I receive related search result")
//	public void i_receive_related_search_result() {
//	 
//	}
	
	
