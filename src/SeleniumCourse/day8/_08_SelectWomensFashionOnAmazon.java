package SeleniumCourse.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import SeleniumCourse.utils.BaseDriver;

public class _08_SelectWomensFashionOnAmazon extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://amazon.com");
        Select categories = new Select(driver.findElement(By.id("searchDropdownBox")));
        categories.selectByVisibleText("Video Games");
//        driver.quit();
    }

}
