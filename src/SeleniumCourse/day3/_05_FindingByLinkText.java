package SeleniumCourse.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser
        driver.get("http://www.practiceselenium.com");  // this will open the website and wait until full load
        WebElement checkOutLink = driver.findElement(By.linkText("Check Out"));
        //burda yine cmd option V ya da ctrl alt V m

        System.out.println(checkOutLink.getAttribute ("data-pageid"));
                                //burda getAttribute kullandik ve websiteden de data-pageid bulduk.
        driver.quit();
    }
}
