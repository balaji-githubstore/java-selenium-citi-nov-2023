package com.rps.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
	
		//getCurrentUrl() and print
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		//getPageSouce() and print
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		driver.quit();
	}

}
