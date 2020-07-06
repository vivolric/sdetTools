package SeleniumCourse.day8;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import SeleniumCourse.utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _06_ListAllCategoriesOfAmazon extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://amazon.com");
        Select categories = new Select(driver.findElement(By.id("searchDropdownBox")));
        for(WebElement category : categories.getOptions()) {
            System.out.println(category.getText());
        }
        driver.quit();
    }

}
