package SeleniumCourse.day12;

import org.openqa.selenium.JavascriptExecutor;
import SeleniumCourse.Utils.BaseDriver;

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
