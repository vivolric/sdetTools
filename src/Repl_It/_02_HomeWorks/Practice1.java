package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

    /*
    Navigate to  http://practice.automationtesting.in/

    Click on Random Items under the new arrivals

    Enter the random quantity in the product page

    Click on Add to basket button in the product page

    Click on cart button in the product page

    Verify Product name in the cart page and in the product page is equal

    Verify price * quantity equal to total

    Verify subtotal + roaming tax equal to total

    Click on the proceed to checkout

    Enter  First Name , last name , Email address , Phone

    Choose Albania from the country dropdown

    Enter the address ,town/city  State and PostalCode /zip

    Click on the place order button

    Verify Text total in the cart page and text total in the confirmation page is equal

     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.automationtesting.in/");



    }
}