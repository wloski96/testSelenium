package pl.lodz.uni.math.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.GenerateFileToDownload;

public class GenerateFileToDownloadSteps4 {

	WebDriver driver;
	GenerateFileToDownload GenerateFileToDownloadObject;
	
	@Given("Firefox is automatically launched a fourth time")
	public void createNewDriver()
	{
		driver = new FirefoxDriver();
	}
	
	@When("We go to the site http://www.seleniumeasy.com/test/generate-file-to-download-demo.html")
	public void WebSite(int number)
	{

			driver.get("http://www.seleniumeasy.com/test/generate-file-to-download-demo.html");	
			GenerateFileToDownloadObject = new GenerateFileToDownload(driver);
	}
	
	@Then("We click on the text field")
	public void clickOnFieldText()
	{
		By textField = By.xpath("//textarea[@id='textbox']");
		driver.findElement(textField).click();
	}
	
	@Then("We enter the text $txt")
	public void enterText(@Named("txt")String txt)
	{
		By text = By.xpath("//textarea[@id='textbox']");
		driver.findElement(text).sendKeys(txt);
	}
	
	@Then("We click on the generate button")
	public void clickOnGenerateButton()
	{
		By generateBtn = By.xpath("//button[@id='create']");
		driver.findElement(generateBtn).click();
	}
	
	@Then("We click on the download button")
	public void clickOnDownloadButton()
	{
		By downloadBtn = By.xpath("//a[@id='link-to-download']");
		driver.findElement(downloadBtn).click();
	}
	
	@When("If you see the word Complete, you can download the file")
	public void ifDownload()
	{
		Assert.assertTrue(driver.getPageSource().contains("Download"));
	}
	
	@Then("Close the firefox 4")
	public void closeFirefox()
	{
		driver.quit();
	}
}
