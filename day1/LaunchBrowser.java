package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.id("username")).sendKeys("radhakrishnan@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Sparrow@123");
        driver.findElement(By.id("Login")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if (title.contains("Home")) {
            System.out.println("Page is verified");
        } else {
            System.out.println("Page is not verified");
        }
      
      		Thread.sleep(3000);
      		driver.close();
}

   }

        
        

        
        

       
        


