package FirstPackage;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;

public class FirstClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
