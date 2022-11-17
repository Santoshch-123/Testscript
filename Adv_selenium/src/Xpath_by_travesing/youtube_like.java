package Xpath_by_travesing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_like
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.youtube.com/");
		Thread.sleep(8000);
		d.findElement(By.xpath("//input[@id='search']")).sendKeys("rolex entry");
		Thread.sleep(8000);
		d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(8000);
		d.findElement(By.xpath("//yt-formatted-string[.='rolex entry scene in tamil hd']")).click();
		Thread.sleep(8000);
		d.findElement(By.xpath("//yt-formatted-string[.='Share']/../../../ytd-toggle-button-renderer[1]")).click();
		Thread.sleep(10000);
		d.quit();
	}
}