package weeklyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykka {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'oreal paris",Keys.ENTER);
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Type']")).click();
		
		
		
	}

}
