package pl.lodz.uni.math.seleniumeasy.webpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputForm {
	
	WebDriver driver;

	By firstName = By.xpath("//input[@name='first_name']");
	By lastName = By.xpath("//input[@name='last_name']");
	By email = By.xpath("//input[@name='email']");
	By phone = By.xpath("//input[@name='phone']");
	By address = By.xpath("//input[@name='address']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//select[@name='state']");
	By zipcode = By.xpath("//input[@name='zip']");
	By website = By.xpath("//input[@name='website']");
	By hosting = By.xpath("//input[@name='hosting'][@value='no'][@type='radio']");
	By projectDescription = By.xpath("//textarea[@name='comment']");
	By savebutton = By.xpath("//button[@class='btn btn-default']");
	
	By ifFirstName = By.xpath("/html/body/div[2]/div/div[2]/section/form/fieldset/div[1]/div/div/input");

	
	public WebElement ifFirstName()
	{
		return driver.findElement(ifFirstName);
	}
	
	public InputForm(WebDriver driver)
	{
		this.driver=driver;
	}

	public void contactEnterFname(String Fname) 
	{
		driver.findElement(firstName).sendKeys(Fname);
	}
	
	public void contactEnterLname(String Lname) 
	{
		driver.findElement(lastName).sendKeys(Lname);
	}
	
	public void contactEnterEmail(String Email) 
	{
		driver.findElement(email).sendKeys(Email);
	}
	
	public void contactEnterPhone(String Phone) 
	{
		driver.findElement(phone).sendKeys(Phone);
	}
	
	public void contactEnterAddress(String Address) 
	{
		driver.findElement(address).sendKeys(Address);
	}	
	
	public void contactEnterCity(String City) 
	{
		driver.findElement(city).sendKeys(City);
	}
	
	public void contactClickState() 
	{
		driver.findElement(state).click();
	}
	
	public void contactEnterKey(String State) 
	{
		driver.findElement(state).sendKeys(State);
	}
	
	public void contactClickState2() 
	{
		driver.findElement(state).click();
	}
	
	public void enterZip(String Zip) 
	{
		driver.findElement(zipcode).sendKeys(Zip);
	}
	
	public void enterWeb(String Web) 
	{
		driver.findElement(website).sendKeys(Web);
	}
	
	public void clickHosting() 
	{
		driver.findElement(hosting).click();
	}
	
	public void clickProjectDescription() 
	{
		driver.findElement(projectDescription).click();
	}
	
	public void enterProjectDescription(String Description)  
	{
		driver.findElement(projectDescription).sendKeys(Description);
	}
	
	
	public void submitButton()
	{
		driver.findElement(savebutton).click();
	}
	
	/*public void contact(String Fname, String Lname, String Email, String Phone, String Address, String City, String State, String Zip, String Web, String Description) 
	{
		driver.findElement(firstName).sendKeys(Fname);
		driver.findElement(lastName).sendKeys(Lname);
		driver.findElement(email).sendKeys(Email);
		driver.findElement(phone).sendKeys(Phone);
		driver.findElement(address).sendKeys(Address);
		driver.findElement(city).sendKeys(City);
		driver.findElement(state).click();
		driver.findElement(state).sendKeys(State);
		driver.findElement(state).click();
		driver.findElement(zipcode).sendKeys(Zip);
		driver.findElement(website).sendKeys(Web);
		driver.findElement(hosting).click();
		driver.findElement(projectDescription).click();
		driver.findElement(projectDescription).sendKeys(Description);
		
	}*/

}
