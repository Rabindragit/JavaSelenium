package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {

	WebDriver driver =new FirefoxDriver();
		 
    driver.get("https://www.facebook.com");
    driver.findElement(By.xpath("//input[@type='submit']")).click();    		
    
   System.out.println("Page loaded sucessfully");
   
   System.out.println(driver.getTitle());
   System.out.println(driver.getCurrentUrl());

   driver.close();
	//added some comments
	}

}
