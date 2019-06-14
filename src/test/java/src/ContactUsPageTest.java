package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Pages.ContactUsPage;

import java.util.concurrent.TimeUnit;

public class ContactUsPageTest {
    WebDriver driver;
    ContactUsPage page;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmitry.Nahliuk\\IdeaProjects\\autoBDD\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void fillAllField(){
        page = new ContactUsPage(driver);
        try {
            page.getTitle("WebDriver | Contact Us")
                    .typeFiestName("Sensor")
                    .typeLastName("Wolf")
                    .typeEmailAddress("yesy@yesy.com")
                    .typeComment("come text for texts")
                    .typeSubmitBtn();
        } finally {
            driver.quit();
        }
    }
}
