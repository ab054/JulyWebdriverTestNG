import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    WebDriver driver;

    String testData1 = "portnov computer school";
    String testData2 = "portnov computer school address";



    //TODO automate a different test case on Google search
    @Test
    public void testName() {
    }

    @Test
    public void test0001() {
        openBrowser();
        navigateToMainPage();
        typeQuory(testData1);
        submitSearch();
        assertResultPage();
    }

    @Test
    public void test0002() {
        openBrowser();
        navigateToMainPage();
        typeQuory(testData2);
        submitSearch();
        assertResultPage();
    }

    @Parameters({ "param-name1" })
    @Test
    public void test0003(String testDataFromParameter) {
        openBrowser();
        navigateToMainPage();
        typeQuory(testDataFromParameter);
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

    private void typeQuory(String queryText) {
       WebElement element = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
       element.sendKeys(queryText);

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
