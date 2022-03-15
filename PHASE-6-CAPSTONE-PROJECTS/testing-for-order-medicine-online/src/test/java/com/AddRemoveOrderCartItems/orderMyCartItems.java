package com.AddRemoveOrderCartItems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class orderMyCartItems {
	
public WebDriver driver;
    
    @BeforeMethod
    public void startbrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();    
    }
    
    @Test(priority='1')
    public void orderMyCartItems() throws InterruptedException
    {
        driver.get("http://localhost:8080/order-medicine-online/login.jsp");
        
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[1]")).sendKeys("vish@gmail.com");
	    Thread.sleep(1000);
	    
        driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[2]")).sendKeys("12");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("(//*[@id=\"container\"])/div[1]/form/input[3]")).click();
	    Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/table/thead[1]/tr/th[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/form/div[1]/input")).sendKeys("4th gate");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("/html/body/form/div[2]/input")).sendKeys("bgm");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("/html/body/form/div[3]/input")).sendKeys("KA");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("/html/body/form/div[4]/input")).sendKeys("IND");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("/html/body/form/div[5]/select")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/form/div[5]/select/option[2]")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("/html/body/form/div[6]/input")).sendKeys("PAIDMONEY:)");
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.xpath("/html/body/form/div[8]/button")).click();
  }
}



