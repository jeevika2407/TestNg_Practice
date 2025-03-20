package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor3 {	
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.google.com");

	        WebElement searchBox = driver1.findElement(By.name("q"));
	        WebElement searchButton = driver1.findElement(By.name("btnK"));

	        sendKeysUsingJS(driver1, searchBox, "Java Programming");
	        clickUsingJS(driver1, searchButton);

//	        driver1.quit();
	    }

	    public static void sendKeysUsingJS(WebDriver driver, WebElement element, String text) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value='"+text+"'",element);
	    }

	    public static void clickUsingJS(WebDriver driver, WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", element);
	    } 
	}

