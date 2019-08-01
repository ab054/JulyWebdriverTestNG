import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicAuthTest {

    WebDriver driver;

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\JulyWebdriverTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //TODO: automate a different scenario (negative case?)
    //TODO: eliminate the leftover from previously running test method
    @Test
    public void test002() {
        String url = "http://the-internet.herokuapp.com/basic_auth";
        driver.get(url);
    }

    //TODO: refactor this test method
    @Test
    public void test0001() {
        openBrowser();

        String username = "admin";
        String password = "admin";

        String link = "the-internet.herokuapp.com/basic_auth";

        String url = "http://" + username + ":" + password + "@" + link;

        driver.get(url);

        String textToCheck = "Congratulations! You must have the proper credentials.";

        String pageSource = driver.getPageSource();

        Assert.assertTrue(pageSource.contains(textToCheck));

        boolean isParagraphVisible = driver.findElement(By.tagName("p")).isDisplayed();

        boolean expectedVisibility = true;

        Assert.assertEquals(isParagraphVisible, expectedVisibility);

    }
}
