package TestNG.Day5;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUs extends BaseDriver {


    @Test
    @Parameters("enquiry")
    // with this parameters tag testNG.xml file is able to understand enquiry data need to send to this @Test
    public void contactUs(String enquiry) throws InterruptedException {

    /*
        Click on contact us button in the page(bottom of the page)

        Enter the value for Enquiry

        Click on Submit button

        verify success message is displayed

     */

        WebElement contactButton = driver.findElement(By.linkText("Contact Us"));
        contactButton.click();

        WebElement enquiryInput = driver.findElement(By.id("input-enquiry"));
        enquiryInput.sendKeys(enquiry);

        Thread.sleep(5000);

//        WebElement submitButton = driver.findElement(By.className("btn btn-primary")); if there is a space between class value
//              then selenium is not able to locate the element with className locator type

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div[id='content']>p"));

        Assert.assertTrue(successMessage.getText().contains("successfully"));

    }

}
