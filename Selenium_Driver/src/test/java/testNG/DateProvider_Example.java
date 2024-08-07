package testNG;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.testng.annotations.DataProvider;

public class DateProvider_Example {
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		
		System.out.println(n+" \n"+s);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { { 2, "apple" }, { 5, "ball" }, { 7, "cat" } };
	}
}

/*
 * @DataProvider (name = "data-provider") public Object[][] dpMethod(){ return
 * new Object[][] {{2, 3 }, {5, 7}}; }
 */