package SeleniumCourse.day12;

import org.openqa.selenium.JavascriptExecutor;
import SeleniumCourse.utils.BaseDriver;

public class _03_IntroScrollingAllTheWayDown extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://triplebyte.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // scroll all the way down
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0, -1000)");
    }
}
