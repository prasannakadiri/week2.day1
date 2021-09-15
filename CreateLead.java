package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

//LanunchURL "http://leaftaps.com/opentaps/control/login"

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// To get the title of url and display
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("Title" + title);

		// USername
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		// Password
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");

		// Click on submit button
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();

		// click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on leads
		driver.findElement(By.linkText("Leads")).click();

		// Create leads

		driver.findElement(By.linkText("Create Lead")).click();

		// personal info

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");

		// first name and last name
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Prasanna");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muddisetty");

		// First name and last name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prasanna");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Muddisetty");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/04/2021");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2070");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Yes");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test program");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("SeleniumJava");

		// Contact number details

		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("+01");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("408");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6045625");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("111");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("xxxx");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.test.com");

		// primary address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("xyz");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Attn Name");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("add1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Cupertino");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("California");
		// Zip and postal
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("94087");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("95041");

		// GEt the first name and print it

		System.out.println("First name:" + firstName.getAttribute("value"));

		// Click on create lead button

		driver.findElement(By.className("smallSubmit")).click();

		String title2 = driver.getTitle();
		if (title2.equals("View Lead | opentaps CRM")) {
			System.out.println("Title of the page is Verified" + title2);
		} else
			System.out.println("Unexpected page loaded" + title2);

		driver.close();

	}
}
