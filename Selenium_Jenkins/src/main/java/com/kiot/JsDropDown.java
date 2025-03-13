package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JsDropDown {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://bstackdemo.com/");
	        
        WebElement option2=driver.findElement(By.xpath("//select"));
	        JavascriptExecutor js=(JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value='highestprice'",option2);	        
	        
//	        driver.findElement(By.xpath("//select")).sendKeys("lowestprice");
	        
	        
	        driver.close();  
	}
}
