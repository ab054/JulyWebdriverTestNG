import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    WebDriver driver;

    //TODO automate a different test case on Google search
    @Test
    public void testName() {
    }

    @Test
    public void test0001() {
        openBrowser();
        navigateToMainPage();
        typeQuory();
        submitSearch();
        assertResultPage();
    }

    private void assertResultPage() {
       String textToExpect = "results";

       WebElement element = driver.findElement(By.id("resultStats"));
       boolean actualResult = element.getText().contains(textToExpect);
       boolean expectedResult = true;
       String message = "\"" + textToExpect + "\" text is NOT showing on the Results Page";
       Assert.assertEquals(actualResult, expectedResult, message);
    }

    private void submitSearch() {
        WebElement element = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
        element.submit();
    }

    private void typeQuory() {
       WebElement element = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
       element.sendKeys("portnov computer school");

    }

    private void navigateToMainPage() {
        String url = "https://www.google.com/";
        driver.get(url);
    }

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\JulyWebdriverTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
