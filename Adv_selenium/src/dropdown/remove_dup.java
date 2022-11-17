package dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class remove_dup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///C:/Users/sunny/Desktop/selenium%20html%20codes/dropdown2_multi.html");
		Thread.sleep(8000);
		WebElement dd = dr.findElement(By.id("name"));
		Select sle=new Select(dd);
		if(sle.isMultiple())
		{
			System.out.println("it is multi select dropdown");
			sle.selectByIndex(1);
			Thread.sleep(5000);
			sle.selectByValue("7");
			Thread.sleep(5000);
			sle.selectByIndex(5);
			Thread.sleep(5000);
			sle.selectByVisibleText("alia");
			List<WebElement> options = sle.getOptions();
			TreeSet<String> treeset=new TreeSet<String>();
			for(int i=0;i<options.size();i++)
			{
				WebElement option = options.get(i);
				String text = option.getText();
				treeset.add(text);
			}
			for(String print:treeset)
			{
				
				System.out.println(print);
			}			
		}
		else
		{
			System.out.println("it is single select dropdown");
		}
		
		
		
		
		
	}

}
