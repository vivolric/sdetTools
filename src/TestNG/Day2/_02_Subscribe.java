package TestNG.Day2;

import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Subscribe extends BaseDriver {

    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void subscribeFunctionYes(){

        WebElement SubscribeButton = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
        SubscribeButton.click();

        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
        yesRadioButton.click();

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        WebElement SuccessMessage = driver.findElement(By.cssSelector("div[class='alert alert-success']"));

        Assert.assertEquals(SuccessMessage.getText(), "Success: Your newsletter subscription has been successfully updated!");
    }

    @Test
    public void subscribeFunctionForNO(){

        WebElement SubscribeButton = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
        SubscribeButton.click();

        WebElement noRadioButton = driver.findElement(By.xpath("//input[@value='0']"));
        noRadioButton.click();

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        WebElement SuccessMessage = driver.findElement(By.cssSelector("div[class='alert alert-success']"));

        Assert.assertEquals(SuccessMessage.getText(), "Success: Your newsletter subscription has been successfully updated!");

    }

    @Test
    public void subscribeFunctionForBoth(){

        WebElement SubscribeButton = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
        SubscribeButton.click();

        //input[@checked='checked']/..
        String textOfChecked = driver.findElement(By.xpath("//input[@checked='checked']/parent::label")).getText();

        if(textOfChecked.equals("No")){
            WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
            yesRadioButton.click();
        }else{
            WebElement noRadioButton = driver.findElement(By.xpath("//input[@value='0']"));
            noRadioButton.click();
        }

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

}
