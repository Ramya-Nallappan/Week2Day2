//Assignment 3

package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3LoginLogout {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("The title of the page is: " + driver.getTitle());
	    driver.findElement(By.linkText("Log Out")).click();
	    driver.close();
	  	}

}
