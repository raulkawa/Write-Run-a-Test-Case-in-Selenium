package SelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	// Name: Rahul Shailesh Kawa (C0907637)
	
	public static void main(String[] args) throws InterruptedException {
	// Set the path to the ChromeDriver executable 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umesh\\Documents\\eclipse\\SeleniumDemo\\ChDriver\\chromedriver.exe");       
	WebDriver driver = new ChromeDriver();   // Create an instance of the ChromeDriver
	
	driver.get("https://login.yahoo.com/?lang=en-US&src=ym&done=https%3A%2F%2Fmail.yahoo.com%2F&add=1"); driver.manage().window().maximize();
	driver.findElement(By.id("login-username")).sendKeys("rahulkawa95@yahoo.com");
	Thread.sleep(3000);
	
	driver.findElement(By.className("pure-button")).click();
	Thread.sleep(2000);
	
	String at =  driver.getTitle(); 
	String et = "yahoo";

	System.out.println(at);
	driver.close();
	
	if(at.equalsIgnoreCase(et)) {
		System.out.println("Test Successful"); 
	}
	else {
		System.out.println("Test Failure");
	}
	
	}
}
