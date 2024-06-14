package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
			 driver.get("https://en-gb.facebook.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
	         driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gokila");
	         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Karthikeyan");
	         driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]")).sendKeys("8870429410");
	         driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("@2000");
	         WebElement dateofbirth = driver.findElement(By.name("birthday_day"));
	         Select dob = new Select(dateofbirth);
	         dob.selectByVisibleText("10");
	         WebElement dateofmonth = driver.findElement(By.name("birthday_month"));
	         Select month = new Select(dateofmonth);
	         month.selectByVisibleText("Jan");
	         WebElement dateofyear = driver.findElement(By.name("birthday_year"));
	         Select year = new Select(dateofyear);
	         year.selectByVisibleText("2000");
	         driver.findElement(By.xpath("//input[@value='1']")).click();
	         Thread.sleep(2000);
	         driver.close();
	}
}
