package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gokila");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Karthikeyan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Goki");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gokikarthikeyan10@gmail.com");
		WebElement State= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select S1=new Select(State);
		S1.selectByVisibleText("New York");
		    driver.findElement(By.name("submitButton")).click();
	        driver.findElement(By.linkText("Edit")).click();
	        driver.findElement(By.id("updateLeadForm_description")).clear();
	        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Best Wishes");
	        driver.findElement(By.name("submitButton")).click();
	        String title = driver.getTitle();
	        System.out.println("Title is "+ title);
	        Thread.sleep(3000);
	        }

}
