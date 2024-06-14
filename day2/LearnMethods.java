package week3.day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMethods {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		int fullsize=Links.size();
		System.out.println(fullsize);
		for(int i=0;i<Links.size();i++) {
			String str=Links.get(i).getText();
			System.out.println(str);
		}
}

}
