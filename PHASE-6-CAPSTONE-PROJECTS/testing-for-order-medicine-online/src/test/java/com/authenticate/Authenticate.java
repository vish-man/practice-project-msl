package com.authenticate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Authenticate {
		
	    public WebDriver driver;
	    
	    @BeforeMethod
	    public void startbrowser()
	    {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();    
	    }
	    
	    @Test(priority='1')
		public void TestMedicareSignupPage() throws InterruptedException
	    {
	        driver.get("http://localhost:8080/order-medicine-online/signup.jsp");
	        
	        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

	        driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[1]")).sendKeys("jack");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[2]")).sendKeys("jack@mail.com");
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[3]")).sendKeys("1234567897");
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("(/html/body/div/div[1]/form/select/option[2])")).click();
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[4]")).sendKeys("snake");
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[5]")).sendKeys("584");
		    Thread.sleep(1000);

		    driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[6]")).click();

       }
	    
	    @Test(priority='2')
	    public void TestMedicareLoginPage() throws InterruptedException
	    {
	        driver.get("http://localhost:8080/order-medicine-online/login.jsp");
	        
	        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

	        driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[1]")).sendKeys("vishwa@mail.com");
		    Thread.sleep(1000);
		    
	        driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[2]")).sendKeys("654");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[3]")).click();
		    Thread.sleep(3000);

	    }
	    
	    @AfterMethod
	        public void closeBrowser()
	        {
	            driver.close();
	        }
	}

	


