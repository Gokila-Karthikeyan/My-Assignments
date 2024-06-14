package week2.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundCheckbox {
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
			
		 driver.get("https://leafground.com/checkbox.xhtml");
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   
        driver.findElement(By.xpath("//span[text()='Basic']")).click();

        
        driver.findElement(By.xpath("//span[text()='Ajax']")).click();

        
        String checkedMessage = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
        if (checkedMessage.equals("Checked")) {
            System.out.println("Expected message 'Checked' is displayed.");
        } else {
            System.out.println("Expected message is not displayed.");
        }
         driver.findElement(By.xpath("//label[.='Java']")).click();
         driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		 String stateVal=driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p")).getText();
		 System.out.println("Chosen Tri-State option is:" +stateVal);
		 driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch ui-widget')]//div)[2]")).click();
		 String toggle=driver.findElement(By.xpath("//span[text()='Checked']")).getText(); 
		 System.out.println("expected msg is:" + toggle);
		 boolean status = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled();
		 System.out.println(status);
		 if(status) {
	    	 System.out.println("Checkbox is enabled");
	     }
	     else {
	    	 System.out.println("Checkbox is disabled");
	     }
        driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']")).click();
	        List<WebElement> cityCheckboxes = driver.findElements(By.xpath("//label[contains(@for,'cities')]/input"));
	        for (WebElement checkbox : cityCheckboxes) {
	            checkbox.click();
	        }
        Thread.sleep(3000);
        driver.quit();
    }
}