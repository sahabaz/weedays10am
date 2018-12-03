package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jspider\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/Jspider/Desktop/a.html");
		d.findElement(By.xpath("//input[@id='a']")).sendKeys("Test1");
		Thread.sleep(1000);
		//d.switchTo().frame(d.findElement(By.id("frame")));
		//d.switchTo().frame(0);
		d.switchTo().frame("frame");
		d.findElement(By.id("b")).sendKeys("test2");
		Thread.sleep(1000);
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//input[@id='c']")).sendKeys("Test3");
		
	}

}
