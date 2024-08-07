package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();

		WebElement checkBox = driver.findElement(By.id("gridCheck"));
		checkBox.click();
		boolean checkBox1 = checkBox.isSelected();
		System.out.println("Element visibility:" + " " + checkBox1);

		checkBox.click();
		// boolean checkBoxdisabled=checkBox.isSelected();
		System.out.println("Element visibility:" + " " + checkBox.isSelected());

		// WebElement selectAll=driver.findElement(By.xpath("//input[@value='Select
		// All']"));
		WebElement selectAll = driver.findElement(By.id("button-two"));
		selectAll.click();
		boolean enabled = selectAll.isEnabled();

		boolean displayed = selectAll.isDisplayed();

		WebElement radioButton = driver.findElement(By.id("Radio Buttons Demo"));
		radioButton.click();

		WebElement radiovalue = driver.findElement(By.xpath(""));

		// WebElement unselectAll=driver.findElement(By.xpath("//input[@value='Unselect
		// All']"));
		// unselectAll.click();
		// driver.quit();

	}

}
