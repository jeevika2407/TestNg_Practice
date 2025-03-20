package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");

        WebElement ele1 = driver.findElement(By.xpath("//input[@id='alert1']"));
        ele1.click();
        String alert1 = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println("The text in alert: " + alert1);

        WebElement ele2 = driver.findElement(By.xpath("//input[@id='prompt']"));
        ele2.click();
        driver.switchTo().alert().sendKeys("prompt text");
        driver.switchTo().alert().accept();

        WebElement ele3 = driver.findElement(By.xpath("//input[@id='confirm']"));
        ele3.click();
        String alert2 = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println("The text in alert: " + alert2);

        driver.quit();
    }
}
