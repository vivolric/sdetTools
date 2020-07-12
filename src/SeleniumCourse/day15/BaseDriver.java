package SeleniumCourse.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseDriver  {

    /*
     WebDriver driver; access modifier is a default --> accessible in the same package

     We need to make driver as public or protected so we are able to access it
     */

    protected WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

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

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
