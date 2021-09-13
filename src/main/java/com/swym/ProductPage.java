package com.swym;

import org.openqa.selenium.By;

public class ProductPage {

    public static By addtoWishlist = By.xpath("//span[text()='Add to Wishlist']");
    
    public static By createWishlit = By.xpath("//button[text()='Create New List']");
    
    public static By nameWishlist = By.xpath("//input[@aria-label='Create New List Input']");

    public static By addtoList = By.xpath("//button[text()='Add To List']");

    public static By login = By.xpath("(//a[@href='/account/login'])[1]");
    
    public static By email = By.id("CustomerEmail");
    		
    public static By pwd = By.id("CustomerPassword");
    
    public static By signin = By.xpath("//input[@value='Sign In']");
    
    public static By viewList = By.xpath("//div[text()='View List']");
        
    public static By ellipse = By.xpath("//button[@aria-label='More Options']");

    public static By share = By.xpath("//span[text()='Share']");
    
    public static By recipient = By.id("swym-email");

    public static By sharelist = By.xpath("//button[text()='Share List']");
    
    public static By successMessage = By.xpath("(//span[contains(text(),'My Wishlist')])[2]");
    
    public static By test = By.xpath("");

   
}
