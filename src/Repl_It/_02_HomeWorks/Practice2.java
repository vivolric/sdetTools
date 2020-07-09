package Repl_It._02_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

        driver.get("http://demo.automationtesting.in/Register.html");



    }
}