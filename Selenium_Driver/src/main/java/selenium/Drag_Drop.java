package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();

		WebElement sourceElement = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));

		WebElement targetElement = driver.findElement(By.id("mydropzone"));

		Actions actionobj = new Actions(driver);
		actionobj.dragAndDrop(sourceElement, targetElement).perform();
	}

}
