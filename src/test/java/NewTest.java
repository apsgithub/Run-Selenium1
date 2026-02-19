import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import FirstPackage.FirstClass;

public class NewTest {
  @Test
  public void Test1()
  
  {
	  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
  }
  
  @Test (dependsOnMethods="Test3")
  public void Test2()
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
  }
		  
  @Test
  public void Test3()
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		Assert.assertEquals(driver.getTitle(), "Yahoo");
  }
		
}
