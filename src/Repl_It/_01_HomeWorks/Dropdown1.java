package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

    /*
    Navigate to  https://www.testandquiz.com/selenium/testing.html

    Click on the  Database Testing in the dropdown

    Database Testing should be displayed
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testandquiz.com/selenium/testing.html");

        WebElement dropDown=driver.findElement(By.id("testingDropdown"));
        Select DropDown=new Select(dropDown);
        DropDown.selectByIndex(3);

    }
}

