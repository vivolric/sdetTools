package SeleniumCourse.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import SeleniumCourse.Utils.BaseDriver;

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
