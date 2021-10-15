package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\tina\\softesting\\DayOne\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	String t=driver.getTitle();
	System.out.println(t);
	String u=driver.getCurrentUrl();
	System.out.println(u);
	
	
}
}
