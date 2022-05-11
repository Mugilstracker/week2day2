package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    String title = driver.getTitle();
    System.out.println(title);
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testtree");		
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mugil");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("stracker");
    
    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select src = new Select(source);
    src.selectByVisibleText("Employee");
    WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
    Select mar = new Select(market);
    mar.selectByVisibleText("Automobile");
    WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
    Select ind = new Select(industry);
    ind.selectByVisibleText("Computer Software");
    WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
    Select own = new Select(owner);
    own.selectByVisibleText("Corporation");   
    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
    Select coun = new Select(country);
    coun.selectByVisibleText("India");
    WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    Select stat = new Select(state);
    stat.selectByVisibleText("TAMILNADU");
    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600078");
    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("18/11/1998");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mugilkk1998@gmai.com");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8098048068");
    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mani");
    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Madhu");
    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Amsath");
    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Testleaf");
    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Pazhavanthangal");
    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("600061");
    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("225");
    String firstname = driver.findElement(By.id("createLeadForm_firstName")).getText();
    System.out.println(firstname);
    driver.findElement(By.className("smallSubmit")).click();
    driver.close();
    
    
    
    
    
    

	
	
	
	
	
	
}
}
