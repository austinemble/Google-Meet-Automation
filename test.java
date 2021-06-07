package Codes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
// import java.text.Format;
// import java.text.SimpleDateFormat;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
    public static void main(String args[]) throws InterruptedException, AWTException{
        OS();
                
    }

    private static void OS() throws InterruptedException, AWTException{
        Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
 

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Driver initiated");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		
		//Loading the website
		driver.get("https://apps.google.com/meet/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Website loaded.");
		
		//Clicks on the sign in button 
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div/span[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Sign in page loaded.");
		
		//Clicks on the email field
		Thread Thread = new Thread();
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")) == null)
		{
			System.out.println("Email");
			WebElement email =driver.findElement(By.id("Email"));
			email.sendKeys("<Enter Password Here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Password Here>");
			email1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(2000);
			System.out.println("Thread slept");// Thread slept due to password enter issues 
			
			
			
		}
		Thread.run();// Thread resumed
		System.out.println("Thread run");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Password time!!!!");
		// Password entered
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		password.sendKeys("<Enter Password Here>");
		password.sendKeys(Keys.ENTER);// Enter key
		System.out.println("Password entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Enter meeting ID
		System.out.println("Meeting ID");
		driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div/div[2]/div[2]/div[2]/div/c-wiz/div[1]/div/div/div[1]/div")).click();
		WebElement meetID=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/div/div[2]/div[1]/div[1]/input"));
		meetID.sendKeys("seitaos");
		System.out.println("ID Entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Thread.run();
		meetID.sendKeys(Keys.ENTER);
		System.out.println("Key Enter");
		
		Thread.sleep(5000);
		System.out.println("Thread slept");
		Thread.run();
		System.out.println("Thread running");
		
		
		//alert.dismiss();
		
		Thread.sleep(5000);
		Thread.run();
	
        Robot robo = new Robot();
        //robo.wait(2000);
		Thread.sleep(5000);
        Thread.run();
        
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
        Thread.run();
        //robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
        Thread.run();
        //robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
        Thread.run();
        //robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000); Thread.run();
        //robo.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
        
        for(int i =0; i<22; i++)
        { robo.keyPress(KeyEvent.VK_TAB);
            robo.keyRelease(KeyEvent.VK_TAB);
        }
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);

        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(KeyEvent.VK_DOWN);

        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(KeyEvent.VK_DOWN);

        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);

        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(KeyEvent.VK_DOWN);

        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(KeyEvent.VK_DOWN);

        robo.keyPress(KeyEvent.VK_ESCAPE);
        robo.keyPress(KeyEvent.VK_ESCAPE);
        for(int i=0; i<4; i++)
        {
            robo.keyPress(KeyEvent.VK_CONTROL);
            robo.keyPress(KeyEvent.VK_PLUS);

            System.out.println("Zoomed out "+i);

            robo.keyRelease(KeyEvent.VK_CONTROL);
            robo.keyRelease(KeyEvent.VK_PLUS);
        }
        

        

		thread.sleep(3900000);
		driver.close();
	
	
    }
    
}
