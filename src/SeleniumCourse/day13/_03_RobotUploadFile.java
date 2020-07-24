package SeleniumCourse.day13;

import org.openqa.selenium.By;
import SeleniumCourse.Utils.BaseDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _03_RobotUploadFile extends BaseDriver {
    public static void main(String[] args) throws InterruptedException, AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        driver.findElement(By.id("file_wraper0")).click();

        String pathToFile = "C:\\Users\\User\\Desktop\\test.txt";

        // using below I can create text in my paste clipboard, so later I can use CTRL+V to paste
        // this is like pressing CTRL+C on pathToFile
        StringSelection stringSelection = new StringSelection(pathToFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        Robot robot = new Robot();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("submitbutton")).click();
    }
}
