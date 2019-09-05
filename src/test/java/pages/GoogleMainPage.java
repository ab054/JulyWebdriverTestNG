package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {

    WebDriver driver;
    private String googleMainPageURL = "https://google.com";
    private By searchInput = By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input");



    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage() {
        driver.get(googleMainPageURL);
    }

    public void typeQuery(String queryText) {
        WebElement element = driver.findElement(searchInput);
        element.sendKeys(queryText);
        System.out.println("text " + queryText + " been typed");
    }

    public void typeQuery() {
        WebElement element = driver.findElement(searchInput);
        element.sendKeys("TEXT");
        System.out.println("text " + "TEXT" + " been typed");
    }

    public void submitSearch() {
        WebElement element = driver.findElement(searchInput);
        element.submit();
        System.out.println("search submitted");
    }
}
