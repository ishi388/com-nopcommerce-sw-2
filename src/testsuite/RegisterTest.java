package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends TopMenuTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        // Find 'Register' element and click on 'Register'
        driver.findElement(By.linkText("Register")).click();
        String expectedMessage = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Register text displayed", expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldRegisterAccountSuccessfully() {
        //find 'Register' element and click on 'Register'
        driver.findElement(By.linkText("Register")).click();
        //Find Gender radio button element and select male element
        WebElement radio1 = driver.findElement(By.xpath("//input[@id='gender-male']"));
        radio1.click();
        //Find Gender radio button element and select female element
        WebElement radio2 = driver.findElement(By.xpath("//input[@id='gender-female']"));
        radio2.click();
        //Find First name filed element and type first name element
        driver.findElement(By.id("FirstName")).sendKeys("ishi");
        // Find Last name field element and type last name element
        driver.findElement(By.name("LastName")).sendKeys("mal");
        //Find Day field element from 'Date of Birth' field element
        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByValue("14");
        //Find Month field element from 'Date of Birth' field element
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByVisibleText("May");
        //Find year field element from 'Date of Birth' field element
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("2004");
        // Find Email address field element and send email to email address element
        driver.findElement(By.id("Email")).sendKeys("ishi12@gmail.com");
        // Find Password field element and send password to password element
        driver.findElement(By.id("Password")).sendKeys("ishi1122");
        // Find Confirm password field element and send password to confirm password element
        driver.findElement(By.id("ConfirmPassword")).sendKeys("ishi1122");
        // Find Register button element and click
        driver.findElement(By.xpath("//button[@name= 'register-button']")).click();

        String expectedMessage = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualTextElement.getText();

        Assert.assertEquals("Your registration completed text displayed", expectedMessage, actualMessage);

    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}


