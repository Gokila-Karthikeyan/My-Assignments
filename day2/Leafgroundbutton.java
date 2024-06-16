package assignment.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundbutton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		driver.findElement(By.xpath("//title[text()='Dashboard']"));
		String D=driver.getTitle();
		if(D.contains("Dashboard")) {
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Title is not verified");
		}
		driver.navigate().back();
		boolean dis= driver.findElement(By.xpath("//span[text()='Disabled']")).isSelected();
		System.out.println(dis);
		Object position= driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println("Element Position :" + position);
		WebElement Colour= driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println("Background Colour is : "+ Colour.getCssValue("background-color"));
		WebElement HeightWidth=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println("Height & Width is :" +HeightWidth.getSize());
		Thread.sleep(3000);
	}

}
