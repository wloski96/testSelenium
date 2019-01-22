package pl.lodz.uni.math.seleniumeasy;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
	
	WebDriver driver;
	
	By checkBox1 = By.id("isAgeSelected");
	By message = By.xpath("//div[@class='panel-body']//div[contains(.,'Success - Check box is checked') and not(contains(@style,'display: none;'))]");


    public CheckBox(WebDriver driver)
    {
    	this.driver = driver;
    }
    
	@When("Kliknij checkbox") 
    public void clickOnChceckBox()
    {
    	driver.findElement(checkBox1).click();    	
    }
    
}
