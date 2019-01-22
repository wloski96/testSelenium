package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataListFilter {

	WebDriver driver;
	By dataChooseBtn = By.xpath("//input[@id='input-search']");	
	By dataClickBtn = By.xpath("//input[@placeholder='Search Attendees...']");
	
	public DataListFilter(WebDriver driver)
    {
    	this.driver = driver;
    }
	
	public void clickField()
	{
		driver.findElement(dataClickBtn).click();
	}
	
	public void whatSend(String a)
	{
		driver.findElement(dataChooseBtn).sendKeys(a);
	}
	
}
