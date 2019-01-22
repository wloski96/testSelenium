package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleCheckBox {
	
	WebDriver driver;
	
	By checkAll = By.xpath("//input[@value='Check All']");
	By UnCheckAll = By.xpath("//input[@value='Uncheck All']");
    
	By ifCheckAll = By.xpath("//input[@id='isChkd][@value='true'][@type='hidden']");
	By ifUncheckAll = By.xpath("//input[@id='isChkd][@value='false'][@type='hidden']");
    
    public MultipleCheckBox(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickOnCheckButton()
    {
    	driver.findElement(checkAll).click();
    }
    
    public void clickOnUnCheckButton()
    {
    	driver.findElement(UnCheckAll).click();
    }
    
    public boolean ifCheck() {
    	
    	driver.findElement(ifCheckAll);
    	return true;
    }

}
