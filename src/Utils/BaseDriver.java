package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseDriver  {

    /*
     WebDriver driver; access modifier is a default --> accessible in the same package

     We need to make driver as public or protected so we are able to access it
     */

    protected WebDriver driver;

    @BeforeMethod(groups = {"SmokeTesting","Regression"})
    @Parameters({"browser"})
    public void BeforeMethod(String browser){

//        With this if else statement We are getting the browser name from the xml file then
//          We are opening the browser in this if statement
//          Before you download the geckoDriver you should have firefox browser in your laptop
//        Link for the firefox --> https://github.com/mozilla/geckodriver/releases/tag/v0.26.0

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
            driver = new ChromeDriver(); // Opennning the chrome

        }else if(browser.equalsIgnoreCase("firefox")){
//                                                                              No exe for mac
            System.setProperty("webdriver.gecko.driver" ,"/Users/bulut/Selenium/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccount.click();

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        try{

            // These two elements are showing in the chrome but not in the firefox
            WebElement advancedButton = driver.findElement(By.id("details-button"));
            advancedButton.click();

            // These two elements are showing in the chrome but not in the firefox
            WebElement ProceedButton = driver.findElement(By.id("proceed-link"));
            ProceedButton.click();
        }catch (NoSuchElementException e){
            System.out.println("This part is just for chrome");
        }

        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("asd@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("123qweasd");

        WebElement loginButtonLogPage = driver.findElement(By.cssSelector("input[value='Login']"));
        loginButtonLogPage.click();
    }

    @AfterMethod
    public void afterMethod(){
//        driver.quit();
    }
}
