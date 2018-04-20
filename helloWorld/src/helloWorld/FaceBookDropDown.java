package helloWorld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDown {
	
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\Documents\\driver\\chromedriver.exe");
					
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		
		Select month_dd = new Select(month_dropdown);
		
	    List<WebElement> month_list= month_dd.getOptions();
	    
	    int total_month = month_list.size();
	    System.out.println(total_month);
	    ArrayList<String> name = new ArrayList<String>();
	    
	    for (WebElement ele:month_list)
	    {
	    	
	    	
	    	String month_name = ele.getText();
	    	
	    	  	
	    	
	    		    	
	    	name.add(month_name);
	    	
	    	
	    	System.out.println(name);
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    
	   // Arrays.equals(month_list, name);
	    
	    
		//month_dd.selectByIndex(3);
		//Thred.sleep(3000);
		//month_dd.selectByValue("10");
		
		//month_dd.selectByVisibleText("Aug");
		 
		//WebElement selected_value = month_dd.getFirstSelectedOption();
		
		//System.out.println("After Selection selected value is " +selected_value.getText());
		
		
		
		
	}
		
		
		
	
	
	
	

}
