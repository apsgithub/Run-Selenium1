import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FirstPackage.FirstClass;

public class NewTest {
  @Test (invocationCount = 2)
  public void Test1()
  
  {
	  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
  }
}
