package pl.lodz.uni.math.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.SelectDropDown;

public class SelectDropDownSteps3 {

	WebDriver driver;
	SelectDropDown SelectDropDownObject;
	
	@Given("Firefox is automatically launched a third time")
	public void createNewDriver()
	{
		driver = new FirefoxDriver();
	}
	
	@When("We go to the site http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html")
	public void WebSite(int number)
	{

			driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
			SelectDropDownObject = new SelectDropDown(driver);
	}
	
	@Then("We click on the button")
	public void clickButton()
	{
		By selectBtn = By.xpath("//select[@id='select-demo']");
		driver.findElement(selectBtn).click();
	}
	
	@Then("We check on the value Monday")
	public void clickValue()
	{
		By checkBtn = By.xpath("//option[@value='Monday']");
		driver.findElement(checkBtn).click();
	}
	
	@Then("It should be checked: Day selected :- Monday")
	public void isValueChecked()
	{
		Assert.assertTrue(driver.getPageSource().contains("Day selected :- Monday"));
	}
	
	@Then("Close the firefox 3")
	public void closeFirefox()
	{
		driver.quit();
	}
}
