package TestNG.Day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_WishListElements {


    public _02_WishListElements(WebDriver driver){
        PageFactory.initElements(driver,this); //
    }

//    FindBy -> return is single WebElement -- Working as driver.findElement

//    FindAll -> return is List<WebElement> -- Working as driver.findElements

    @FindAll({
            @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    })
    public List<WebElement> hearthIconList;

    @FindAll({
            @FindBy(css = "div[class='caption']>h4")
    })
    public List<WebElement> nameListInTheItemPage;

    @FindBy(xpath = "//a[@id='wishlist-total']/span")
    public WebElement wishListButton;

    @FindAll({
            @FindBy(xpath = "//table//tbody//tr//td[2]")
    })
    public List<WebElement>  nameInTheCartPage;

    @FindAll({
            @FindBy(xpath = "//a[@data-original-title='Remove']")
    })
    public List<WebElement> removeButtonList;

    @FindBy(xpath = "//a[@data-original-title='Remove']")
    public List<WebElement> removeButtonList2;
}
