package SeleniumCourse.day5;

import org.openqa.selenium.By;
import Utils.BaseDriver;

public class _01_XPathLogin extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        // try to login
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@class='btn_action']")).click();

        // check if logged in by find cart element
        // add first item to cart
        // check if added
        // navigate back
        // add second item to cart
        // check if added
        // go to checkout page
        // check the items names and their individual prices
        // check total
        // check tax is 8%
        // go to finish page and check thank you message

    }
}
