package SeleniumCourse.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import SeleniumCourse.utils.BaseDriver;

public class _01_Login extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        String result = login("locked_out_user", "secret_sauce");
        System.out.println(result);
    }

    // login function
    public static String login(String username, String password) {
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.clear();
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordInput.clear();
        passwordInput.sendKeys(password);
        driver.findElement(By.xpath("//input[@class='btn_action']")).click();

        try {
            // check if logged in by find cart element
            driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]"));
            return "success";
        } catch (NoSuchElementException e) {
            try {
                // get the error message
                return driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();
            } catch (NoSuchElementException error) {
                return "failure: error message not found!";
            }
        }
    }

    // add to cart function
    // get the number of items in the cart
    // remove item from the cart
    // get the list of available items
    // get the list of items in the cart
    // go to checkout page
    // check prices in the checkout page
    // check tax in the checkout page
    // check thank you message
}
