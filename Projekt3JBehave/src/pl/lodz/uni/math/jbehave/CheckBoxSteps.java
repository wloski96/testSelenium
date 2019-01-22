package pl.lodz.uni.math.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.CheckBox;

public class CheckBoxSteps extends Steps {
	
	WebDriver driver;
	CheckBox CheckBoxObject;
	
	@Given("The firefox is automatically launched")
	public void createNewDriver()
	{
		driver = new FirefoxDriver();
	}
	
	@When("We go to the site http://www.seleniumeasy.com/test/basic-checkbox-demo.html")
	public void WebSite()
	{
			driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");	
			CheckBoxObject = new CheckBox(driver);
	}
	
	@Then("We click on the checkbox")
	public void clickCheckBox()
	{
		By checkBox1 = By.id("isAgeSelected");
		driver.findElement(checkBox1).click();
	}
	
	@Then("It should be checked $result")
	public void isCheckBoxChecked(@Named("result") String result)
	{
		Assert.assertTrue(driver.getPageSource().contains(result));
		Assert.assertTrue(driver.getPageSource().contains("Check box is checked"));
		Assert.assertEquals("Check box is checked", result);
	}
	
	@Then("Close the firefox")
	public void closeFirefox()
	{
		driver.quit();
	}
	
}
