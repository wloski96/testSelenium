package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableRecordsFilter {

	WebDriver driver;
	
	public TableRecordsFilter(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By GreenclickBtn = By.xpath("//button[@type='button'][@class='btn btn-success btn-filter'][@data-target='pagado']");
	By OrangeclickBtn = By.xpath("//button[@type='button'][@class='btn btn-warning btn-filter'][@data-target='pendiente']");
	By RedclickBtn = By.xpath("//button[@type='button'][@class='btn btn-danger btn-filter'][@data-target='cancelado']");
	
	By GreenEmot = By.xpath("//i[@class='media-photo fa fa-smile-o fa-3x'][@style='color:green;']");
	By OrangeEmot = By.xpath("//i[@class='media-photo fa fa-smile-o fa-3x'][@style='color:orange;']");
	By RedEmot = By.xpath("//i[@class='media-photo fa fa-smile-o fa-3x'][@style='color:red;']");
	
	public void clickButtonGreen()
    {
    	driver.findElement(GreenclickBtn).click();
    }
	public void clickButtonOrange()
    {
    	driver.findElement(OrangeclickBtn).click();
    }
	public void clickButtonRed()
    {
    	driver.findElement(RedclickBtn).click();
    }
	
	public WebElement getTestSpan() 
	{
        return (WebElement) GreenEmot;
    }
	
	public boolean isElementOnPage(String color)
	{
		switch(color)
		{
		case "green": if(driver.findElement(GreenEmot).isDisplayed())
							return true;
						else return false;
		case "orange": if(driver.findElement(OrangeEmot).isDisplayed())
							return true;
						else return false;
		case "red": if(driver.findElement(RedEmot).isDisplayed())
							return true;
						else return false;
		default: return false;
		}
	}
}
