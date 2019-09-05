package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GoogleResultPage {


    private final WebDriver driver;
    public By resultsStats = By.id("resultStats");

    public GoogleResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertResultPage() {
        String textToExpect = "results";

        WebElement element = driver.findElement(resultsStats);
        boolean actualResult = element.getText().contains(textToExpect);
        System.out.println("results page contains " + textToExpect + ":" + actualResult);
        boolean expectedResult = true;
        String message = "\"" + textToExpect + "\" text is NOT showing on the Results Page";
        Assert.assertEquals(actualResult, expectedResult, message);
    }
}
