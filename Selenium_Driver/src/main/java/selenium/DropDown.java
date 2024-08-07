package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();

		int i;

		// Select class issued ,3 ways to select dropdown values.
		// visible text, index, values

		WebElement dropdownSelect = driver.findElement(By.id("single-input-field"));
		Select obj = new Select(dropdownSelect);
		obj.selectByIndex(1);
		obj.selectByVisibleText("Yellow");
		obj.selectByValue("Green");

		WebElement selectedelement = obj.getFirstSelectedOption();
		String selectedelementBy = selectedelement.getText();
		System.out.println(selectedelementBy);

		// multiselect

		WebElement multSelect = driver.findElement(By.id("multi-select-field"));
		Select mulObj = new Select(multSelect);
		for (i = 0; i < 3; i++) {

			mulObj.selectByIndex(i);
		}
		List<WebElement> colors = mulObj.getAllSelectedOptions();
		int j;
		for (j = 0; j < colors.size(); j++) {

			System.out.println(colors.get(j).getText());
		}

	}

}
