package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

		    public static void main(String[] args) throws InterruptedException {
		        
//	        WebDriverManager.chromedriver().setup(); 
		       
		        ChromeOptions option = new ChromeOptions();
		        
		        option.addArguments("--headless"); 
		        
		        WebDriver driver = new ChromeDriver(option);
		        driver.navigate().to("https://www.google.co.in");
		        driver.manage().window().maximize();
		        
		        WebElement search_box = driver.findElement(By.name("q"));
		        search_box.sendKeys("java selenium" + Keys.ENTER);
		        
		        String currentUrl = driver.getCurrentUrl();
		        String title = driver.getTitle();
		        
		        System.out.println("Title: " + title);
		        System.out.println("URL: " + currentUrl);
		        
		        driver.close();
		    }
		}


