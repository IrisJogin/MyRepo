package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Methods {

	public static void main(String[] args) {

		/*
		 * Three types of wait Method
		 * 
		 * 1.Implicit wait -- Once called, implicit wait will be used throughout the
		 * program till quit() is called. So it is called just after driver is
		 * initialized. 2.Explicit Wait 3.Fluent wait
		 */

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("loginform-username"));

		/* Implicit Wait - Implicit wait is an example of method overloading */

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		// Fluent Wait
		// duration of second - wait till time specified, check every time specified
		// whether element present or not

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeToBe(userName, "class", "form-control"));
		userName.sendKeys("Iris");

		/* Explicit wait - Wait until duration of seconds specified */

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(userName));

	}

}
