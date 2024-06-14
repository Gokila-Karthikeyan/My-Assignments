package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchDropDown {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://leafground.com/select.xhtml");
			WebElement db=driver.findElement(By.className("ui-selectonemenu"));
			Select options=new Select(db);
			options.selectByIndex(4);
			Thread.sleep(3000);
		}

}
