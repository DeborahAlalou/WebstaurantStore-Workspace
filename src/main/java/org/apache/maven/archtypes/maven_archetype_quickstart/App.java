package org.apache.maven.archtypes.maven_archetype_quickstart;

/*import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;*/

/**
 * WebstarantStore Test Suite
 * Author: Deborah Alalou
 * Date: 1/9/2024
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Welcome to the WebstarantStore Test Suite!");
    	System.out.println("Use the command 'mvn test' to run all tests in the suite.");
    	
        /*System.out.println("Running WebstarantStore Table Test...");
        
        //1. Go to https://www.webstaurantstore.com/
        System.out.println("Step 1: Go to https://www.webstaurantstore.com/...");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webstaurantstore.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String title = driver.getTitle();
        if (title.contentEquals("WebstaurantStore: Restaurant Supplies & Foodservice Equipment"))
        {
        	System.out.println("Step 1 passed.");
        }
        else
        {
        	System.out.println("Step 1 failed.");
        }
        
        
        //2. Search for 'stainless work table'
        System.out.println("Step 2: Search for 'stainless work table'...");
        WebElement searchBox = driver.findElement(By.name("searchval"));
        WebElement searchButton = driver.findElement(By.cssSelector(".hidden #banner-search-group .text-white"));
        searchBox.sendKeys("stainless work table");
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        String title2 = driver.getTitle();
        if (title2.contentEquals("Stainless Work Table - WebstaurantStore"))
        {
        	System.out.println("Step 2 passed.");
        }
        else
        {
        	System.out.println("Step 2 failed.");
        }
        
        //3. Check the search result ensuring every product has the word 'Table' in its title.
        System.out.println("Step 3: Check the search result ensuring every product has the word 'Table' in its title...");
        List <WebElement> pageButtons = driver.findElements(By.cssSelector("#paging>nav>ul>li"));
        int numPages = pageButtons.size();
        List <String> descriptionList = new ArrayList<>();
        for (int i=0; i <= numPages; i++)
        {
           List <WebElement> searchResults = driver.findElements(By.cssSelector("#ProductBoxContainer > div.group.border-white.border-solid.border-6.m-0.max-w-full.overflow-hidden.relative.hover\\:outline-gray-200 > a > span"));
           //System.out.println("searchResults size = " + searchResults.size() + " for i = " + i); //Test output
           //get text for element and add to string array
           for (WebElement eachResult:searchResults)
           {
        	   descriptionList.add(eachResult.getText());
           }
           //try incrementing to next page of results
           try
           {
        	   WebElement nextPageButton = driver.findElement(By.cssSelector("#paging > nav > ul > li.inline-block.leading-4.align-top.rounded-r-md"));
        	   nextPageButton.click();
        	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
           }
           catch(Exception e)
           {
        	   break;
           }
        }
        
        //System.out.println(descriptionList); //Test output
        
        
        //compare text
        Boolean noTableTitle = false;
        Boolean emptyTable = true;
        for (int i = 0; i < descriptionList.size(); i++)
        {
        	if (descriptionList.get(i).contains("Table"))
        	{
        		emptyTable = false;
        	}
        	else
        	{
        		noTableTitle = true;
        		System.out.println("Search result " + i + " did not contain 'Table': " + descriptionList.get(i));
        	}
        }
           
        if (noTableTitle || emptyTable)
        {
        	System.out.println("descriptionList size = " + descriptionList.size()); 
        	System.out.println("Step 3 failed.");
        }
        else
        {
        	System.out.println("Step 3 passed.");
        }
           
        //4. Add the last of found items to Cart.
        System.out.println("Step 4: Add the last of found items to Cart...");
        try
        {
           List <WebElement> cartButtons = driver.findElements(By.name("addToCartButton"));
           int numItems = cartButtons.size();
           cartButtons.get(numItems-1).click();
           driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
           System.out.println("Step 4 passed.");
        }
        catch (Exception e)
        {
        	System.out.println("Step 4 failed.");
        }
        
        //5. Empty Cart.
        System.out.println("Step 5: Empty Cart...");
        WebElement cartViewButton = driver.findElement(By.xpath("//*[@id=\"watnotif-wrapper\"]/div/p/div[2]/div[2]/a[1]"));
        cartViewButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement emptyCartButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[1]/div/button"));
        emptyCartButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement emptyConfirm = driver.findElement(By.xpath("//*[@id=\"td\"]/div[11]/div/div/div/footer/button[1]"));
        emptyConfirm.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement emptyMessage = driver.findElement(By.className("header-1"));
        String emptyMessageText = emptyMessage.getText();
        if (emptyMessageText.contentEquals("Your cart is empty."))
        {
        	System.out.println("Step 5 passed.");
        }
        else
        {
        	System.out.println("Step 5 failed.");
        	System.out.println("emptyMessageText = " + emptyMessageText);
        }*/
        
    }
}
