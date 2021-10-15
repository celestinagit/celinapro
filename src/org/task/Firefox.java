package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver",
"D:\\tina\\softesting\\DayOne\\driver\\geckodriver.exe" );
WebDriver driver=new FirefoxDriver();

driver.get("http://greenstech.in/selenium-course-content.html");
String t=driver.getTitle();
System.out.println(t);
String u=driver.getCurrentUrl();
System.out.println(u);
}
}
