package com.kiot;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement box1 = driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement box2 = driver.findElement(By.xpath("//div[@id='box101']"));

        Actions action = new Actions(driver);
//        action.clickAndHold(box1).moveToElement(box2).release().perform();
        action.dragAndDrop(box1, box2).perform();

        String actualColor=box1.getCssValue("background-color");
        String expectedColor="rgba(0, 255, 0, 1)";
        
        if(actualColor.equals(expectedColor)) {
        	System.out.println("the color matches");
        }
        else {
        	System.out.println("color not match");
        	System.out.println("actual color: "+actualColor);
        	System.out.println("expected color: "+expectedColor);
        }
    }
}
