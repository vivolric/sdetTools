package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Practice2 {

    /*
    Navigate to " http://demo.automationtesting.in/Register.html "

    Enter your full name (First Name  - Last Name)

    Enter your Techno Study campus address (You can find addresses from www.techno.study)

    Enter your E-mail address

    Choose you gender from radio button

    Select "Movies" for Hobbies

    Select "English" for Languages

    Select "Java" for Skills

    Select "United States" for Country

    Select "United States of America" for the Select Country

    Select your date of birth

    Create a valid Password (small letter, capital letter, number)

    Click on submit button

    Get the url and check is it equal to " http://demo.automationtesting.in/WebTable.html "

     */


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/bulut/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        //driver.get("http://demo.automationtesting.in/Register.html");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(" http://demo.automationtesting.in/Register.html ");
        driver.findElement(By.cssSelector("#basicBootstrapForm>:first-child>div:first-of-type>input")).sendKeys("Dgn");
        driver.findElement(By.cssSelector("#basicBootstrapForm>:first-child>div:last-of-type>input")).sendKeys("Aykr");
        driver.findElement(By.cssSelector("#basicBootstrapForm>:nth-child(2)>div:last-of-type>textarea")).sendKeys("600 Getty Ave, Clifton, NJ 07011");
        driver.findElement(By.cssSelector("#eid>input")).sendKeys("dogan@gmail.com");
        driver.findElement(By.cssSelector("#basicBootstrapForm>:nth-child(4)>div:last-of-type>input")).sendKeys("2023034043");
        driver.findElement(By.cssSelector("input[value ='Male']")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.cssSelector("ul.ui-autocomplete>:nth-child(8)>a")).click();
        driver.findElement(By.cssSelector("option[value='Java']")).click();
        driver.findElement(By.cssSelector("option[value='United States']")).click();
        driver.findElement(By.cssSelector("option[value='United States of America']")).click();
        driver.findElement(By.cssSelector("option[value='1989']")).click();
        driver.findElement(By.cssSelector("option[value='August']")).click();
        driver.findElement(By.cssSelector("option[value='11']")).click();
        driver.findElement(By.cssSelector("#firstpassword")).sendKeys("Dd2Dd2");
        driver.findElement(By.cssSelector("#secondpassword")).sendKeys("Dd2Dd2");
        driver.findElement(By.id("submitbtn")).click();

        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals("http://demo.automationtesting.in/WebTable.html",url);

    }
}