package com.kiot;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/#");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);

        WebElement ele1 = driver.findElement(By.xpath("//a[@id='selenium143']"));
        ele1.click();
        
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total Windows: " + allWindows.size());

        Iterator<String> iterator = allWindows.iterator();
        
        while (iterator.hasNext()) {
            String window = iterator.next();
            driver.switchTo().window(window);
            System.out.println("Switched to window: " + window);
        }
        
        WebElement ele2 = driver.findElement(By.xpath("//a[text()='What is Selenium?']"));
        System.out.println("child window text: "+ele2.getText());
        driver.switchTo().window(parentWindow);
        WebElement ele3 = driver.findElement(By.xpath("//a[text()='Page One']"));
        System.out.println("child window text: "+ele3.getText());

        driver.quit();
    }
}
