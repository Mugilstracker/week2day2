package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().fullscreen();
	
	driver.findElement(By.id("email")).sendKeys("8940911359");
	driver.findElement(By.id("pass")).sendKeys("Mugil@1998");
	driver.findElement(By.id("loginbutton")).click();
}

}
