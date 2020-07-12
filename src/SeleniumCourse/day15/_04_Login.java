package SeleniumCourse.day15;

import SeleniumCourse.utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _04_Login extends BaseDriver {

    @Test
    public void LoginFunc() {

        WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccount.click();

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        WebElement advancedButton = driver.findElement(By.id("details-button"));
        advancedButton.click();

        WebElement ProceedButton = driver.findElement(By.id("proceed-link"));
        ProceedButton.click();

        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("asd@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("123qweasd");

        WebElement loginButtonLogPage = driver.findElement(By.cssSelector("input[value='Login']"));
        loginButtonLogPage.click();

    }
}
