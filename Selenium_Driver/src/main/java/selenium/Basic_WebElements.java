package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@id=\"loginform-username\"]"));
		userName.sendKeys("Iris");

		// WebElement
		// passWord=driver.findElement(By.xpa9th("//input[@id='loginform-password']"));
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("Test@123");

		// userName.clear(); // to clear the field value.

		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();

		String fontSize = login.getCssValue("font-size");
		System.out.println(fontSize);

		String fontFamily = login.getCssValue("font-family");
		System.out.println(fontFamily);

		String backgroundColor = login.getCssValue("background-color");
		System.out.println(backgroundColor);

		String attributeType = login.getAttribute("class");
		System.out.println(attributeType);

		String userNameattributeType = userName.getAttribute("class");
		System.out.println(userNameattributeType);

		String userNameattributeTyp2 = userName.getAttribute("placeholder");
		System.out.println(userNameattributeTyp2);

		String userNameattributeTyp3 = userName.getTagName();
		System.out.println(userNameattributeTyp3);

		// boolean userNameattributeTyp4=driver.getAttribute("aria-invalid");

		String loginText = login.getText();
		System.out.println(loginText);

		driver.quit();

	}

}
