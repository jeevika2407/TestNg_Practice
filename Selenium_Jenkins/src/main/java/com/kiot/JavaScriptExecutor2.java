package com.kiot;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); 
        
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementByName('q')[0].value='Java Programming'");
//        js.executeScript("document.getElementsByName('btnK')[0].click()");
//        
//        Thread.sleep(1000);
        
//        String url = (String) js.executeScript("return document.URL;");
//        String title = (String) js.executeScript("return document.title;");
//        String domain=(String) js.executeScript("return document.domain;");
//
//        System.out.println("Current URL: " + url);
//        System.out.println("Page Title: " + title);
//        System.out.println("domain: "+domain);
        
//        public static void javascriptClick(WebDriver driver, WebElement element) {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click()", element);
//        }
        
	}
}
