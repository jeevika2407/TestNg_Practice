package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDrag {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01f41sxeb3bok41gsfdomivc02n8911542.node0\r\n");
		WebElement ele1=driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		Actions ac=new Actions(driver);
		ac.clickAndHold(ele1).moveByOffset(200,0).release().build().perform();
		
		
		WebElement src=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='form:drop']"));
		ac.dragAndDrop(src, dest).build().perform();
		
		
		driver.close();
	}
}