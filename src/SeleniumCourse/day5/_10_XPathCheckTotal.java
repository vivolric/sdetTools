package SeleniumCourse.day5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import Utils.BaseDriver;

public class _10_XPathCheckTotal extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        // try to login
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@class='btn_action']")).click();

        // check if logged in by find cart element
        try {
            driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]"));
            System.out.println("Successfully logged in!");
        } catch (NoSuchElementException e) {
            System.out.println("Failed to log in!");
        }

        // add first item to cart
        driver.findElement(By.xpath("//a[@id='item_4_title_link']")).click();
        String firstItemName = driver.findElement(By.xpath("//div[@class='inventory_details_name']")).getText();
        String firstItemPrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
        System.out.println("firstItemName: " + firstItemName);
        System.out.println("firstItemPrice: " + firstItemPrice);
        driver.findElement(By.xpath("//button[contains(@class,'btn_primary')]")).click();

        // check if added
        try {
            driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]//span[text()='1']"));
            System.out.println("Successfully added an element!");
        } catch (NoSuchElementException e) {
            System.out.println("Failed to an element!");
        }

        // navigate back
        driver.navigate().back();

        // add second item to cart
        driver.findElement(By.xpath("//a[@id='item_0_title_link']")).click();
        String secondItemName = driver.findElement(By.xpath("//div[@class='inventory_details_name']")).getText();
        String secondItemPrice = driver.findElement(By.xpath("//div[@class='inventory_details_price']")).getText();
        System.out.println("secondItemName: " + secondItemName);
        System.out.println("secondItemPrice: " + secondItemPrice);
        driver.findElement(By.xpath("//button[contains(@class,'btn_primary')]")).click();

        // check if added
        try {
            driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]//span[text()='2']"));
            System.out.println("Successfully added an element!");
        } catch (NoSuchElementException e) {
            System.out.println("Failed to an element!");
        }

        // go to checkout page
        driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'btn_action')]")).click();
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Dogan");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Aykurt");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[contains(@class,'btn_primary')]")).click();

        // check the items names and their individual prices
        String firstItemNameInCart = driver.findElement(By.xpath("//div[@class='cart_item'][1]//div[@class='inventory_item_name']")).getText();
        String firstItemPriceInCart = driver.findElement(By.xpath("//div[@class='cart_item'][1]//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(firstItemName, firstItemNameInCart);
        Assert.assertEquals(firstItemPrice, firstItemPriceInCart);

        String secondItemNameInCart = driver.findElement(By.xpath("//div[@class='cart_item'][2]//div[@class='inventory_item_name']")).getText();
        String secondItemPriceInCart = driver.findElement(By.xpath("//div[@class='cart_item'][2]//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(secondItemName, secondItemNameInCart);
        Assert.assertEquals(secondItemPrice, secondItemPriceInCart);

        // check total
        String totalText = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText();
        System.out.println("Total text: " + totalText);

        String total = totalText.replaceAll("[^\\d.]", "");
        System.out.println("Total: " + total);

        String firstPrice = firstItemPriceInCart.replaceAll("[^\\d.]", "");
        System.out.println("firstPrice: " + firstPrice);

        String secondPrice = secondItemPriceInCart.replaceAll("[^\\d.]", "");
        System.out.println("secondPrice: " + secondPrice);

        double totalAsDouble = Double.parseDouble(total);
        double firstPriceAsDouble = Double.parseDouble(firstPrice);
        double secondPriceAsDouble = Double.parseDouble(secondPrice);

        Assert.assertEquals(firstPriceAsDouble + secondPriceAsDouble, totalAsDouble, 0);

        // check tax is 8%
        // go to finish page and check thank you message

//        driver.quit();
    }
}
