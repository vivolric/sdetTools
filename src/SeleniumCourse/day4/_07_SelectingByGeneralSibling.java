package SeleniumCourse.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumCourse.Utils.BaseDriver;

import java.util.List;

public class _07_SelectingByGeneralSibling extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://formsmarts.com/form/yu?mode=h5");  // this will open the website and wait until full load

       // using general sibling selector print all options of "How often do you use XYZ?" question
        List<WebElement> elements = driver.findElements(By.cssSelector("#u_Uj7_89585_lbl ~ label"));
        // burda secilen id ile benim ayni element icin buldugum farkli, neden? (#u_hFn_89585_lbl)
        for(WebElement element : elements) {
            System.out.println(element.getText());
        }

    }
}
