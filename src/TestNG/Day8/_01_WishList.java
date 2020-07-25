package TestNG.Day8;

import TestNG.Day7._05_PlaceOrderElements;
import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class _01_WishList extends BaseDriver {


    @Test
    public void WishListTest()   {

        /*
            Search input and search button elments are coming from the _05_PlaceOrderElements
                Which we worked on it in the last class
                With a page object model we can use same element for different classes , @Test

         */

        _02_WishListElements wishListElements = new _02_WishListElements(driver);
        _05_PlaceOrderElements placeOrderElements = new _05_PlaceOrderElements(driver);

        placeOrderElements.searchInput.sendKeys("Mac");

        placeOrderElements.searchButton.click();

        System.out.println(wishListElements.hearthIconList.size());

        System.out.println(wishListElements.nameListInTheItemPage.size());

        List<String > nameListInTheItemPageStr = ReusableMethods.WebElementToString(wishListElements.nameListInTheItemPage);

        /*
            Click on the hearth icon one by one

         */
        for(WebElement eachHearthIcon:wishListElements.hearthIconList){

            eachHearthIcon.click();

//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        wishListElements.wishListButton.click();

        List<String> nameInTheCartPageStr =ReusableMethods.WebElementToString(wishListElements.nameInTheCartPage);

        System.out.println(nameInTheCartPageStr);
        System.out.println(nameListInTheItemPageStr);

        ReusableMethods.verifyTwoStringList(nameInTheCartPageStr , nameListInTheItemPageStr);

        /*
            When we start size = 4 -- i = 0
                                3  -- i = 1
                                2  -- i = 2

         */
//        for(int i = 0 ; i<wishListElements.removeButtonList2.size(); i++){
//            wishListElements.removeButtonList2.get(0).click();
//        }

        List<WebElement> removIcon = wishListElements.removeButtonList2;

        do {

            removIcon = wishListElements.removeButtonList2;
            removIcon.get(0).click();


        }while (removIcon.size()!=0);

    }

}
