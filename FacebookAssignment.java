package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bala");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ganesh.bala844@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password@123");
		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByIndex(4);
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Mar");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByValue("1994");
		driver.findElement(By.xpath("//span[@data-type='radio']/span[2]/label")).click();
		driver.close();
	}

}
