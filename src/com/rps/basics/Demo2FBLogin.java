package com.rps.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("hello123456644@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcom2233");
		
		//click on login
		driver.findElement(By.name("login")).click();

	}

}
