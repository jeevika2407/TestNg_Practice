package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement blog=driver.findElement(By.id("blogsmenu"));
		
		Actions action=new Actions(driver);
		action.moveToElement(blog).perform();
		
		
		WebElement blog2=driver.findElement(By.xpath("//span[text='SeleniumByArun']"));
		action.moveToElement(blog2).click().build().perform();

	}

}
