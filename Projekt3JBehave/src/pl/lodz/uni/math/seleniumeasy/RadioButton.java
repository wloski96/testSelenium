package pl.lodz.uni.math.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {

	WebDriver driver;
	
	By femaleBtn = By.xpath("//input[@value='Female'][@name='optradio']");
	By checkBtn = By.xpath("//button[@id='buttoncheck']");

    
    public RadioButton(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void femaleButtonCheck()
    {
    	driver.findElement(femaleBtn).click();
    }
    
    public void femaleButtonShowValue()
    {
    	driver.findElement(checkBtn).click();
    }
    
}
