package pl.lodz.uni.math.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDropDown {
	
	WebDriver driver;

	By selectBtn = By.xpath("//select[@id='select-demo']");
	By checkBtn = By.xpath("//option[@value='Monday']");
	
    public SelectDropDown(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickOnButton()
    {
    	driver.findElement(selectBtn).click();
    }

    public void selectValueClick()
    {
    	driver.findElement(checkBtn).click();
    }

}
