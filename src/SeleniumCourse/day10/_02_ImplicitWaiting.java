package SeleniumCourse.day10;

import org.openqa.selenium.By;
import SeleniumCourse.utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _02_ImplicitWaiting extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#start > button")).click();

        String text = driver.findElement(By.id("finish")).getText();
        System.out.println(text);

        driver.quit();
    }

}
