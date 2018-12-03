package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jspider\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://my.monsterindia.com/create_account.html?r=1481333332");
		d.findElement(By.id("wordresume")).sendKeys("C:\\Users\\Jspider\\Desktop\\Mohammed Umair resume 23.docx");
	}

}
