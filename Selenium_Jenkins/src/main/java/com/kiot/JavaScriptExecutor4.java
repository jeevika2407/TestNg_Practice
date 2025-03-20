package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement searchText = driver.findElement(By.xpath("//input[@name='search']"));
        WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));

        javaScriptsendKeys(driver, searchText, "HP");
        clickButton.click();

        WebElement ele2 = driver.findElement(By.xpath("//a[text()='HP LP3065']"));
        js.executeScript("history.go(0)");
        js.executeScript("window.scrollBy(0,500)");
//        js.executeScript();
        
//        driver.quit();
    }

    public static void javaScriptsendKeys(WebDriver driver, WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "';", element);
    }
}
