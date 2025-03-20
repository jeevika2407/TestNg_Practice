package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Table1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        
        WebElement tab= driver.findElement(By.xpath("//table[@id='table1']/thead"));
        
        List<WebElement> list = tab.findElements(By.tagName("th"));
        
        for (WebElement element : list) {
            System.out.println("The list of elements: " + element.getText());
        }
        
        List<WebElement> list1 = tab.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
        
        for (WebElement element1 : list1) {
            System.out.println("The list of elements: " + element1.getText());
        }
       
        List <WebElement> row1=tab.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]"));
        for (WebElement element1 : row1) {
            System.out.println("The list of elements: " + element1.getText());
        }
        
        WebElement tab1= driver.findElement(By.xpath(" //table[@id='table1']/tbody/tr[2]/td[3]"));
        System.out.println(tab1.getText());
        System.out.println("size is: "+row1.size());
        
        driver.quit();
    }
}
