package assignment;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		searchBox.sendKeys("bags");
		searchBox.submit();
		WebElement menfilter=driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
		menfilter.click();
		Thread.sleep(2000);
		WebElement fashionBags=driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		fashionBags.click();
		Thread.sleep(2000);
		List<WebElement>items=driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("No of items found:"+items.size());
		for (WebElement item : items) {
            System.out.println("Item: " + item.getText());
	}
	}
    
}
