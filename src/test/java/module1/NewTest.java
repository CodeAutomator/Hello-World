package module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.LoggerLoad;

public class NewTest {
	@Test
	public void test() {
		try {
			int a=100;
			int b=0;
			int c= a/b;
			
			
		}
		catch(Exception e) {
			LoggerLoad.error(e.getMessage());
		}
		System.out.println("I am the test case");
		LoggerLoad.info("This is test case 01 from New Test");
		
	}
@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am the before method");
		LoggerLoad.warn("This is a warning from before method");
		
	}
@AfterMethod
	public void afterMethod() {
		System.out.println("I am the after method");
		LoggerLoad.error("I am the error from after method");
		
	}

@BeforeClass
	public void beforeClass() {
		System.out.println("I am the before class");
		
	}
@AfterClass
	public void afterClass() {
		System.out.println("I am the after class");
		
	}

}
