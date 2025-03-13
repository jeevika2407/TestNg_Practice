package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		Actions action=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//a[@href='http://jqueryui.com/']"));
		action.keyDown(Keys.CONTROL).moveToElement(ele).click().keyUp(Keys.CONTROL).build().perform();
		
	}

}
