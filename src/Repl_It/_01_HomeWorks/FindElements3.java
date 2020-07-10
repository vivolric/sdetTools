package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements3 {

    /*
    Navigate to  https://www.snapdeal.com/

    Search for  phone accessories

    Click search button

    Click on Fuson button on the left side

    Get the text next to Fuson

    Verify the item in the page count is equal to text next to Fuson

     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Navigate to  https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/ ");

        //Search for  phone accessories
        WebElement phoneAccessories = driver.findElement(By.id("inputValEnter"));
        phoneAccessories.sendKeys("phone accessories");

        //Click search button
        WebElement searchButton = driver.findElement(By.cssSelector("i[class='sd-icon sd-icon-search-under-catagory lfloat']"));
        searchButton.click();

        Thread.sleep(2000);
        //Click on Fuson button on the left side
        WebElement fusonButton = driver.findElement(By.cssSelector("label[for='Brand-Fuson']"));
        //div[@class='sdCheckbox filters-list ']//input[@value='Fuson']

        //WebElement fusonButton = driver.findElement(By.cssSelector("input[value='Fuson']")); a[class="filter-name hashAdded"]
        //WebElement fusonButton = driver.findElement(By.linkText("Fuson"));
        fusonButton.click();

        //Get the text next to Fuson
        WebElement textFuson = driver.findElement(By.cssSelector("span[class='filter-prod-count']"));
        System.out.println(textFuson.getText());


        //Verify the item in the page count is equal to text next to Fuson



//        driver.manage().window().maximize();
//
//        driver.navigate().to("https://www.snapdeal.com/ ");
//
//        driver.findElement(By.id("inputValEnter")).sendKeys("phone accessories");
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@class='header_wrapper']//button")).click();
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@class='filter-inner ']//div")).click();
//        String number = driver.findElement(By.xpath("//div[@class='filter-inner ']//div//label//span")).getText();
//        Integer textNum = Integer.parseInt(number);
//
//
//        Thread.sleep(2000);
//        List<WebElement> items = driver.findElements(By.cssSelector(" #products>section>div"));
//        int numberOfItem = items.size();
//
//        if(textNum == numberOfItem) {
//            System.out.println("Text match with the amount of item");
    }
}



