package com.trello;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pojo.PojoClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrelloClass1 {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://trello.com/en");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		driver.findElement(By.xpath("(//a[text()='Log in'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("kumarkrishnajira2022@gmail.com");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		PojoClass p=new PojoClass();
		
		//  WebElement p1 = p.getPassword();
		
		//WebElement w1 = driver.findElement(By.xpath("//input[@name='password']"));
		  Thread.sleep(6000);
		  //driver.findElement(By.xpath("//button[@id='login-submit']//parent::*//following::input//following::div")).sendKeys("Krishna@98");
		  //driver.findElement(By.xpath("//*[@id=password']")).sendKeys("Krishna@98");
		  WebElement w3 = driver.findElement(By.id("password"));
		  w3.sendKeys("Krishna@98");
	//	js.executeScript("arguments[0].setAttribute('value','Krishna@98')",p1);
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
	//	p.login.click();
		
		driver.findElement(By.xpath("//div[text()='Full Creative Task ']")).click();
		
		Actions a=new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//span[text()='Task 1']"));
		WebElement des = driver.findElement(By.xpath("(//span[text()='Add a card'])[5]"));
		a.dragAndDrop(src, des).perform();
	
		
		
		
		
	}

}
