package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..\\google\\path\\to\\chromedriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/xhtml");
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("co�");
		  searchBox.submit();
		  Thread.sleep(5000);
		  driver.quit();
	}
}
