import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void testSetup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\JulyWebdriverTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait (driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
