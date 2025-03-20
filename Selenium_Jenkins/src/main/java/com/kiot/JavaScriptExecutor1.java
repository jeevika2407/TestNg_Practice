package com.kiot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('welcome')");

	}
}
