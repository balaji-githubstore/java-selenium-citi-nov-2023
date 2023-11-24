package com.rps.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//click on create new account
		//findElement() --> takes only 0.5s to check the presence of element
		driver.findElement(By.linkText("Create new account")).click();
		
		//enter firstname as john
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//enter lastname as wick
		
		//19 Mar 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("19");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Mar");
//		selectMonth.selectByValue("3");
//		selectMonth.selectByIndex(2);
		
		//select year 2000
		
		//click on Custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
//		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//click on submit
		
		
		
		

	}

}
