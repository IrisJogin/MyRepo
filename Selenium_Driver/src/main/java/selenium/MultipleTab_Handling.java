package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTab_Handling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		;
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String childWindow : allWindows) {

			if (!parentWindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);

				WebElement childTabHeading = driver.findElement(By.id("sampleHeading"));
				System.out.println(childTabHeading.getText());

			}
		}
		driver.switchTo().window(parentWindow);

	}

}
