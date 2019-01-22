package pl.lodz.uni.math.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.SingleInputField;

public class SingleInputFieldSteps2 {

	WebDriver driver;
	SingleInputField BasicFirstFormObject;
	
	@Given("Firefox is automatically launched a second time")
	public void createNewDriver()
	{
		driver = new FirefoxDriver();
	}
	
	
	@When("We go to the site http://www.seleniumeasy.com/test/basic-first-form-demo.html")
	public void WebSite()
	{

			driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");	
			BasicFirstFormObject = new SingleInputField(driver);
	}
	
	
	@Then("Close the firefox 2")
	public void closeFirefox()
	{
		driver.quit();
	}
	
	@Then("We click on the TextBox")
	public void clickTextBox()
	{
		By textBox = By.xpath("//input[@id='user-message']");
		driver.findElement(textBox).click();
	}
	
	@Then("We should see $result")
	public void isTextBoxChecked(@Named("result")String result)
	{
		Assert.assertTrue(driver.getPageSource().contains(result));
		Assert.assertTrue(driver.getPageSource().contains("Please enter your Message"));
	}
	
	@Then("We enter the message $text")
	public void enterMessage(@Named("text")String text)
	{
		By textBox = By.xpath("//input[@id='user-message']");
		driver.findElement(textBox).sendKeys(text);
		driver.findElement(textBox).sendKeys("SELENIUM");
	}
	
	@When("We click on show button")
	public void showMessage()
	{
		By showBtn = By.xpath("//button[@onclick='showInput();']");
		driver.findElement(showBtn).click();
	}
	
	@Then("At the end we should see $result2")
	public void isMessage(@Named("result2")String result)
	{
		Assert.assertTrue(driver.getPageSource().contains(result));
		Assert.assertTrue(driver.getPageSource().contains("SELENIUM"));
	}
}
