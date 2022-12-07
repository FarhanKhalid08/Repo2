package test2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	public static WebDriver driver;
public static void main (String[] args) {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Alert alert= driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if(text.equals("Please enter a valid user name")) {
			alert.accept();
		}else {
			alert.dismiss();
		}
         driver.findElement(By.id("login1")).sendKeys("Farhankhalid920@hotmail.com");
         driver.findElement(By.id("password")).sendKeys("subhan");
         driver.quit();
		
	}

}
