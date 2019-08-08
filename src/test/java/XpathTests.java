import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\JulyWebdriverTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    //TODO: use all of the ways in your existing code
    @Test
    public void testXpaths() {
        String absXpath = "/html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]";
        String relXpath = "//form/div[1]/div/div[1]/div/div/input[1]";

        String xpath1 = "//input[@name='username']";
        String xpath2 = "//input[@name='username'][@type='text']";
        String xpath3 = "//input[@name='username' and @type='text']";
        String xpath4 = "//input[@name='username' or @username='12312312313']";
        String xpath5 = "//input[contains(@name,'user')]";
        String xpath6 = "//input[starts-with(@name,'use')]";
        String xpath7 = "//*[text()='Username']";
        String xpath8 = "//div[@class='g']";
        String xpath9 = "//div[@class='g'][last()]";
        String xpath10 = "//input[@type='text'])[position()=2]";
        String xpath11 = "//*[@id='res']/following::a[@text='text']";
        String xapth12 = "//*[@id='res']//preceding::a[@text='text']";

        driver.findElement(By.xpath(xpath8));
    }
}
