
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.GoogleMainPage;
import pages.GoogleResultPage;

public class GoogleSearchPOM extends BaseTest {

    @Test
    public void test00001() {
        String testData1 = "portnov computer school";

        GoogleMainPage mainPage = new GoogleMainPage(driver);
        GoogleResultPage resultPage = new GoogleResultPage(driver);

        mainPage.openPage();
        mainPage.typeQuery(testData1);
        mainPage.submitSearch();
        waitForElement(resultPage.resultsStats);
        resultPage.assertResultPage();
    }

    @DataProvider(name = "myDataProvider")
    public Object[][] createData1() {
        return new Object[][] {
                { "portnov computer school", 1 },
                { "portnov computer school address", 2},
        };
    }


    @Test(dataProvider = "myDataProvider")
    public void test00002(String searchText, Integer testDataRowNumber) {

        System.out.println("TEST DATA: " + testDataRowNumber);

        GoogleMainPage mainPage = new GoogleMainPage(driver);
        GoogleResultPage resultPage = new GoogleResultPage(driver);

        mainPage.openPage();
        mainPage.typeQuery(searchText);
        mainPage.submitSearch();
        waitForElement(resultPage.resultsStats);
        resultPage.assertResultPage();
    }

    public void waitForElement(By element) {
        System.out.println("NOT WAITING BUT PRINTING OUT");
    }


}
