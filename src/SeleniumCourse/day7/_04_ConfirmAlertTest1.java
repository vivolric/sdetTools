package SeleniumCourse.day7;

import org.junit.Assert;
import org.openqa.selenium.By;
import Utils.BaseDriver;


public class _04_ConfirmAlertTest1 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().accept();
        String actualText = driver.findElement(By.id("confirm-demo")).getText();
        Assert.assertEquals("You pressed OK!", actualText);
    }

}
