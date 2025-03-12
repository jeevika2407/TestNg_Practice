package com.kiot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {


		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.selenium.dev/selenium/web/formPage.html");
			driver.manage().window().maximize();
			
			Select obj=new Select(driver.findElement(By.xpath("//select[@id='multi']")));
			List<WebElement>list1=obj.getOptions();
			System.out.println("drop down size: "+list1.size());
			
			for(WebElement l:list1) {
				System.out.println("the drop down options are: "+l.getText());
			}
			obj.selectByValue("eggs");
			obj.selectByVisibleText("Onion gravy");
			
			
			Boolean multiple=obj.isMultiple();
			System.out.println("the multiple option is: "+multiple);
			
			List<WebElement> selectedOptions = obj.getAllSelectedOptions();
	        System.out.println("Selected options:");
	        for (WebElement option : selectedOptions) {
	            System.out.println(option.getText());
	        }
	        
	        List<String>optiontextList=new ArrayList<>();
	        for(WebElement option:selectedOptions) {
	        	optiontextList.add(option.getText());
	        }
	        Collections.sort(optiontextList);
	        System.out.println("Sorted list: "+optiontextList);
			
			obj.deselectByVisibleText("Eggs");
			obj.deselectAll();
			
		}

	}

