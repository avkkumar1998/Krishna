package com.pojo;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.TrelloClass1;

import net.bytebuddy.asm.Advice.Return;

public class PojoClass extends TrelloClass1 {
	
	public PojoClass() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//button[@id='login-submit']//parent::*//following::input//following::div")
	private WebElement password;
	
	
	@FindBy(xpath = "//span[text()='Log in']")
	public WebElement login;


	public WebElement getPassword() {
		return password;
	}
	
	
	

}
