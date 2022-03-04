//Assignment 1:
package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a [@role='button'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input")).sendKeys("Ramya");
		//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true" placeholder="" aria-label="Surname" id="u_a_d_gs">
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("N");
		//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" placeholder="" aria-label="Mobile number or email address" id="u_a_g_W/">
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("ramya19.nallappan@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("ramya19.nallappan@gmail.com");
		//<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__" id="password_step_input" aria-required="true" placeholder="" aria-label="New password" aria-autocomplete="list" aria-describedby="js_2ny" aria-invalid="true">
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("test123");;
		//<select aria-label="Day" name="birthday_day" id="day" title="Day" class="_9407 _5dba _9hk6 _8esg" aria-describedby="js_33j"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28" selected="1">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>
		WebElement elementDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dd1 = new Select(elementDate);
		dd1.selectByIndex(18);
		WebElement elementDay = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dd2 = new Select(elementDay);
		dd2.selectByValue("8");
		WebElement elementYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd3 = new Select(elementYear);
		dd3.selectByVisibleText("1983");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

	}

}
