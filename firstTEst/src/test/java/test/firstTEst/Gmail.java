package test.firstTEst;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	@Test
	public void test() {
		//initialize Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Open gmail
		driver.get("http://www.gmail.com");
		
	}

}
