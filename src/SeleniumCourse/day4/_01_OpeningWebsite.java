package SeleniumCourse.day4;

import SeleniumCourse.utils.BaseDriver;

public class _01_OpeningWebsite extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://formsmarts.com/form/yu?mode=h5");  // this will open the website and wait until full load
        Thread.sleep(3000); // wait for 3 seconds
        driver.quit();
    }
}
