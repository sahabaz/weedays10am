package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowser 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jspider\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.naukri.com/");
		Set<String> set = d.getWindowHandles();
		System.out.println(set);
		for(String s : set)
		{
			d.switchTo().window(s);
			if(d.getTitle().contains("ICON"))
			{
				d.close();
			}
			Thread.sleep(1000);
		}
	}

}
