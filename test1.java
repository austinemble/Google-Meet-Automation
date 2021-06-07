package Codes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
 public static void main(String args[]) throws AWTException, InterruptedException  {
	 COA();
	 
 }
 static void COA() throws AWTException, InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 Robot robo = new Robot();
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
	 
	 driver.get("https://apps.google.com/meet/");
	 System.out.println("meet website loaded");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 
	 
	 driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div[1]/div/span[1]/a")).click();
	 System.out.println("towards sign in page");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("<Enter Email Here>");
	 System.out.println("email inputed");
	 robo.keyPress(KeyEvent.VK_ENTER);
	 System.out.println("enter pressed");
	 robo.keyRelease(KeyEvent.VK_ENTER);
	 System.out.println("enter release");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("<Enter Password Here>");
	 System.out.println("password inputed");
	 robo.keyPress(KeyEvent.VK_ENTER);
	 System.out.println("enter pressed");
	 robo.keyRelease(KeyEvent.VK_ENTER);
	 System.out.println("enter release");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("/html/body/div[1]/c-wiz/div/div/div/div[2]/div[2]/div[2]/div/c-wiz/div[1]/div/div/div[1]/div")).click();
	 System.out.println("meeting id slot click");
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/div/div[2]/div[1]/div[1]/input")).sendKeys("seitaos");
	 System.out.println("id inputed");
	 Thread.sleep(2000);
	 robo.keyPress(KeyEvent.VK_ENTER);
	 System.out.println("enter pressed");
	 robo.keyRelease(KeyEvent.VK_ENTER);
	 System.out.println("enter release");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	 Thread.sleep(10000);
	 robo.keyPress(KeyEvent.VK_TAB);
	 robo.keyPress(KeyEvent.VK_TAB);
	 robo.keyPress(KeyEvent.VK_TAB);
	 robo.keyPress(KeyEvent.VK_ENTER);
	 System.out.println("pop up blocked");
	 Thread.sleep(5000);
	 			
	 driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/div[8]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/span/span")).click();
	 System.out.println("meting join");
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 Thread.sleep(10000);
	 
	 
	 int n=1;
	 robo.keyPress(KeyEvent.VK_TAB);
	 robo.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 robo.keyPress(KeyEvent.VK_TAB);
	 robo.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 robo.keyPress(KeyEvent.VK_TAB);
	 robo.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(1000);
	 robo.keyPress(KeyEvent.VK_ENTER);
	 robo.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(1000);
	 
	 while(n>=22)
	 {
		 robo.keyPress(KeyEvent.VK_TAB);
		 System.out.println("Tab no"+n);
		 n++;
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
	 robo.keyRelease(KeyEvent.VK_ESCAPE);
	 
	 
	 
	 
	 
	 
	 
 }
}
