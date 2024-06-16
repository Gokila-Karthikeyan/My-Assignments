package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Demosalesmanager");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
        loginButton.click();
        WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
        crmSfaLink.click();
        WebElement leadsTab = driver.findElement(By.linkText("Leads"));
        leadsTab.click();
        WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
        createLeadButton.click();
        WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
        lastName.sendKeys("Doe");
        WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
        companyName.sendKeys("ABC Company");
        WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
        title.sendKeys("Software Engineer");
        WebElement createLeadButton2 = driver.findElement(By.name("submitButton"));
        createLeadButton2.click();
        String expectedTitle = "View Lead | opentaps CRM";
        if (driver.getTitle().equals(expectedTitle)) {
            System.out.println("Title is displayed correctly: " + expectedTitle);
        } else {
            System.out.println("Title verification failed");
        }
        driver.quit();
    }

}
