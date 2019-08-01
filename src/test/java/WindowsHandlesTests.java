import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class WindowsHandlesTests {

    WebDriver driver;

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\JulyWebdriverTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //TODO: automate a different test scenario
    @Test
    public void test002() {

    }

    @Test
    public void test001() throws InterruptedException {
        openBrowser();

        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        String originWindow = driver.getWindowHandle();

        clickHereLink.click();

        String afterClickWindow = driver.getWindowHandle();


        //TODO: why originWindow = afterClickWindow
        //Assert.assertNotEquals(originWindow, afterClickWindow);


        //TODO change to explicit wait
        sleep(3);
        Set<String> allWindowHandles = driver.getWindowHandles();


        //TODO: change the assertion to have clear Assertion Errors
        Assert.assertTrue(allWindowHandles.size() == 2);

        String[] allWindowsArray = allWindowHandles.toArray(new String[]{""});

        String firstWindow = allWindowsArray[0];
        String secondWindow = allWindowsArray[1];

        driver.switchTo().window(firstWindow);

        String actualWindowTitle = driver.getTitle();
        String expectedWindowTitle = "The Internet";

        Assert.assertEquals(actualWindowTitle, expectedWindowTitle);



    }
}
