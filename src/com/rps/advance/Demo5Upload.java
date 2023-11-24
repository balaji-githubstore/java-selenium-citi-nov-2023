package com.rps.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5Upload {

	public static void main(String[] args) {
		
		File file=new File("files/pdffile.pdf");
		
		System.out.println(file.getAbsolutePath());
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://nasscom.in/nasscom-membership");
		
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());
	
		
		

		
	}

}
