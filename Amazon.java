package project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions acts= new Actions(driver);

		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("ap_email")).sendKeys("9174666530");
		driver.findElement(By.id("continue")).submit();
		driver.findElement(By.id("ap_password")).sendKeys("Sonali@123");
		driver.findElement(By.id("signInSubmit")).submit();
		Thread.sleep(2000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sugar lipstick");
		driver.findElement(By.id("nav-search-submit-button")).submit();
        Thread.sleep(1000);

		Action ac1 = acts.keyDown(Keys.PAGE_DOWN).build();
		ac1.perform();

		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/span/div/div/div[2]/div[2]/h2/a/span")).click();
		Thread.sleep(2000);

		String str = driver.getWindowHandle();
		Set<String> str2 = driver.getWindowHandles();

		for(String win:str2) {
			if(!win.equals(str)) {
				driver.switchTo().window(win);
			
                driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div/div/form/div/div/div/div/div[4]/div/div[36]/div[1]/span/span/span/input")).click();
				Thread.sleep(1000);

				driver.findElement(By.id("nav-logo-sprites")).click();

				driver.findElement(By.id("nav-cart-count-container")).click();
				driver.quit();
				
				
		}
		}
	}
	}
	

