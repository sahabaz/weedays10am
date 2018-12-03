package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jspider\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/");
//		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//a[.='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(d, 2);
		wait.until(ExpectedConditions.titleContains("Enterrrrr"));
//		Thread.sleep(2000);
		d.findElement(By.xpath("//a[.='Logout']")).click();
	}

}
