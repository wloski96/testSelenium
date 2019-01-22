package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JqueryDownloadProgressBar {

	WebDriver driver;
	
	By startBtn = By.xpath("//button[@id='downloadButton']");
	By closeBtn = By.xpath("//div[@class='ui-dialog-buttonset']");
	By resultText = By.xpath("//div[@class='ui-progressbar-value ui-corner-left ui-widget-header ui-progressbar-complete ui-corner-right'][@style='width: 102%; display: block;']");
	By completeText = By.xpath("/html/body/div[3]/div[2]/div[1]");
	
    public JqueryDownloadProgressBar(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void downloadButton()
    {
    	driver.findElement(startBtn).click();
    }
    public void closeButton()
    {
    	driver.findElement(closeBtn).click();
    }
    

    
    public boolean findClose()
    {
    	while (true)
    	{
    		if(driver.findElement(completeText).getText().toString().equals("Complete!"))
    		{
    			driver.findElement(closeBtn).click();
    			//break;
    			return true;
    		}
    	}
    }
}
