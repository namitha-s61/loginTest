package Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.*;

public class Gmail {
	public static void main(String[] args) {

		//initialize Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Open gmail
		driver.get("http://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Enter user name
		WebElement element = driver.findElement(By.id("identifierId"));
		element.sendKeys("xyzuzuyx8@gmail.com");
		
		//wait 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click on next
		WebElement buttonForward = driver.findElement(By.id("identifierNext"));
		buttonForward.click();
		
		//wait 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//Enter Password
		WebElement element1 =  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		element1.sendKeys("asdf@1987");
		
		
		//Click on next to log-in
		WebElement buttonLogIn = driver.findElement(By.id("passwordNext"));
		buttonLogIn.click();
		
	

}
}
