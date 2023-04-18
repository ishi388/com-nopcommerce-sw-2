package testsuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends LoginTest {
    String baseUrl = "https://demo.nopcommerce.com/";

//    @Before
//
//    public void setBaseUrl()
//    {
//        setUp();
//    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully()
    {
        // userShouldNavigateToLoginPageSuccessfully();
        //userShouldLoginSuccessfullyWithValidCredentials();
        String expectedMessage = "Computers";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to computer page",expectedMessage,actualMessageText);


    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        String expectedMessage = "Electronics";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Electronics page",expectedMessage,actualMessageText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessful()
    {
        String expectedMessage = "Apparel";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Apparel page",expectedMessage,actualMessageText);
    }

    @Test

    public void userShouldNavigateToDigitalDownloadsPageSuccessful()
    {
        String expectedMessage = "Digital downloads";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Digital downloads page",expectedMessage,actualMessageText);
    }

    @Test

    public void userShouldNavigateToBooksPageSuccessfully()
    {
        String expectedMessage = "Books";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Books page",expectedMessage,actualMessageText);
    }
    @Test

    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        String expectedMessage = "Jewelry";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Jewelry page",expectedMessage,actualMessageText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessful()
    {
        String expectedMessage = "Gift Cards";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Gift Cards page",expectedMessage,actualMessageText);
    }

}
