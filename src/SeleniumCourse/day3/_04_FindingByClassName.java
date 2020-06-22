package SeleniumCourse.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(); // this will open the chrome browser
        driver.get("http://www.practiceselenium.com");  // this will open the website and wait until full load

        WebElement element = driver.findElement(By.className("editor_collections")); // will return first found element only
        //burda object yine ayni yolla olusturduk, cmd option V shortcut
        //intellij ilk yazilan kodu inspecten alip getirir, misal 3 tane vardi editor_collections dan, bize ilkini verdi yani loose tea am biz herbal tea icin arama yapmistik.
        System.out.println(element.getText());
        driver.quit();
    }
}
