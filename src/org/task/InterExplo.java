package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InterExplo {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "D:\\tina\\softesting\\DayOne\\driver\\IEDriverServer.exe");
	WebDriver driver =new InternetExplorerDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
String t=driver.getTitle();
System.out.println(t);
String u=driver.getCurrentUrl();
System.out.println(u);


}
}
