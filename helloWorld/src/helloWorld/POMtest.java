package helloWorld;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class POMtest {
	
	
	@Test
	public void verifyApplicationTitle()
	{
		//WebDriver driver= new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\Documents\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.weightwatchers.com/us/");
		String my_title = driver.getTitle();
		
		System.out.println("Title is" +my_title);
		
		String expected_title = "Weight Loss Program, Recipes & Help | Weight Watchers";
		Assert.assertEquals(my_title, expected_title);
		
		System.out.println("Test Completed");
				
				
	}
	
	
	@Test
	public void verifyMeetingTitle()
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\Documents\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.weightwatchers.com/us/");
		
		driver.findElement(By.linkText("Find a Meeting")).click();
				
		String meeting_title = driver.getTitle();
		
		
		System.out.println("Title is" +meeting_title);
		
		//String expected_meetingtitle = "Get Schedules & Times Near You";
		//Assert.assertEquals(meeting_title, expected_meetingtitle);
	//System.out.println("Test Completed");
	
	
	}
	
	
	@Test
	public void verifySearchResult()
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\Documents\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.weightwatchers.com/us/");
		
		driver.findElement(By.linkText("Find a Meeting")).click();
		
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
	
			
		driver.findElement(By.xpath("//input[@id='meetingSearch']//following::button[1]")).click();//search button clicked
		
			
		driver.findElement(By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']")).click();
		
				
		
		String Fstsearch_title = driver.getTitle();
		
		System.out.println("search_title "+Fstsearch_title);
		
		
	//	System.out.println("SecondAddress "+Text2);
		
		
		
	
	
	}
	
	
	@Test
	public void verifyText()
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\Documents\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.weightwatchers.com/us/");
		
		driver.findElement(By.linkText("Find a Meeting")).click();
		
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
	
					
		
		driver.findElement(By.xpath("//input[@id='meetingSearch']//following::button[1]")).click();//search button clicked
		
		//driver.findElement(By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']")).click();
		
		
		String Text1 = driver.findElement(By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']")).getText();
		
			
		driver.findElement(By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']")).click();
		
				
		
		
		
		
		//driver.findElement(By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']")).click();//firstsearch click
		
		
		//String Text1 = driver.findElement(By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']")).getText();
		
		//driver.findElement(By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']")).click();//firstsearch click
		
    //   String Text2 = driver.findElement(By.className("location-address")).getText();
		
				
		//System.out.println("search_title "+Text1);
		
				
		
		
		
		
		System.out.println("FirstAddress "+Text1);
		//System.out.println("SecondAddress "+Text2);
		
		
		System.out.println("Test Completed");
	
	
	}
	
	
	

}


