package Week2Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1.Enter Email ID
		driver.findElement(By.id("email")).sendKeys("ramya19.nallappan@gmail.com");
		//2.Append a text and press keyboard tab
		WebElement append = driver.findElement(By.xpath("//label[(text()='Append a text and press keyboard tab')]/following-sibling::input"));
		append.sendKeys("testing");
		append.sendKeys(Keys.TAB);
		//3.Get default text entered
        String defaultText = driver.findElement(By.xpath("//label[(text()='Get default text entered')]/following-sibling::input")).getAttribute("value");
        System.out.println("The Default Text entered is "+ defaultText);
        //4.Clear text
        driver.findElement(By.xpath("//label[(text()='Clear the text')]/following-sibling::input")).clear();
        //5.Confirm that edit field is disabled
        boolean enabledText = driver.findElement(By.xpath("//label[(text()='Confirm that edit field is disabled')]/following-sibling::input")).isEnabled();
        System.out.println("Is the text enabled "+ enabledText);
        if(enabledText==true)
        System.out.println("The text is enabled");
        	else
        System.out.println("The text is disabled");	
        		
        
	}

}
