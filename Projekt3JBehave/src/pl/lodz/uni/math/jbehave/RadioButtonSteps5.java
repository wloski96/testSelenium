package pl.lodz.uni.math.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.RadioButton;



public class RadioButtonSteps5 {
	

	WebDriver driver;
	RadioButton RadioButtonObject;
	
	@Given("Firefox is automatically launched a fifth time")
	public void createNewDriver()
	{
		driver = new FirefoxDriver();
	}
	
	@When("We go to the site http://www.seleniumeasy.com/test/basic-radiobutton-demo.html")
	public void WebSite(int number)
	{

			driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");	
			RadioButtonObject = new RadioButton(driver);
	}
	
	@Given("Find the female button")
	public void femaleButtonFind()
	{
		By femaleBtn = By.xpath("//input[@value='Female'][@name='optradio']");
		driver.findElement(femaleBtn).click();
	}
	
	@When("When you find, click on it")
	public void femaleButtonCheck()
	{
		By checkBtn = By.xpath("//button[@id='buttoncheck']");
		driver.findElement(checkBtn).click();
	}
	
	@Then("It should be checked Radio button 'Female' is checked")
	public void message()
	{
		Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));	
	}
	
	@Then("Close the firefox 5")
	public void closeFirefox()
	{
		driver.quit();
	}
}
