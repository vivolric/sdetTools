package Repl_It.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators14 {

    /*
    Navigate to   https://www.etsy.com/

Search for teddy bear

Click on Toys and games on the left navigator under the all categories

Print the URL
Note : URL should be  https://www.etsy.com/search/toys-and-games?q=teddy+bear&explicit=1

Remove the teddy bear from the search input

Search for phone

Print the URL
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
        search.sendKeys("teddy bear");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        Thread.sleep(3000);

        WebElement toyGames = driver.findElement(By.linkText("Toys & Games"));
        toyGames.click();

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        WebElement search2 = driver.findElement(By.id("global-enhancements-search-query"));
        search2.clear();
        search2.sendKeys("phone");

        WebElement submit2 = driver.findElement(By.cssSelector("button[type='submit']"));
        submit2.click();

        String URL2 = driver.getCurrentUrl();
        System.out.println(URL2);

    }
}



