package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Dropdown2 {

    /*
    Navigate to  https://chercher.tech/practice/practice-dropdowns-selenium-webdriver

    Choose random item from the dropdown 1
    Choose random item from the dropdown 2

    Run the code multiple types and verify it is choosing the different items
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver ");

        WebElement random1=driver.findElement(By.cssSelector("select[id='first']"));
        Select Random1=new Select(random1);
        List<WebElement> listOfOne=Random1.getOptions();
        Random randomizeOne=new Random();
        int allOne=randomizeOne.nextInt(listOfOne.size());
        Random1.selectByIndex(allOne);

        WebElement random2=driver.findElement(By.cssSelector("select[id='animals']"));
        Select Random2=new Select(random2);
        List<WebElement> listOfTwo=Random2.getOptions();
        Random  randomizeTwo=new Random();
        int allTwo=randomizeTwo.nextInt(listOfTwo.size());
        Random2.selectByIndex(allTwo);
    }
}



