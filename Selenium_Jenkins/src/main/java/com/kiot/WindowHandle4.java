package com.kiot;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent window: "+parent);
		
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Open']"));
		ele.click();
		
		Set<String> allWindows = driver.getWindowHandles();
//        System.out.println("parent window: "+allWindows);
        
        Iterator<String> iterator = allWindows.iterator();

        String parentWindow = iterator.next();
        String childWindow=iterator.next();
        System.out.println("parent window: "+parentWindow);
        System.out.println("child window: "+childWindow);

        driver.switchTo().window(childWindow);
       System.out.println("child window url: "+driver.getTitle());
       
       driver.switchTo().window(parentWindow);
       WebElement ele2=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
       ele2.click();
       
   	Set<String> allWindows1 = driver.getWindowHandles();
   	System.out.println("total number of windows: "+allWindows1.size());
  
//  Iterator<String> iterator1 = allWindows.iterator();
//  if (iterator1.hasNext()) {
//    String child = iterator1.next();
//    System.out.println("Window 2: " + child);
//}
//       
   	WebElement ele3=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
   	ele3.click();
   	
	}

}
