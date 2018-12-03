package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//a[.='Login ']")
	private WebElement login;
	
	public Pom(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login()
	{
		return login;
	}

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jspider\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/");
		Pom p = new Pom(d);
		p.username().sendKeys("jhfbdfb");
		p.password().sendKeys("skfbsdhfb");
		p.login().click();
		Thread.sleep(1000);
		p.username().sendKeys("admin");
		p.password().sendKeys("manager");
		p.login().click();
	}

}
