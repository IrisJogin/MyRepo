package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
			driver.manage().window().maximize();

			WebElement alertButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
			alertButton.click();

			// driver.switchTo().alert().accept(); // to accept the alert.

			Alert alert = driver.switchTo().alert();

			String text = alert.getText(); // to get text from alert box
			System.out.println(text); // to print alert text
			Thread.sleep(1000);
			alert.accept();

			WebElement alertButton1 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
			alertButton1.click();

			alert.dismiss(); // to click [Cancel] button

			WebElement promtButton = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
			promtButton.click();

			alert.sendKeys("Johan");
			// alert.accept();

		}


}
