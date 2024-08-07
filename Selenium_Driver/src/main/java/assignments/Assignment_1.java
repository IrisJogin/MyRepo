package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();

		// WebElement message1 =driver.findElement(By.id("single-input-field"));
		// driver.
	}

}
