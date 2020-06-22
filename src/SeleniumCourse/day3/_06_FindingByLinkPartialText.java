package SeleniumCourse.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkPartialText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser
        driver.get("http://www.practiceselenium.com");  // this will open the website and wait until full load

        WebElement teaLink = driver.findElement(By.partialLinkText("Tea"));
        // burda albayim sayfa bulunan Tea kelimesini yazdik sout ise attribute adini yazdik (href)
        // sayfayi taradi ilk buldugu Tea kelimesiyle iliskili olan linki konsolda yazdirdi.
        System.out.println(teaLink.getAttribute("href"));

        //bir ikinci ornek olarak Passion kelimesini arattik sayfada ve bize linkini verdi konsolda
        WebElement passionLink = driver.findElement(By.partialLinkText("Passion"));
        System.out.println(passionLink.getAttribute("href"));
        driver.quit();
    }
}
