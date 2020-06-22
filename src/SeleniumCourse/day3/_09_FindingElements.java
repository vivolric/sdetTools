package SeleniumCourse.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _09_FindingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser
        driver.get("http://www.practiceselenium.com");  // this will open the website and wait until full load

        //List<WebElement> liElements = driver.findElements(By.tagName("li")); //if nothing is found it will return an empty list

        List<WebElement> liElements = driver.findElements(By.tagName("li"));//if nothing is found it will return an empty list
       // burda albayim cmd option V ile bu objecti olusturduk

        for(WebElement element : liElements) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
