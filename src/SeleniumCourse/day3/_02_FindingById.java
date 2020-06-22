package SeleniumCourse.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser
        driver.get("http://www.practiceselenium.com");  // this will open the website and wait until full load
        // WebElement e = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914887"));
        WebElement element = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914886"));
        WebElement element2 = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914887"));
        //burda albayim cmd option V ya da ctrl alt V kullanip otomatik variable ekleriz
        // eger bu methodu  bir objecte veya elemente donusturecek olursak o type in variable ini alicaktir
        System.out.println(element.getText());
        System.out.println(element2.getText()); // denedim ayni websiteden birden fazla id alabildim, console text olarak cikti
        driver.quit();
    }
}
