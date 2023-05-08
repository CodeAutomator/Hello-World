package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JuiceShop_Register {
	
	public static WebDriver driver = new ChromeDriver();
	String URL = "https://juice-shop.herokuapp.com/#/register";
	By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
	By emailID = By.id("emailControl");
	By passwordTxt = By.id("passwordControl");

	By confirmPassword = By.id("repeatPasswordControl");
	By secQnBox=By.xpath("//div[@id= 'mat-select-value-1']/span");
	By secQn = By.xpath("//span[text() = ' Your eldest siblings middle name? ']");
			By secAns = By.id("securityAnswerControl");
			@Test
			
	public void register() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
		driver.findElement(dismissBtn).click();
		driver.findElement(emailID).sendKeys("deepika@gmail.com");
		driver.findElement(passwordTxt).sendKeys("1234@");
		driver.findElement(confirmPassword).sendKeys("1234@");
		driver.findElement(secQnBox).click();
		driver.findElement(secQn).click();
		
		driver.findElement(secAns).sendKeys("deepu");
	}

}
	

