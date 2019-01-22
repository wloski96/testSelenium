package pl.lodz.uni.math.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenerateFileToDownload {

	WebDriver driver;
	
	By textField = By.xpath("//textarea[@id='textbox']");
	By text = By.xpath("//textarea[@id='textbox']");
	By generateBtn = By.xpath("//button[@id='create']");
	By downloadBtn = By.xpath("//a[@id='link-to-download']");

    
    public GenerateFileToDownload(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickOnFieldText()
    {
    	driver.findElement(textField).click();
    }
    
    public void enterText(String txt)
    {
    	driver.findElement(text).sendKeys(txt);
    }

    public void clickToGenerateButton()
    {
    	driver.findElement(generateBtn).click();
    }
    
    public void clickToDownloadButton()
    {
    	driver.findElement(downloadBtn).click();
    }
}
