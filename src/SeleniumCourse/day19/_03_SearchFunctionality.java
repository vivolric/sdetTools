package SeleniumCourse.day19;

import SeleniumCourse.Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_SearchFunctionality extends BaseDriver {

    @Test
    @Parameters({"searchItem"})
    public void searchFunctionality(String searchItem){

        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        /*

            1) is URL contains search text

            2) list of items

            3) contains search text

         */

        List<WebElement> itemNamesList = driver.findElements(By.tagName("h4"));

        System.out.println(itemNamesList);

        for(WebElement eachElement:itemNamesList){

            System.out.println(eachElement.getText());
//            Assert.assertTrue(eachElement.getText().contains(text));
            Assert.assertTrue(eachElement.getText().toLowerCase().contains(searchItem.toLowerCase()));
        }

    }

}
