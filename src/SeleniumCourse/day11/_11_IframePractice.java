package SeleniumCourse.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import Utils.BaseDriver;

public class _11_IframePractice extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.123formbuilder.com/free-form-templates/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(".item"))).perform();

//        driver.quit();
    }

}
