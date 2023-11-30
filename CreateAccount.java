package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		System.out.println(crmsfa.getText());
		crmsfa.click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		WebElement x = driver.findElement(By.xpath("//input[@id='accountName']"));
		x.sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		industry.selectByValue("IND_SOFTWARE");
		Select ownership = new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		ownership.selectByVisibleText("S-Corporation");
		Select source = new Select(driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		source.selectByValue("LEAD_EMPLOYEE");
		Select mc = new Select(driver.findElement(By.xpath("//select[@id='marketingCampaignId']")));
		mc.selectByIndex(5);
		Select state = new Select(driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		state.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement Account = driver.findElement(By.xpath("//tbody/tr/td[2]/span[@class='tabletext']"));
		String a = Account.getText();
		System.out.println(a);
		driver.close();
	}

}
