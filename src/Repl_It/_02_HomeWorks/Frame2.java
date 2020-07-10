package Repl_It._02_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

    /*
    Navigate to  https://www.dezlearn.com/testingpage/

    In the right frame under the Sign up  write any email

    In the right frame write any name

    click on Subscribe

    Get the thank you

    Print the text
     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.dezlearn.com/testingpage/");

        driver.navigate().to(" https://www.dezlearn.com/testingpage/ ");

        driver.switchTo().frame("contact-iframe");

        driver.findElement(By.cssSelector(" div:nth-child(1) >div>input")).sendKeys("Destan@abc.com");

        driver.findElement(By.cssSelector(".ml-form-fieldRow:nth-of-type(2)>div>input")).sendKeys("Destan");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ml-form-embedSubmit>button")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".ml-form-successBody>div>h4")).getText());
    }
}


