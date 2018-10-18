package org.rmnot.tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class RetailMeNotTests extends BaseClass {
	
	

	
	     // Writing tests for Retail Me Not Application
	     @Test
         public void validateSearchForAmazonStore()
               { 
	    	      String storeName ="amazon";
    	          driver.get(url);
    	          driver.findElement(By.xpath(".//*[@id='top']/div/nav/ul/li[3]/a/span")).click();
    	          driver.findElement(By.xpath(".//*[@id='search-offer-list']/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/input")).sendKeys(storeName); 
    	          String actual = driver.findElement(By.className("inventory-header-merchant")).getText();
    	          String expected = storeName;
    	          Assert.assertEquals(actual, expected);
    	 
     }
	     
	     @Test
         public void validateSearchForEbayStore()
               { 
	    	      String storeName ="amazon";
    	          driver.get(url);
    	          driver.findElement(By.xpath(".//*[@id='top']/div/nav/ul/li[3]/a/span")).click();
    	          driver.findElement(By.xpath(".//*[@id='search-offer-list']/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/form/input")).sendKeys(storeName); 
    	          String actual = driver.findElement(By.className("inventory-header-merchant")).getText();
    	          String expected = storeName;
    	          Assert.assertEquals(actual, expected);
    	 
     
}
}
