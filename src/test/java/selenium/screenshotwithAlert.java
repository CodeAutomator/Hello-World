package selenium;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.sql.Time;
import javax.imageio.ImageIO;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class screenshotwithAlert {
public static void takescreeenshot(String stepname) throws IOException, HeadlessException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.findElement(By.linkText("See an example alert")).click();
		try {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		String TCName = "TC_002";
		String dir = System.getProperty("user.dir");
//		Timestamp timestamp = new Time(System.currentTimeMillis());
		String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepname+"_"+".jpeg";
		
		}
		catch(Exception e)
		{
			BufferedImage Alertscreeenshot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			String TCName = "TC_002";
			String dir = System.getProperty("user.dir");
//			Timestamp timestamp = new Time(System.currentTimeMillis());
			String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepname+"_"+".jpeg";
			
			ImageIO.write(Alertscreeenshot, "png", new File(path));
		}
	
		
	
}
	public static void main(String[] args) throws IOException, HeadlessException, AWTException {
		takescreeenshot("AlertPage");
	}
}