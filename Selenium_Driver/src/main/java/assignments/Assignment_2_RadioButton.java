package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2_RadioButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();

		WebElement radioButton = driver.findElement(By.id("inlineRadio2"));
		radioButton.click();

		WebElement button = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		button.click();

	}

}
