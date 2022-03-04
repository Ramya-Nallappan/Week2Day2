package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4BondwithButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click button to travel home page
		driver.findElement(By.id("home")).click();
		
		//Navigate back
		System.out.println("The Current URL is " + driver.getCurrentUrl());
		driver. navigate(). back();
		System.out.println("The Naviagted back Url is " + driver.getCurrentUrl());
		
		//Find position of button (x,y)
		Point location =driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
		System.out.println("The location of the field " + location);
		
		//Find button color
		String backgroundColor = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color");
		System.out.println("The Background Color is" + backgroundColor);
        
		//Find the height and width
		Dimension size = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
		System.out.println("The size of the WebElement is " + size);
		
	}

}
