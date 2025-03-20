package com.kiot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table4 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        driver.findElement(By.id("email")).sendKeys("2k21cse020@kiot.ac.in");
        driver.findElement(By.id("password")).sendKeys("1234567");
        driver.findElement(By.id("submit")).click();

        String expectedName = "dharu m";
        List<WebElement> contactNames = driver.findElements(By.xpath("//table[@id='myTable']/tr/td[1]"));

        int i = 1;
        for (WebElement contact : contactNames) {
            if (contact.getText().equals(expectedName)) {
                List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='myTable']/tr[" + i + "]"));
                for (WebElement data : rowData) {
                    System.out.print(data.getText() + " | ");
                }
                System.out.println();
                break;
            }
            i++;
        }

        driver.quit();
    }
}
