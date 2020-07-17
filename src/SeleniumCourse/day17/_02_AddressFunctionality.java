package SeleniumCourse.day17;

import SeleniumCourse.utils.BaseDriver;
import SeleniumCourse.utils.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class _02_AddressFunctionality extends BaseDriver {

    ReusableMethods reusableMethods = new ReusableMethods();

    /*
        TestNG run the @Test's alphabetical order as default
            1-AddAddress
            2-DeleteAddress
            3-EditAddress

        To change the order we can use as -->  @Test(priority = 1)


     */

    @Test
    public void AddAddress() {



        WebElement AddressBookButton = driver.findElement(By.linkText("Address Book"));
        AddressBookButton.click();

        WebElement NewAddressButton = driver.findElement(By.linkText("New Address"));
        NewAddressButton.click();

        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        inputFirstName.sendKeys("Johhny");

        WebElement inputLastName = driver.findElement(By.id("input-lastname"));
        inputLastName.sendKeys("Cash");

        WebElement inputCompany = driver.findElement(By.id("input-company"));
        inputCompany.sendKeys("Techno Strudy");

        WebElement inputAddress1 = driver.findElement(By.id("input-address-1"));
        inputAddress1.sendKeys("600 perry Ellis Dr");

        WebElement inputAddress2 = driver.findElement(By.id("input-address-2"));
        inputAddress2.sendKeys("Apt 2");

        WebElement inputCity = driver.findElement(By.id("input-city"));
        inputCity.sendKeys("12312323123123123123");

        WebElement inputPostcode = driver.findElement(By.id("input-postcode"));
        inputPostcode.sendKeys("12345");

        WebElement countryDropdown = driver.findElement(By.id("input-country"));

        reusableMethods.selectByIndex(countryDropdown);

//        why thread sleep is inside try catch block?
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        WebDriverWait wait = new WebDriverWait(driver , 10);
//
//        By optionsForState = By.xpath("//select[@id='input-zone']/option");
//
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(optionsForState , 3));

        WebElement StateDropdown = driver.findElement(By.id("input-zone"));

        reusableMethods.selectByIndex(StateDropdown);

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        reusableMethods.verifySuccessMessage(driver);
    }

    @Test(dependsOnMethods = "AddAddress")
    public void editAddress(){

        WebElement AddressBookButton = driver.findElement(By.linkText("Address Book"));
        AddressBookButton.click();

        /*
            Click on last edit button

         */

        List<WebElement> editOptions = driver.findElements(By.xpath("//a[text()='Edit']"));

        editOptions.get(editOptions.size()-1).click(); // list is start counting from 0 and size is start counting from 1
//                                              To get the last element from the list we need to use -1

        WebElement firstNameInput = driver.findElement(By.id("input-firstname"));
        firstNameInput.clear();
        firstNameInput.sendKeys("Keanu");

        WebElement lastNameInput = driver.findElement(By.id("input-lastname"));
        lastNameInput.clear();
        lastNameInput.sendKeys("Rives");

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        reusableMethods.verifySuccessMessage(driver);

    }

    @Test(dependsOnMethods = "editAddress")
    public void deleteAddress(){

        WebElement AddressBookButton = driver.findElement(By.linkText("Address Book"));
        AddressBookButton.click();

        List<WebElement> deleteList = driver.findElements(By.xpath("//a[text()='Delete']"));
        deleteList.get(deleteList.size()-1).click();

        reusableMethods.verifySuccessMessage(driver);

    }

}

    /*
        Create a Method which is choosing the element from the dropdown
     */

        /*
            StaleElementReferenceException
                After find the element page is refreshed that is why element is not able find it
         */
