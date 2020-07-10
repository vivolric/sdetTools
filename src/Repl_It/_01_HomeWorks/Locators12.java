package Repl_It._01_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators12 {

    /*
    Navigate to  https://www.seleniumeasy.com/test/basic-first-form-demo.html

    Click on input forms

    Click on  Ajax form Submit

    Enter the name

    Enter the comment

    Click on Submit

    Get the text Form submitted Successfully!

    Print the text

    */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement input_forms = driver.findElement(By.linkText("Input Forms"));
        input_forms.click();

        WebElement ajax_form_submit = driver.findElement(By.linkText("Ajax Form Submit"));
        ajax_form_submit.click();

        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("Oguz Atay");

        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("cok iyi");

        driver.findElement(By.id("btn-submit")).click();

        Thread.sleep(3000);

        WebElement submit = driver.findElement(By.id("submit-control"));
        System.out.println(submit.getText());

    }
}
