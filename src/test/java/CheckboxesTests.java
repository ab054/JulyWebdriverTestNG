import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckboxesTests {

    WebDriver driver;


    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\JulyWebdriverTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //TODO: find a different way of interacting with checkboxes, getting the status
    @Test
    public void test003() {

    }

    //TODO: automate a different user scenario
    @Test
    public void test002() {

    }

    //TODO: refactor it, follow the format previously written tests
    @Test
    public void test001() {
        openBrowser();

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));

        int actualNumberOfInputs = listOfInputs.size();
        int expectedNumberOfInputs = 2;

        Assert.assertEquals(actualNumberOfInputs, expectedNumberOfInputs, "");

        WebElement firstInput = listOfInputs.get(0);
        WebElement secondInput = listOfInputs.get(1);

        String isFirstChecked = firstInput.getAttribute("checked");
        String isSecondChecked = secondInput.getAttribute("checked");

        Assert.assertEquals(isFirstChecked, null);
        Assert.assertEquals(isSecondChecked, "true");

        firstInput.click();
        secondInput.click();

        isFirstChecked = firstInput.getAttribute("checked");
        isSecondChecked = secondInput.getAttribute("checked");

        Assert.assertEquals(isFirstChecked, "true");
        Assert.assertEquals(isSecondChecked, null);
    }
}
