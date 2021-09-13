package com.swym;

import com.aventstack.extentreports.Status;
import swym.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddtoWishlist extends TestBase {

    @Test(enabled=true)
    public void tc01VerifyOpenURL() throws InterruptedException {

        test = extent.createTest("Verify URL", "Case 1: User needs to verify if demo swym homepage works as expected.")
                .assignCategory("Functional_testcase")
                .assignAuthor("Shreyansh");
        logger.info("Verify URL");

        openURL("https://demo.swym.it/");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        String actualTitle = driver.getTitle();
        logger.info(actualTitle);
    }

    @Test(enabled=true)
    public void tc02VerifyAddtoWishlist() throws InterruptedException {

        test = extent.createTest("Verify AddtoWishlist", "Case 2: User should be able to add to wishlist")
                .assignCategory("Functional_testcase")
                .assignAuthor("Shreyansh");
        logger.info("Verify add to wishlist");

        openURL("https://demo.swym.it/products/copy-of-yellow-sunglasses-bag");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");
        
        webdriver.waitForElementVisible(ProductPage.addtoWishlist);
        webdriver.clickOnButton(ProductPage.addtoWishlist);
        logger.info("Added to Wishlist Email");


        webdriver.waitForElementVisible(ProductPage.addtoList);
        webdriver.clickOnButton(ProductPage.addtoList);
        
        
        
    }
    
    @Test(enabled=true)
    public void tc03VerifyShareWishlist() throws InterruptedException {
    	
    	
    	 test = extent.createTest("Verify ShareWishlist", "Case 3: User should be able to share the wishlist")
                 .assignCategory("Functional_testcase")
                 .assignAuthor("Shreyansh");
         logger.info("Verify Share wishlist");
    	
    	
         openURL("https://demo.swym.it/");
         test.log(Status.INFO, "Open URL");
         logger.info("Open URL");
         
           
         webdriver.waitForElementVisible(ProductPage.login);
         webdriver.clickOnButton(ProductPage.login);
         logger.info("Login on site");

         
         
         webdriver.waitForElementVisible(ProductPage.email);
         webdriver.enterText(ProductPage.email, "testwishlistswym@yopmail.com");
         logger.info("Input Email");


         
         webdriver.waitForElementVisible(ProductPage.pwd);
         webdriver.enterText(ProductPage.pwd, "Test1234");
         logger.info("Input Password");

         
         webdriver.waitForElementVisible(ProductPage.signin);
         webdriver.clickOnButton(ProductPage.signin);
         logger.info("Click Sigin");

         
         
         openURL("https://demo.swym.it/pages/wishlist3");
         test.log(Status.INFO, "Open URL");
         logger.info("Open Wishlist URL");

    	
         webdriver.waitForElementVisible(ProductPage.viewList);
         webdriver.waitForElementToBeClickable(ProductPage.viewList);
         webdriver.clickOnButton(ProductPage.viewList);
         logger.info("View WishList");

         webdriver.sync(5);
         
         webdriver.waitForElementVisible(ProductPage.ellipse);
         webdriver.waitForElementToBeClickable(ProductPage.ellipse);
         webdriver.clickOnButton(ProductPage.ellipse);
         logger.info("Click Multiple Options");

         
         
         webdriver.waitForElementVisible(ProductPage.share);
         webdriver.waitForElementToBeClickable(ProductPage.share);
         webdriver.clickOnButton(ProductPage.share);
         logger.info("Click Share");

         
         webdriver.waitForElementVisible(ProductPage.recipient);
         webdriver.enterText(ProductPage.recipient,"testdata@yopmail.com");
         logger.info("Input Shared Email");

         
         
         webdriver.waitForElementVisible(ProductPage.sharelist);
         webdriver.waitForElementToBeClickable(ProductPage.sharelist);
         webdriver.clickOnButton(ProductPage.sharelist);
         logger.info("Click Share Wishlist to Email");

         
         
         webdriver.waitForElementVisible(ProductPage.successMessage);
         logger.info("Verify Success Message");
       
    	
    }   

}
