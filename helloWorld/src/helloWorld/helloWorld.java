package helloWorld;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class helloWorld {
	int temp;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\Documents\\driver\\chromedriver.exe");
 //always put this 
		WebDriver driver = new ChromeDriver();  // alawys put 
  
 driver.get("http://www.gcrit.com/build3/create_account.php");
 		driver.manage().window().maximize();  // maximizes te window
 		driver.findElement(By.name("gender")).click();
 		driver.findElement(By.name("firstname")).sendKeys("Sagar200");
 		driver.findElement(By.name("lastname")).sendKeys("Srhresta");
 		driver.findElement(By.name("dob")).sendKeys("12/08/2000");
 		driver.findElement(By.name("email_address")).sendKeys("ran9824@gmail.com");
 		driver.findElement(By.name("street_address")).sendKeys("8418 s 65th st");
 		driver.findElement(By.name("suburb")).sendKeys("ktm");
 		driver.findElement(By.name("postcode")).sendKeys("68124");
 		driver.findElement(By.name("city")).sendKeys("bombay");
 		driver.findElement(By.name("state")).sendKeys("NE");
 		Select dropdown = new Select(driver.findElement(By.name("country")));  // for drop down 
 		dropdown.selectByVisibleText("India");  // make sure exact word as drop down
 		driver.findElement(By.name("telephone")).sendKeys("4027079780");
 		driver.findElement(By.name("password")).sendKeys("Sagar200");
 		driver.findElement(By.name("confirmation")).sendKeys("Sagar200");
 		driver.findElement(By.id("tdb4")).click();
 		driver.findElement(By.tagName("h1")).getText();
 		if (driver.findElement(By.tagName("h1")).getText().equals("Your Account Has Been Created!")) {
 			System.out.println("successful");
 		} else {
 			
 		
 			 System.out.println("unsuccessful");
 		}
 		
 		//driver.findElement(By.name("pass")).sendKeys("Sagar200");
 		//driver.findElement(By.name("country")).sendKeys("india");
 		//		driver.findElement(By.name("gender")).click();

driver.manage().window().maximize();
	/*String imageName= driver.findElement(By.id("hplogo")).getAttribute("title");
	System.out.println(imageName);
	Thread.sleep(3000);
	
	driver.navigate().to("http://www.seleniumhq.org");
	driver.findElement(By.className("icon")).click();
	driver.navigate().to("http://www.facebook.com");
	//driver.findElement(By.name("email")).sendKeys("omahababu@hotmail.com");
*/	//driver.findElement(By.name("pass")).sendKeys("Sagar200");
	//driver.findElement(By.id("u_0_y")).click();
	//driver.close();
	// this is new practice feb 6th//
	
	//driver.navigate().to("//http://http://www.gcrit.com/build3/create_account.php?osCsid=kki4m3ovbv3jqasnjhlgrnmvf1");
	
	
	}
}


