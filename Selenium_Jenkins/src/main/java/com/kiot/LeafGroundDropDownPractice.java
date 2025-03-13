package com.kiot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundDropDownPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.leafground.com/select.xhtml");

      
        WebElement dropdown = driver.findElement(By.xpath("//div[contains(@class, 'ui-selectonemenu-trigger')]"));
        dropdown.click();

     
        List<WebElement> list1 = driver.findElements(By.xpath("//ul[contains(@class, 'ui-selectonemenu-items')]/li"));

        System.out.println("Dropdown size: " + list1.size());

        for (WebElement l : list1) {
            System.out.println("The dropdown options are: " + l.getText());
        }

        
        for (WebElement option : list1) {
            if (option.getText().equals("Selenium")) {
                option.click();
                break;
            }
        }

        driver.quit();  
    }
}
