package TestNG.Day7;

import Utils.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderCode extends BaseDriver {


    @Test
    public void placeOrder() throws InterruptedException {

//        input[placeholder='Search']

        _05_PlaceOrderElements placeOrderElements = new _05_PlaceOrderElements(driver);

        placeOrderElements.searchInput.sendKeys("Palm");

        placeOrderElements.searchButton.click();

        placeOrderElements.Item1.click();

        placeOrderElements.addToCartButton.click();

        placeOrderElements.shoppingCartButton.click();

        placeOrderElements.CheckoutButton.click();

        WebDriverWait wait = new WebDriverWait(driver , 10);

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continue1)).click();

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continue2)).click();

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continue3)).click();

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.checkBoxAgree)).click();

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continue4)).click();

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.confirmButton)).click();

//        Waiting for the URL contain the success.
        wait.until(ExpectedConditions.urlContains("success"));

        String messageOfCondirmed = placeOrderElements.orderedText.getText();

        Assert.assertEquals(messageOfCondirmed,"Your order has been placed!");

        placeOrderElements.searchInput.sendKeys("Mac");

        placeOrderElements.searchButton.click();
    }
}
