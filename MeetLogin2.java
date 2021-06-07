package Codes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MeetLogin2
{
	public static String Date()
	{
		Format dateFormat = new SimpleDateFormat("EEE");
		String day = dateFormat.format(new Date());
		System.out.println(day);
		return day;
	}
	public static String Time()
	{
		LocalDateTime instance = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		return formatter.format(instance);
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		String actualTime = Time();
		String day = Date();
		System.out.println("***** MEET LOGIN *****");
		System.out.println("Time = "+actualTime);
		System.out.println("Day ="+day);
		
		System.out.println("Time parsing");
		String[] hours = actualTime.split(":");
	    int hour = Integer.parseInt(hours[0]);
	    System.out.println("Hours = "+hour);
	    int minutes = Integer.parseInt(hours[1]);
	    System.out.println("Minutes = " + minutes);
		
	    LocalTime correctTime = LocalTime.parse(actualTime);
	    Boolean time = (correctTime.isAfter(LocalTime.parse("09:55:00"))) && (correctTime.isBefore(LocalTime.parse("15:10:00")));
	    System.out.println(time);
	    
	    if((time.booleanValue()))
	    {
	    	System.out.println("Loop entered");
	    	if(day.matches("Mon"))
	    	{
	    		System.out.println("Monday");
	    		Boolean monTime1 = (correctTime.isAfter(LocalTime.parse("09:55:00"))) && (correctTime.isBefore(LocalTime.parse("11:00:00")));
	    	    System.out.println(monTime1);
	    	    Boolean monTime2 = (correctTime.isAfter(LocalTime.parse("11:00:00"))) && (correctTime.isBefore(LocalTime.parse("12:05:00")));
	    	    System.out.println(monTime2);
	    	    Boolean monTime3 = (correctTime.isAfter(LocalTime.parse("12:05:00"))) && (correctTime.isBefore(LocalTime.parse("13:10:00")));
	    	    System.out.println(monTime3);
	    	    Boolean monTime4 = (correctTime.isAfter(LocalTime.parse("13:55:00"))) && (correctTime.isBefore(LocalTime.parse("15:00:00")));
	    	    System.out.println(monTime4);
	    	    
	    	    if (monTime1.booleanValue())
	    	    {
	    	    	System.out.println("Monday 10-11");
	    	    	CompsNet();
	    	    }
	    	    
	    	    else if(monTime2.booleanValue())
	    	    {
	    	    	System.out.println("Monday 11-12");
	    	    	Automata();
	    	    }
	    	    
	    	    else if (monTime3.booleanValue())
	    	    {
	    	    	System.out.println("Monday 12-13 ");
	    	    	EM4();
	    	    }
	    	    
	    	    else if (monTime4.booleanValue())
	    	    {
	    	    	System.out.println("Monday 14-15");
	    	    	PL();
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Some error occured");
	    	    }
	    	    	
	    	    
	    		
	    	}
	    	else if(day.matches("Tue"))
	    	{
	    		System.out.println("Tuesday");
	    		
	    		System.out.println("Monday");
	    		Boolean tueTime1 = (correctTime.isAfter(LocalTime.parse("09:55:00"))) && (correctTime.isBefore(LocalTime.parse("11:00:00")));
	    	    System.out.println(tueTime1);
	    	    Boolean tueTime2 = (correctTime.isAfter(LocalTime.parse("11:00:00"))) && (correctTime.isBefore(LocalTime.parse("12:05:00")));
	    	    System.out.println(tueTime2);
	    	    Boolean tueTime3 = (correctTime.isAfter(LocalTime.parse("12:05:00"))) && (correctTime.isBefore(LocalTime.parse("13:00:00")));
	    	    System.out.println(tueTime3);
	    	    Boolean tueTime4 = (correctTime.isAfter(LocalTime.parse("13:55:00"))) && (correctTime.isBefore(LocalTime.parse("15:00:00")));
	    	    System.out.println(tueTime4);
	    	    
	    	    if (tueTime1.booleanValue())
	    	    {
	    	    	System.out.println("Tuesday 10-11");
	    	    	OS();
	    	    }
	    	    
	    	    else if(tueTime2.booleanValue())
	    	    {
	    	    	System.out.println("Tuesday 11-12");
	    	    	COA();
	    	    }
	    	    
	    	    else if (tueTime3.booleanValue())
	    	    {
	    	    	System.out.println("Tuesday 12-13 ");
	    	    	EM4();
	    	    }
	    	    
	    	    else if (tueTime4.booleanValue())
	    	    {
	    	    	System.out.println("Tuesday 14-15");
	    	    	CompsNet();
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Some error occured");
	    	    }
	    	    	
	    	}
	    	else if (day.matches("Wed"))
	    	{
	    		System.out.println("Wednesday");
	    		Boolean wedTime1 = (correctTime.isAfter(LocalTime.parse("09:55:00"))) && (correctTime.isBefore(LocalTime.parse("11:00:00")));
	    	    System.out.println(wedTime1);
	    	    Boolean wedTime2 = (correctTime.isAfter(LocalTime.parse("11:00:00"))) && (correctTime.isBefore(LocalTime.parse("12:05:00")));
	    	    System.out.println(wedTime2);
	    	    Boolean wedTime3 = (correctTime.isAfter(LocalTime.parse("12:05:00"))) && (correctTime.isBefore(LocalTime.parse("13:10:00")));
	    	    System.out.println(wedTime3);
	    	    Boolean wedTime4 = (correctTime.isAfter(LocalTime.parse("14:00:00"))) && (correctTime.isBefore(LocalTime.parse("15:00:00")));
	    	    System.out.println(wedTime4);
	    	    
	    	    if (wedTime1.booleanValue())
	    	    {
	    	    	System.out.println("Wednesday 10-11");
	    	    	OS();
	    	    }
	    	    
	    	    else if(wedTime2.booleanValue())
	    	    {
	    	    	System.out.println("Wednesday 11-12");
	    	    	CompsNet();
	    	    }
	    	    
	    	    else if (wedTime3.booleanValue())
	    	    {
	    	    	System.out.println("Wednesday 12-13 ");
	    	    	PL();
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Some error occured");
	    	    }
	    	    	
	    	}
	    	else if (day.matches("Thu"))
	    	{
	    		System.out.println("Thursday");
	    		Boolean thuTime1 = (correctTime.isAfter(LocalTime.parse("09:55:00"))) && (correctTime.isBefore(LocalTime.parse("11:00:00")));
	    	    System.out.println(thuTime1);
	    	    Boolean thuTime2 = (correctTime.isAfter(LocalTime.parse("11:00:00"))) && (correctTime.isBefore(LocalTime.parse("12:05:00")));
	    	    System.out.println(thuTime2);
	    	    Boolean thuTime3 = (correctTime.isAfter(LocalTime.parse("12:05:00"))) && (correctTime.isBefore(LocalTime.parse("13:10:00")));
	    	    System.out.println(thuTime3);
	    	    Boolean thuTime4 = (correctTime.isAfter(LocalTime.parse("14:00:00"))) && (correctTime.isBefore(LocalTime.parse("15:00:00")));
	    	    System.out.println(thuTime4);
	    	    
	    	    if (thuTime1.booleanValue())
	    	    {
	    	    	System.out.println("Thursday 10-11");
	    	    	OS();
	    	    }
	    	    
	    	    else if(thuTime2.booleanValue())
	    	    {
	    	    	System.out.println("Thursday 11-12");
	    	    	CompsNet();
	    	    }
	    	    
	    	    else if (thuTime3.booleanValue())
	    	    {
	    	    	System.out.println("Thursday 12-13 ");
	    	    	PL();
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Some error occured");
	    	    }
	    	}
	    	else if (day.matches("Fri"))
	    	{
	    		System.out.println("Friday");
	    		Boolean friTime1 = (correctTime.isAfter(LocalTime.parse("09:55:00"))) && (correctTime.isBefore(LocalTime.parse("11:00:00")));
	    	    System.out.println(friTime1);
	    	    Boolean friTime2 = (correctTime.isAfter(LocalTime.parse("11:00:00"))) && (correctTime.isBefore(LocalTime.parse("12:05:00")));
	    	    System.out.println(friTime2);
	    	    Boolean friTime3 = (correctTime.isAfter(LocalTime.parse("12:05:00"))) && (correctTime.isBefore(LocalTime.parse("13:10:00")));
	    	    System.out.println(friTime3);
	    	    Boolean friTime4 = (correctTime.isAfter(LocalTime.parse("14:00:00"))) && (correctTime.isBefore(LocalTime.parse("15:00:00")));
	    	    System.out.println(friTime4);
	    	    
	    	    if (friTime1.booleanValue())
	    	    {
	    	    	System.out.println("Wednesday 10-11");
	    	    	EM4();
	    	    }
	    	    
	    	    else if(friTime2.booleanValue())
	    	    {
	    	    	System.out.println("Wednesday 11-12");
	    	    	COA();
	    	    }
	    	    
	    	    else if (friTime3.booleanValue())
	    	    {
	    	    	System.out.println("Wednesday 12-13 ");
	    	    	Automata();
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Some error occured");
	    	    }
	    	}
	    	else
	    	{
	    		System.out.println("Weekend");
	    	}
	    	
	    }
	    else
	    {
	    	System.out.println("Holiday!!!!!!!!!!");
	    	System.exit(0);
	    }
	    
		

	}
	
	private static void EM4() throws InterruptedException, AWTException 
	{
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
			email.sendKeys("<Enter Email Here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email Here>");
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
		password.sendKeys("<Enter Password Here>");
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
		thread.sleep(10000);
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
			email.sendKeys("<Enter Email Here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email Here>");
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
		password.sendKeys("<Enter Password Here>");
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
			email.sendKeys("<Enter Email Here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email Here>");
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
			email.sendKeys("<Enter Email Here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email Here>");
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
		password.sendKeys("<Enter Password Here>");
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
			email.sendKeys("<Enter Email Here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email Here>");
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
		password.sendKeys("<Enter Password Here>");
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
		thread.sleep(5000);
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
			email.sendKeys("<Enter Email Here>");
			email.sendKeys(Keys.ENTER);
		}
		
		else
		{
			System.out.println("Email2");
			WebElement email1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			email1.sendKeys("<Enter Email Here>");
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
		password.sendKeys("<Enter Password Here>");
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
		
		driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
		thread.sleep(3900000);
		driver.close();
		
	}
}


