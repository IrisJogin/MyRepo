package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_KeyBoard_Mouse {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();

		Actions obj = new Actions(driver);

		// Double Click
		WebElement doubleclickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		obj.doubleClick(doubleclickButton).perform();

		// Right click button

		WebElement rightclickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		obj.contextClick(rightclickButton).perform();

		// Mouse Hover

		WebElement mouseHover = driver.findElement(By.xpath("//button[text()='Click Me']"));
		obj.moveToElement(mouseHover).perform();

		// KeyBoard Events

		obj.sendKeys(Keys.ARROW_LEFT).perform();
		obj.sendKeys(Keys.ARROW_RIGHT).perform();
		// obj.sendKeys(Keys.ARROW_RIGHT).perform();

	}

}
