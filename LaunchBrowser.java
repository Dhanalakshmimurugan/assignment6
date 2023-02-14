package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement (By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DHANALAKSHMI");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MURUGAN");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TESTING");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("40,000,000");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9445623571");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhanalaksmimurugan2000@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("139,labour colony");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("guindy");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600032");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1407");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("DHANA");
		
		
		
		
				
	}

}