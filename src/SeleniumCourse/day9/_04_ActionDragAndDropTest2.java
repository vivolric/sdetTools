package SeleniumCourse.day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utils.BaseDriver;

import java.util.List;

public class _04_ActionDragAndDropTest2 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement saleButton = driver.findElement(By.id("credit1"));
        WebElement dropZone = driver.findElement(By.id("loan"));
        (new Actions(driver))
                .clickAndHold(saleButton)
                .moveToElement(dropZone)
                .release()
                .perform();

        // you can search inside another element reference
        List<WebElement> elements = dropZone.findElements(By.cssSelector("li"));
        boolean found = false;
        for(WebElement element : elements) {
            String elementText = element.getText();
            if(elementText.equals(saleButton.getText())) {
                found = true;
                break;
            }
        }

        Assert.assertTrue( "Could not find loan in dropzone",found);
    }

}
