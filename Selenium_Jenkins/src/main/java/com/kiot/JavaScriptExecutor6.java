package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor6 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        
        WebElement fname = driver.findElement(By.name("firstname"));
        sendKeysUsingJs(driver, fname, "jeevika");
        
        WebElement lname = driver.findElement(By.name("lastname"));
        sendKeysUsingJs(driver, lname, "balaji");
        
        WebElement email = driver.findElement(By.name("email"));
        sendKeysUsingJs(driver, email, "2k21cse001@gmail.com");
        
        WebElement telephone = driver.findElement(By.name("telephone"));
        sendKeysUsingJs(driver, telephone, "0000099999");
        
        WebElement pwd=driver.findElement(By.name("password"));
        sendKeysUsingJs(driver,pwd,"jeev");
        
        WebElement cpwd=driver.findElement(By.name("confirm"));
        sendKeysUsingJs(driver,cpwd,"jeev");
        
        WebElement c=driver.findElement(By.name("agree"));
        c.click();
        WebElement cc=driver.findElement(By.xpath("//input[@type='submit']"));
        cc.click();
        
//        driver.quit();
    }
    
    public static void sendKeysUsingJs(WebDriver driver, WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "'", element);
    }
}
