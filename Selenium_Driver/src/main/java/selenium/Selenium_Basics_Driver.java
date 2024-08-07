package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics_Driver {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://qa.kwiksetunite.com/home/login"); //wait till page fully
		// loaded
		driver.navigate().to("https://qa.kwiksetunite.com/home/login");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		// driver.manage().window().minimize();
		// driver.manage().window().maximize();

		String src = driver.getPageSource(); // to get page source
		System.out.println(src);

		// driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		// driver.quit();
		// driver.close();

		// driver.close and driver .quit have same purpose --to close the browser.
		// driver.close(); --- Current browser will be closed. current focus
		// driver.quit() -- entire windows will be closed.
	}

}
