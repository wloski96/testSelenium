package pl.lodz.uni.math.seleniumeasy.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.CheckBox;
import pl.lodz.uni.math.seleniumeasy.GenerateFileToDownload;
import pl.lodz.uni.math.seleniumeasy.RadioButton;
import pl.lodz.uni.math.seleniumeasy.SelectDropDown;
import pl.lodz.uni.math.seleniumeasy.SingleInputField;

public class Tests {
	
	Object o = new Object();
	
	@Before 
	public void BeforeClass()
	{
		System.setProperty("webdriver.gecko.driver", "F:/ECLIPSEoxygen/eclipse-workspace/seleniumjar/geckodriver.exe");	
	}
	
	@Test
	public void CheckBoxtestObject() throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get(o.ReturnNameWebsite()+"basic-checkbox-demo.html");
		
		CheckBox object = new CheckBox(driver);

		object.clickOnChceckBox();

		Assert.assertTrue(driver.getPageSource().contains("Check box is checked"));
 
		driver.quit();
	}
 
	@Test
	public void SingleInputFieldObject2() throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get(o.ReturnNameWebsite()+"basic-first-form-demo.html");
		
		SingleInputField object = new SingleInputField(driver);
      
		object.clickOnTextBox();
		Assert.assertTrue(driver.getPageSource().contains("Please enter your Message"));
		object.enterElementBox("SELENIUM");
		object.clickButtonShowText();
		Assert.assertTrue(driver.getPageSource().contains("SELENIUM"));

		driver.quit();
	}
	

	
	@Test
	public void SelectDropDownObject3() throws InterruptedException  
	{
		WebDriver driver = new FirefoxDriver();
		driver.get(o.ReturnNameWebsite()+"basic-select-dropdown-demo.html");
		
		SelectDropDown object = new SelectDropDown(driver);
      
		object.clickOnButton();
		object.selectValueClick();
		Assert.assertTrue(driver.getPageSource().contains("Day selected :- Monday"));
		
		driver.quit();
	}
	
	

	@Test
	public void GenerateFileToDownloadObject4() throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get(o.ReturnNameWebsite()+"generate-file-to-download-demo.html");
		
		GenerateFileToDownload object = new GenerateFileToDownload(driver);
		
		object.clickOnFieldText();
		object.enterText("Testing on Page Object");
		object.clickToGenerateButton();
		object.clickToDownloadButton();
		
		Assert.assertTrue(driver.getPageSource().contains("Download"));
		 
		driver.quit();
	}
	
	@Test
	public void RadioButtonObject5() throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get(o.ReturnNameWebsite()+"basic-radiobutton-demo.html");
		
		RadioButton object = new RadioButton(driver);
      
		object.femaleButtonCheck();
		object.femaleButtonShowValue();
		Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));	
		
		driver.quit();
	}
	


}
