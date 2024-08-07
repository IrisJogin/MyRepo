package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();

		List<WebElement> table = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//td[1]"));

		for (int i = 0; i < table.size(); i++) {

			if (table.get(i).getText().equals("Cedric Kelly")) {

				String locator = "//table[@id='dtBasicExample']//thead//tr[" + (i + 1) + "]//td[1]";
				WebElement element = driver.findElement(By.xpath("locator"));
				System.out.println(element.getText());

			}
		}

		driver.quit();
	}

}
