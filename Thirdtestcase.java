import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thirdtestcase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,'input r4')]")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[contains(@class,'button r4')]")).click();
		driver.findElement(By.xpath("//div[@class='slds-r3']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("tasks");
		//driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']").
		driver.findElement(By.xpath("//p[@class='slds-truncate']//mark[1]")).click();
		driver.findElement(By.xpath("(//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container']//lightning-primitive-icon)[3]")).click();
		WebElement dropdown1 = driver.findElement(By.xpath("//lightning-icon[contains(@class,'slds-icon-text-default slds-m-right--x-small')]/following-sibling::span[1]"));
		driver.executeScript("arguments[0].click();", dropdown1);
		//driver.findElement(By.xpath("//span[text()='New Task']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'slds-combobox__input slds-input')]")).sendKeys("Bootcamp");
		WebElement dropdown2 = driver.findElement(By.xpath("//a[@class='select']"));
		driver.executeScript("arguments[0].click();", dropdown2);
		driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[3]")).click();
		String attribute = driver.findElement(By.xpath("(//div[@title='Bootcamp'])[2]")).getAttribute("title");
		        System.out.println(attribute);
		      if (attribute.contains("Bootcamp")) {
		           System.out.println("verfied");
		           }else {
		       System.out.println("not verfied"); }

		
		
	}

}
