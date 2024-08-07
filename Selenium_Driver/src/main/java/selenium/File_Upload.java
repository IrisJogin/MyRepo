package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Upload {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();

		WebElement fileUploadElement = driver.findElement(By.id("uploadfile_0"));

		Actions objActions = new Actions(driver);
		objActions.moveToElement(fileUploadElement).click().perform();

		StringSelection ss = new StringSelection("/home/iris/Desktop/FileUpload.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();
		robot.delay(50);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// WebElement

		// WebElement submit=driver.findElement(By.id("submitbutton"));
		// submit.click();

		// fileUploadElement.sendKeys("/home/iris/Desktop/FileUpload.docx");

	}

}
