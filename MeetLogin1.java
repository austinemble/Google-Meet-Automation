package Codes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Action;

public class MeetLogin1 {
	Thread thread = new Thread();
	public static void main(String[] args) throws InterruptedException, AWTException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Meet Login ***");
		System.out.println("1. Engineering Mathematics-IV");
		System.out.println("2. Computer Network and Network Design");
		System.out.println("3. Operating System");
		System.out.println("4. Automata Theory");
		System.out.println("5. Computer Organization and Architecture");
		System.out.println("6. Python Lab");
		System.out.println("Enter your option:");
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1:
			EM4();
			break;
		case 2:
			CompsNet();
			break;
			
		case 3:
			OS();
			break;
			
		case 4:
			Automata();
			break;
		case 5:
			COA();
			break;
			
		case 6:
			PL();
			
		default:
			break;
		}
		// TODO Auto-generated method stub

	}

	private static void EM4() throws InterruptedException, AWTException 
	{
		// TODO Auto-generated method stub
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
		Thread thread = new Thread();
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")) == null)
		{
			System.out.println("Email");
			WebElement email =driver.findElement(By.id("Email"));
			email.sendKeys("<Enter Email here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email here>");
			email1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			thread.sleep(2000);
			
		}
		thread.run();// Thread resumed
		System.out.println("Thread run");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Password time!!!!");
		// Password entered
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		password.sendKeys("<Enter Password here>");
		password.sendKeys(Keys.ENTER);// Enter key
		System.out.println("Password entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Enter meeting ID
		System.out.println("Meeting ID");
		driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div/div[2]/div[2]/div[2]/div/c-wiz/div[1]/div/div/div[1]/div")).click();
		WebElement meetID=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/div/div[2]/div[1]/div[1]/input"));
		meetID.sendKeys("seitaem");
		System.out.println("ID Entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		thread.sleep(2000);
		thread.run();
		meetID.sendKeys(Keys.ENTER);
		System.out.println("Key Enter");
		
		thread.sleep(7000);
		thread.run();
		
		
		thread.sleep(5000);
		System.out.println("Thread slept");
		thread.run();
		System.out.println("thread running");
		
		
		
	
		Robot robo = new Robot();
		thread.sleep(5000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_ENTER);
		thread.sleep(1000);
		thread.run();
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div[3]/div/span/span")).click();
		thread.sleep(2000);
		thread.run();
		
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
		
		thread.sleep(3900000);
		driver.close();
	}
	

	private static void CompsNet() throws InterruptedException, AWTException 
	{
		// TODO Auto-generated method stub

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
		Thread thread = new Thread();
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")) == null)
		{
			System.out.println("Email");
			WebElement email =driver.findElement(By.id("Email"));
			email.sendKeys("<Enter Email here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email here>");
			email1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			thread.sleep(2000);
			System.out.println("Thread slept");// Thread slept due to password enter issues 
			
			
			
		}
		thread.run();// Thread resumed
		System.out.println("Thread run");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Password time!!!!");
		// Password entered
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		password.sendKeys("<Enter Password here>");
		password.sendKeys(Keys.ENTER);// Enter key
		System.out.println("Password entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Enter meeting ID
		System.out.println("Meeting ID");
		driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div/div[2]/div[2]/div[2]/div/c-wiz/div[1]/div/div/div[1]/div")).click();
		WebElement meetID=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/div/div[2]/div[1]/div[1]/input"));
		meetID.sendKeys("seitacn");
		System.out.println("ID Entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		thread.sleep(2000);
		thread.run();
		meetID.sendKeys(Keys.ENTER);
		System.out.println("Key Enter");
		
		thread.sleep(2000);
		System.out.println("Thread slept");
		thread.run();
		System.out.println("thread running");
		
		thread.sleep(5000);
		thread.run();
	
		Robot robo = new Robot();
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_ENTER);
		thread.sleep(1000);
		thread.run();
		
		thread.sleep(5000);
		thread.run();
		
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
		
		thread.sleep(3900000);
		driver.close();
		
		
		
	
	}

	private static void OS() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
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
		Thread thread = new Thread();
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")) == null)
		{
			System.out.println("Email");
			WebElement email =driver.findElement(By.id("Email"));
			email.sendKeys("<Enter Email here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email here>");
			email1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			thread.sleep(2000);
			System.out.println("Thread slept");// Thread slept due to password enter issues 
			
			
			
		}
		thread.run();// Thread resumed
		System.out.println("Thread run");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Password time!!!!");
		// Password entered
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		password.sendKeys("<Enter Password here>");
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
		thread.sleep(2000);
		thread.run();
		meetID.sendKeys(Keys.ENTER);
		System.out.println("Key Enter");
		
		thread.sleep(5000);
		System.out.println("Thread slept");
		thread.run();
		System.out.println("thread running");
		
		
		//alert.dismiss();
		
		thread.sleep(5000);
		thread.run();
	
		Robot robo = new Robot();
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_ENTER);
		thread.sleep(1000);
		thread.run();
		
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
		
		thread.sleep(3900000);
		driver.close();
	
	}

	private static void Automata() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
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
		Thread thread = new Thread();
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")) == null)
		{
			System.out.println("Email");
			WebElement email =driver.findElement(By.id("Email"));
			email.sendKeys("<Enter Email here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email here>");
			email1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			thread.sleep(2000);
			System.out.println("Thread slept");// Thread slept due to password enter issues 
			
			
			
		}
		thread.run();// Thread resumed
		System.out.println("Thread run");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Password time!!!!");
		// Password entered
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		password.sendKeys("<Enter Password here>");
		password.sendKeys(Keys.ENTER);// Enter key
		System.out.println("Password entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Enter meeting ID
		System.out.println("Meeting ID");
		driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div/div[2]/div[2]/div[2]/div/c-wiz/div[1]/div/div/div[1]/div")).click();
		WebElement meetID=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/div/div[2]/div[1]/div[1]/input"));
		meetID.sendKeys("seitaat");
		System.out.println("ID Entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		thread.sleep(2000);
		thread.run();
		meetID.sendKeys(Keys.ENTER);
		System.out.println("Key Enter");
		
		thread.sleep(5000);
		System.out.println("Thread slept");
		thread.run();
		System.out.println("thread running");
		
		
		//alert.dismiss();
		
		thread.sleep(5000);
		thread.run();
	
		Robot robo = new Robot();
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_ENTER);
		thread.sleep(1000);
		thread.run();
		
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
		
		thread.sleep(3900000);
		driver.close();
	
	}

	private static void COA() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
 

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		Thread thread = new Thread();
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")) == null)
		{
			System.out.println("Email");
			WebElement email =driver.findElement(By.id("Email"));
			email.sendKeys("<Enter Email here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email here>");
			email1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			thread.sleep(2000);
			System.out.println("Thread slept");// Thread slept due to password enter issues 
			
			
			
		}
		thread.run();// Thread resumed
		System.out.println("Thread run");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Password time!!!!");
		// Password entered
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		password.sendKeys("<Enter Password here>");
		password.sendKeys(Keys.ENTER);// Enter key
		System.out.println("Password entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Enter meeting ID
		System.out.println("Meeting ID");
		driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div/div[2]/div[2]/div[2]/div/c-wiz/div[1]/div/div/div[1]/div")).click();
		WebElement meetID=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/div/div[2]/div[1]/div[1]/input"));
		meetID.sendKeys("seitacoa");
		System.out.println("ID Entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		thread.sleep(2000);
		thread.run();
		meetID.sendKeys(Keys.ENTER);
		System.out.println("Key Enter");
		
		thread.sleep(5000);
		System.out.println("Thread slept");
		thread.run();
		System.out.println("thread running");
		
		
		//alert.dismiss();
		
		thread.sleep(5000);
		thread.run();
	
		Robot robo = new Robot();
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_ENTER);
		thread.sleep(1000);
		thread.run();
		
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
		thread.sleep(3900000);
		driver.close();
	
	}

	private static void PL() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
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
		Thread thread = new Thread();
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")) == null)
		{
			System.out.println("Email");
			WebElement email =driver.findElement(By.id("Email"));
			email.sendKeys("<Enter Email here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email here>");
			email1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			thread.sleep(2000);
			
		}
		thread.run();// Thread resumed
		System.out.println("Thread run");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("Password time!!!!");
		// Password entered
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
		password.sendKeys("<Enter Password here>");
		password.sendKeys(Keys.ENTER);// Enter key
		System.out.println("Password entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Enter meeting ID
		System.out.println("Meeting ID");
		driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div/div[2]/div[2]/div[2]/div/c-wiz/div[1]/div/div/div[1]/div")).click();
		WebElement meetID=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/div/div[2]/div[1]/div[1]/input"));
		meetID.sendKeys("seitapl");
		System.out.println("ID Entered");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		thread.sleep(2000);
		thread.run();
		meetID.sendKeys(Keys.ENTER);
		System.out.println("Key Enter");
		
		thread.sleep(5000);
		System.out.println("Thread slept");
		thread.run();
		System.out.println("thread running");
		
		
		//alert.dismiss();
		
		thread.sleep(5000);
		thread.run();
	
		Robot robo = new Robot();
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_TAB);
		thread.sleep(1000);
		thread.run();
		robo.keyPress(KeyEvent.VK_ENTER);
		thread.sleep(1000);
		thread.run();
		
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
		thread.sleep(3900000);
		driver.close();
		
	}
}
