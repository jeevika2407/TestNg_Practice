package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        
        WebElement ele = driver.findElement(By.id("datepicker"));
        ele.sendKeys("08/23/2024");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        for (int i = 0; i < 3; i++) {
            js.executeScript("arguments[0].style.background='red'", ele);
            Thread.sleep(500);
            js.executeScript("arguments[0].style.background=''", ele);
            Thread.sleep(500);
        }
        driver.quit();
    }
}
