package pl.lodz.uni.math.seleniumeasy.tests;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.webpageobject.*;

public class Tests {

	private WebPageName object;
	private WebDriver driver;
	
	@Before 
	public void BeforeClass()
	{
		System.setProperty("webdriver.gecko.driver", "F:/ECLIPSEoxygen/eclipse-workspace/seleniumjar/geckodriver.exe");	
		object = new WebPageName();
		driver = new FirefoxDriver();
	}
	
	@After
	public void AfterClass()
	{
		driver.quit();
	}
	
	@Test
	public void CheckBoxObject() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"basic-checkbox-demo.html");
		
		CheckBox object1 = new CheckBox(driver);

		object1.clickOnChceckBox();

		Assert.assertTrue(driver.getPageSource().contains("Check box is checked"));
	}

	@Test
	public void SingleInputFieldObject2() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"basic-first-form-demo.html");
		
		SingleInputField object2 = new SingleInputField(driver);
      
		object2.clickOnTextBox();
		Assert.assertTrue(driver.getPageSource().contains("Please enter your Message"));
		object2.enterElementBox("SELENIUM");
		object2.clickButtonShowText();
		Assert.assertTrue(driver.getPageSource().contains("SELENIUM"));
	}
	
	@Test
	public void RadioButtonObject3() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"basic-radiobutton-demo.html");
		
		RadioButton object3 = new RadioButton(driver);
      
		object3.femaleButtonCheck();
		object3.femaleButtonShowValue();
		Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));	
		
	}
	
	@Test
	public void SelectDropDownSelectListObject4() throws InterruptedException  
	{
		driver.get(object.ReturnNameWebsite()+"basic-select-dropdown-demo.html");
		
		SelectDropDownSelectList object4 = new SelectDropDownSelectList(driver);
      
		object4.clickOnButton();
		object4.selectValueClick();
		Assert.assertTrue(driver.getPageSource().contains("Day selected :- Monday"));
	}
	
	
	@Test
	public void DataListFilterObject5() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"data-list-filter-demo.html");
		
		DataListFilter object5 = new DataListFilter(driver);
		
		object5.clickField();
		Assert.assertTrue(driver.getPageSource().contains("Search Attendees..."));
		object5.whatSend("Brenda");
		Assert.assertTrue(driver.getPageSource().contains("Name: Brenda Tree"));

	}
	
	@Test
	public void GenerateFileToDownloadObject6() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"generate-file-to-download-demo.html");
		
		GenerateFileToDownload object6 = new GenerateFileToDownload(driver);
		
		object6.clickOnFieldText();
		object6.enterText("Testing on Page Object");
		object6.clickToGenerateButton();
		object6.clickToDownloadButton();
		
		Assert.assertTrue(driver.getPageSource().contains("Download"));

	}
	
	@Test
	public void TableRecordsFilterColorEmotObject7() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"table-records-filter-demo.html");
		
		TableRecordsFilterColorEmot object7 = new TableRecordsFilterColorEmot(driver);
		
		object7.clickButtonGreen();
		Assert.assertEquals("No Change Object Green Emot", true, object7.isElementOnPage("green"));
		object7.clickButtonOrange();	
		Assert.assertEquals("No Change Object Orange Emot", true, object7.isElementOnPage("orange"));
		object7.clickButtonRed();
		Assert.assertEquals("No Change Object Red Emot", true, object7.isElementOnPage("red"));

	}
	
	@Test
	public void JqueryDownloadProgressBarObject8() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"jquery-download-progress-bar-demo.html");
		
		JqueryDownloadProgressBar object8 = new JqueryDownloadProgressBar(driver);

		object8.downloadButton();
		Assert.assertTrue(driver.getPageSource().contains("File Download"));

		boolean downloadIf = object8.findClose();
		Assert.assertTrue(downloadIf);
		
	}
	
	@Test  
	public void BootstrapDownloadProgressBarObject9() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"bootstrap-download-progress-demo.html");
		
		BootstrapDownloadProgressBar object9 = new BootstrapDownloadProgressBar(driver);

		object9.downloadButtonClick();

		boolean downloadIf = object9.ifDownload();
		Assert.assertTrue(downloadIf);
		
	}
	
	@Test
	public void MultipleCheckBoxObject10() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"basic-checkbox-demo.html");
		
		MultipleCheckBox object10 = new MultipleCheckBox(driver);
      
		object10.clickOnCheckButton();
		object10.clickOnUnCheckButton();

	}
	
	@Test
	public void InputFormObject11() throws InterruptedException 
	{
		driver.get(object.ReturnNameWebsite()+"input-form-demo.html");
		
		InputForm object11 = new InputForm(driver);
      
		
		object11.contactEnterFname("Agata");
		object11.contactEnterLname("Nowakowska");
		object11.contactEnterEmail("now@pp.pl");
		object11.contactEnterPhone("821-452-7484");
		object11.contactEnterAddress("Wesola 26");
		object11.contactEnterCity("Lodz");
		object11.contactClickState();
		object11.contactEnterKey("C");
		object11.contactClickState2();
		object11.enterZip("4444");
		object11.enterWeb("double.com");
		object11.clickHosting();
		object11.clickProjectDescription();
		object11.enterProjectDescription("Testing Selenium Page");	
	
		object11.submitButton();
		Assert.assertTrue(driver.getPageSource().contains("Contact Us Today!"));
		
	}
	
}
