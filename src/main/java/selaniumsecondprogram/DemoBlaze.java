package selaniumsecondprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoBlaze {

	static String chromePath, site;
	static WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void signup() throws InterruptedException {

		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.cssSelector("input[id=sign-username]")).sendKeys("AbuthahirM");
		driver.findElement(By.xpath("//*[@id='sign-password']")).sendKeys("AbuthahirM@123");
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		driver.findElement(By.cssSelector("input[id=loginusername]")).sendKeys("AbuthahirM");
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("AbuthahirM@123");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void contact() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("input[id=recipient-email]")).sendKeys("abu@gmail.com");
		driver.findElement(By.cssSelector("input[id=recipient-name]")).sendKeys("Abuthahir");
		driver.findElement(By.id("message-text")).sendKeys("Query raising");
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void addCart() throws InterruptedException {
		driver.findElement(By.className("nav-link")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void validate() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		driver.findElement(By.id("name")).sendKeys("Abuthahir");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Bengaluru");
		driver.findElement(By.id("card")).sendKeys("Master");
		driver.findElement(By.id("month")).sendKeys("October");
		driver.findElement(By.id("year")).sendKeys("2020");
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {

		driver.close();
	}
}
