package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Login
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Lead
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("www");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("xyz");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("aaa");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("bbb");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("ccc");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdefghi@gmail.com");
		WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select 	dd = new Select(elementStateProvince);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Edit Lead
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("hello");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		
		
	}

}
