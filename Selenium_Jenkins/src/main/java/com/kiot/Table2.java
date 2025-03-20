package com.kiot;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        
        List<WebElement> head = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        for (WebElement h : head) {
            System.out.print(h.getText() + " ");
        }
        System.out.println();
        

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        int rowCount = rows.size();

        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
        int colCount = cols.size();
        
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= colCount; j++) {
                WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
                System.out.print(cell.getText()+" ");
            }
            System.out.println();
        }

        driver.quit();
    }
}
