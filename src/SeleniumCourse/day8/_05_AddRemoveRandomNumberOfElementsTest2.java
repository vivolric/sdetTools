package SeleniumCourse.day8;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumCourse.Utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class  _05_AddRemoveRandomNumberOfElementsTest2 extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButton=driver.findElement(By.cssSelector("button[onclick='addElement()'"));

        Random rndm=new Random();
        int createNum=rndm.nextInt(10);
        System.out.println("createNum = "+ createNum);
        for (int i=0;i<=createNum;i++){
            addButton.click();
        }

        int delNum=rndm.nextInt(10);
        System.out.println("delNum = "+ delNum);
        try{
            for (int i=0;i<=delNum;i++){
                driver.findElement(By.cssSelector("button[onclick='deleteElement()'")).click();
            }

            List<WebElement> elementLeft = driver.findElements(By.cssSelector("button[onclick='deleteElement()'"));

            Assert.assertEquals((createNum-delNum), elementLeft.size());

        } catch (Exception e){
            System.out.println("No more element!!!");
        }

        driver.quit();
    }

}
