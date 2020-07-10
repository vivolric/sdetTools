package Repl_It._02_HomeWorks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dropdown3 {

    /*

    Navigate to  https://www.saucedemo.com/

    Enter the user name  as standard_user

    Enter the password as   secret_sauce

    Click on login button

    Choose price low to high

    Verify item prices are sorted from low to high
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Navigate to  https://www.saucedemo.com/
        driver.navigate().to("https://www.saucedemo.com/");

        //Enter the user name  as standard_user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Enter the password as   secret_sauce
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

        //Click on login button
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
        driver.findElement(By.cssSelector("#inventory_filter_container>select>:nth-child(3)")).click();

        Thread.sleep(2000);
        //Choose price low to high
//        WebElement filterDropDown = driver.findElement(By.className("product_sort_container"));
//        Select priceLowToHigh = new Select(filterDropDown);
//        priceLowToHigh.selectByIndex(2);

        List<WebElement> priceLists = driver.findElements(By.cssSelector(".inventory_item_price"));
        ArrayList<String> listOfPrice = new ArrayList<>();
        for (WebElement price : priceLists) {
            listOfPrice.add(price.getText().replaceAll("[^\\d.]", ""));
        }

        Thread.sleep(2000);
        //Verify item prices are sorted from low to high
//        List<WebElement> getPrices = driver.findElements(By.className("inventory_item_price"));
//        List<String> listOfPrices = new ArrayList<>();
//        for (int i = 0; i<getPrices.size();i++){
//            listOfPrices.add(getPrices.get(i).getText());
//        }
//        System.out.println(listOfPrices);

        ArrayList<Double> doublePrice = new ArrayList<>();
        for (int i = 0; i < listOfPrice.size(); i++) {
            Double priceD = Double.parseDouble(listOfPrice.get(i));
            doublePrice.add(priceD);
        }
        Collections.sort(doublePrice);


        Thread.sleep(2000);
        //** I can get the list of prices but I don't know how to check if they are sorted

        // Verify item prices are sorted from low to high
        for (int i = 0; i < doublePrice.size() - 1; i++) {

            if (doublePrice.get(i) > doublePrice.get(i + 1)) {

                Assert.fail("The price is not low to high in the list ");

            }
        }
    }
}