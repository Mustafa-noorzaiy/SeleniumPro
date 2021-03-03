package pageObject;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar {

	WebDriver driver;
	
	By searchBar=By.id("gh-ac");
	By searchButton= By.xpath("//input[@id='gh-btn']");
	
	By Description = By.xpath("//h3[@class='s-item__title s-item__title--has-tags']");
	By Price = By.xpath("//span[@class='s-item__price']");
	
	public SearchBar(WebDriver driver){
		this.driver=driver;
	}
	
	public void searchItem(String item) {
		driver.findElement(searchBar).sendKeys(item);
	}
	
	public void search() {
		driver.findElement(searchButton).click();
	}
	public void getDescription() {
	
	HashMap<List<WebElement>, List<WebElement>> hm = new HashMap<List<WebElement>, List<WebElement>>();

	List<WebElement> key=driver.findElements(Description);
	List<WebElement> value =driver.findElements(Price);
		
	for (WebElement we1 : key) {
		
		for (WebElement we2 : value) {
			System.out.println(we1.getText()+ " Price "+we2.getText() );
			
		}
	}
	
	
	}
}
