package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Table {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();

		List<WebElement> tableObject = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));

		for (int i = 0; i < tableObject.size(); i++) {

			System.out.print(tableObject.get(i).getText() + "  ");
		}

		System.out.println();

		WebElement singleELement = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr//th[1]"));
		System.out.println(singleELement.getText());

		System.out.println();

		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));

		for (int j = 0; j < firstRow.size(); j++) {

			System.out.print(firstRow.get(j).getText() + "  ");

		}

		System.out.println();
		System.out.println();

		List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));

		for (int k = 0; k < firstColumn.size(); k++) {

			System.out.println(firstColumn.get(k).getText());

		}

		System.out.println();
		System.out.println();

		WebElement singleElement = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[1]"));

		System.out.println(singleElement.getText() + " ");

		driver.quit();
	}
}