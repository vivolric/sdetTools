package TestNG.Day6.Dataprovider;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_Sample1 extends BaseDriver {

    @Test(dataProvider = "enquiryName")
    public void contactUs(String enquiry) throws InterruptedException {

        WebElement contactButton = driver.findElement(By.linkText("Contact Us"));
        contactButton.click();

        WebElement enquiryInput = driver.findElement(By.id("input-enquiry"));
        enquiryInput.sendKeys(enquiry);

        Thread.sleep(5000);

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div[id='content']>p"));

        Assert.assertTrue(successMessage.getText().contains("successfully"));

    }

    @DataProvider(name="enquiryName")
    public Iterator<Object> data1(){

        List<Object> myList = new ArrayList<>();

        myList.add("Hello team Hello team");
        myList.add("Hello team we are in this page");

        return myList.iterator();
    }

}
