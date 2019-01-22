package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {

	WebDriver driver;
	
	By checkBox1 = By.id("isAgeSelected");

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
