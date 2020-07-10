package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements2 {

    /*
    Navigate to  https://www.snapdeal.com/

    Click on  See All Categories on the left side

    Get all the options under the COMPUTERS, OFFICE & GAMING

    print the count of the options --> result should be 20

    print the text of all the elements in the result
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

                //Navigate to  https://www.snapdeal.com/
                driver.get("https://www.snapdeal.com/ ");

                //Click on  See All Categories on the left side
                WebElement seeAllCategories = driver.findElement(By.xpath("//span[@class='catText blue-text']"));
                seeAllCategories.click();

                Thread.sleep(2000);

                //Get all the options under the COMPUTERS, OFFICE & GAMING
                //print the text of all the elements in the result
                List<WebElement> options = driver.findElements(By.xpath("//div[@id='SMPCTab']//div[2]//div/div//ul//li"));
                for (int i = 0; i < options.size(); i++){
                    System.out.println(options.get(i).getText());
                }

                //print the count of the options --> result should be 20
                System.out.println(options.size());


            }
        }



