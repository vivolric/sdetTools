package SeleniumCourse.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import SeleniumCourse.utils.BaseDriver;

public class _10_Romainpenchenat extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://romainpenchenat.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 2000 ; i++) {
            js.executeScript("window.scrollBy(0,100)");
        }
        System.out.println("Done");
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
