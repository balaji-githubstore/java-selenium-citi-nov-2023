package com.rps.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// click on facebook icon
		driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin.com')]")).click();

		// switch to second tab
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows);

		for (String win : windows) 
		{
			driver.switchTo().window(win);
			if (driver.getTitle().contains("LinkedIn")) {
				break; // terminates the current loop
			}
		}

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
