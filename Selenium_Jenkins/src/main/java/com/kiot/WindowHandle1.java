package com.kiot;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);

        driver.findElement(By.id("windowButton")).click();
        

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("parent window: "+allWindows);
        Iterator<String> iterator = allWindows.iterator();

        String parent = iterator.next();
        System.out.println("Window 1: " + parent);
        String child1=iterator.next();
        System.out.println("window 2:"+child1);

//        if (iterator.hasNext()) {
//            String child = iterator.next();
//            System.out.println("Window 2: " + child);
//        }

        driver.switchTo().window(child1);
        WebElement ele=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println("The text in child is: "+ele.getText());
        
        driver.switchTo().window(parent);
      
        System.out.println("The text in child is: "+driver.getTitle());
        
        driver.quit();
    }
}
