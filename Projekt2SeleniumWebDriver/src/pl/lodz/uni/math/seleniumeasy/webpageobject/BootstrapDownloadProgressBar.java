package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BootstrapDownloadProgressBar {

	WebDriver driver;
	
	By startBtn = By.xpath("//button[@id='cricle-btn']");

	By completeText = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]");
    By downloadButton = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div/div/button/i");
    By percent = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]");
    
    public BootstrapDownloadProgressBar(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void downloadButtonClick()
    {
    	driver.findElement(startBtn).click();
    }

    
    public boolean ifDownload()
    {
    	while (true)
    	{
    		if(driver.findElement(completeText).getText().toString().equals("100%"))
    		{
    			driver.findElement(downloadButton);
    			return true;
    			//break;
    		}
    	}
    }
}
