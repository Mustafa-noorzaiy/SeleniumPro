package com.ebay.HomePage;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.SearchBar;

public class SearchItem {

	@Test
	public void verifySearchVar() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SearchBar search = new SearchBar(driver);
		search.searchItem("Iphone");
		search.search();
		Thread.sleep(10000);
		search.getDescription();
	}
	
	
	
	
	
	
	
	
	
}
