package SeleniumCourse.day11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumCourse.Utils.BaseDriver;

import java.util.Set;

public class _04_NewWindowsTask extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        // click on the new window button, and verify that in new windows you have text: "This is a sample page"
        String mainWindow = driver.getWindowHandle();

        // click on the new window button
        driver.findElement(By.id("tabButton")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle: windowHandles) {
            if(!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                WebElement sampleHeading = driver.findElement(By.id("sampleHeading"));
                Assert.assertEquals("This is a sample page", sampleHeading.getText());
            }
        }
    }
}
