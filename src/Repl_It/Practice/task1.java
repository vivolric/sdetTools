package Repl_It.Practice;

import SeleniumCourse.utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class task1 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        //randomly select checkbox
        int randomNumber = (int) (Math.random() * 4);
        System.out.println(randomNumber);

        Thread.sleep(3000);

        List<WebElement> daysCheck = driver.findElements(By.cssSelector("span>input"));


        daysCheck.get(randomNumber).click();



        Thread.sleep(3000);
        List <WebElement> days = driver.findElements(By.cssSelector("span>label"));
        System.out.println(days.get(randomNumber).getText());

        //List<WebElement> days = driver.findElements(By.xpath("//span//input"));

//        for (WebElement day:days) {
//            System.out.println(day.getText());





        }
    }

