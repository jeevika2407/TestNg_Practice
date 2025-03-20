package com.kiot;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert2 {
	public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demoqa.com/alerts");
	
	WebElement ele1=driver.findElement(By.xpath("//button[@id='alertButton']"));
	ele1.click();
	
	Alert al=driver.switchTo().alert();
	System.out.println("text is: "+al.getText());
	al.accept();
	
	WebElement ele2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerAlertButton")));
    ele2.click();
    al = wait.until(ExpectedConditions.alertIsPresent());
    System.out.println("Text is: " + al.getText());
    al.accept();
	
	WebElement ele4=driver.findElement(By.xpath("//button[@id='promtButton']"));
	ele4.click();
	String alert1 = driver.switchTo().alert().getText();
    al.accept();
    System.out.println("The text in alert: " + alert1);
	
	}
}
