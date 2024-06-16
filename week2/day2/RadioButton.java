package assignment.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean uncheck= driver.findElement(By.xpath("//label[text()='Chennai']")).isEnabled();
		System.out.println("Option is enabled :" + uncheck);
		boolean browser= driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isEnabled();
		System.out.println("Safari is already selected:"+browser);
		boolean age=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		System.out.println("Age:"+age);
		}

}
