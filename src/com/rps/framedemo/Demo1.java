package com.rps.framedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		
		//enter userid as john123
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");
		//click on continue
		//give the font based on UI for linkText and partial link text
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//come out of frame - basically main html
		driver.switchTo().defaultContent();
	}
}
