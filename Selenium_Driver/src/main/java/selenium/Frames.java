package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();

		// driver.switchTo().frame("frame1"); // Switching to frame --- Step I

		WebElement iframeElement = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);

		WebElement frameText = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameText.getText()); // Action-- Reading text -- Step II

		driver.switchTo().parentFrame();// switch to parent frame -- Step III

		/* driver.switchTo().defaultContent(); switch to parent frame */

	}

}
