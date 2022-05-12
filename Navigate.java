package week2day3;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.cricbuzz.com/");
	driver.manage().window().fullscreen();
	
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
}

}
