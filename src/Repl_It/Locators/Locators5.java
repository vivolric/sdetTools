package Repl_It.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators5 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.id("calculate")).click();

        WebElement number1 = driver.findElement(By.id("number1"));
        number1.sendKeys("5");

        WebElement number2 = driver.findElement(By.id("number2"));
        number2.sendKeys("2");

        driver.findElement(By.id("calculate")).click();

        WebElement answer = driver.findElement(By.id("answer"));
        System.out.println(answer.getText());

    }
}
