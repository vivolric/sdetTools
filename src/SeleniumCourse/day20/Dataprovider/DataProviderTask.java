package SeleniumCourse.day20.Dataprovider;

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

public class DataProviderTask extends BaseDriver {

    @Test(dataProvider = "searchItem")
    public void searchFunctionality(String searchItem){

        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> itemNamesList = driver.findElements(By.tagName("h4"));

        System.out.println(itemNamesList);

        for(WebElement eachElement:itemNamesList){

            System.out.println(eachElement.getText());

            Assert.assertTrue(eachElement.getText().toLowerCase().contains(searchItem.toLowerCase()));

        }

    }

//    we say  List<Object> in  List<Object> myList = new ArrayList<>();  because?
    @DataProvider(name="searchItem")
    public Iterator<Object> data1(){

        List<Object> myList = new ArrayList<>();
        myList.add("Mac");
        myList.add("Laptop");

        return myList.iterator();
    }
}
