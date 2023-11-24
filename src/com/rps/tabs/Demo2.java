package com.rps.tabs;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//click on facebook icon
		driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]")).click();
		
		//switch to second tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
		driver.findElement(By.name("email")).sendKeys("heelo");
		//enter password
		//click login
		
		driver.close(); //check which tab is closed
		
		driver.switchTo().window(windows.get(0));
		//print the title
		System.out.println(driver.getTitle());
		
		driver.quit(); 
		
		
	}

}
