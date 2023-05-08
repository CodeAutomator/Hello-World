package selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreej\\eclipse-workspace\\Hello-World\\src\\test\\resources\\driver\\chromedriver.exe");
//	WebDriver chromedriver = new ChromeDriver();
//	chromedriver.get("https://amazon.com");

	System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\sreej\\eclipse-workspace\\Hello-World\\src\\test\\resources\\driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();	
	driver.get("https://amazon.com");
	
	}
	
}
