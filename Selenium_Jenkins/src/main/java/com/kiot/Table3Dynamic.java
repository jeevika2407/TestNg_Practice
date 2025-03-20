package com.kiot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3Dynamic {

public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("2k21cse020@kiot.ac.in");
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("1234567");
		WebElement sub=driver.findElement(By.xpath("//button[@id='submit']"));
		sub.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        List<WebElement> li=driver.findElements(By.xpath("//table[@id='myTable']/tr[1]"));
        for(WebElement l:li) {
        	System.out.println(l.getText()+" ");
        }
        
	}
}


