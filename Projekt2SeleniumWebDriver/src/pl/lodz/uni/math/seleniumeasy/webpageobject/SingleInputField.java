package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleInputField {

	WebDriver driver;
    
    By textBox = By.xpath("//input[@id='user-message']");
    By showBtn = By.xpath("//button[@onclick='showInput();']");
    
	
    
    public SingleInputField(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    
    public void clickOnTextBox()
    {    	
    	driver.findElement(textBox).click();	
    }
    
    
    public void enterElementBox(String text)
    {
    	driver.findElement(textBox).sendKeys(text);
    }
    
    public void clickButtonShowText()
    {
    	driver.findElement(showBtn).click();
    }
    

}
