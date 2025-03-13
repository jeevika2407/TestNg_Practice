package com.kiot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandle3 {

	public static void main(String[] args) {		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bing.com/");
	        driver.switchTo().newWindow(WindowType.TAB);
	        driver.navigate().to("https://omayo.blogspot.com/");
	        
	        
	        driver.quit();
		}


	}
