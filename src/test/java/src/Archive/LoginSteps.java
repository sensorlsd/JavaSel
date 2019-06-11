package src.Archive;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;


    @Before()
    public void setup() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Dmitry.Nahliuk\\IdeaProjects\\autoBDD\\src\\main\\resources\\drivers\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @After()
    public void quit() {
        this.driver.quit();
    }

    @Given("User navigate to stackoverflow website")
    public void user_navigate_to_stackoverflow_website() {
        this.driver.get("https://stackoverflow.com/");

    }

    @Given("User click the login button")
    public void user_click_the_login_button() {
        this.driver.findElement(By.xpath("/html/body/header/div/ol/li[6]/a[1]")).click();

    }

    @Given("User enters a valid username")
    public void user_enters_a_valid_username() {
        this.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sensorlsd@gmail.com");

    }

    @Given("User enters a valid password")
    public void user_enters_a_valid_password() {
        this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("5602422sensor");

    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        this.driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();

    }

    @Then("User should be takes to the successful login page")
    public void user_should_be_takes_to_the_successful_login_page() throws InterruptedException {
        Thread.sleep(2500);
        String  generalTitle= driver.getTitle();
        Assert.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers", generalTitle);
        WebElement askQuestion = driver.findElement(By.xpath("//*[@id=\"mainbar\"]/div[1]/div/a"));
        Assert.assertEquals(true, askQuestion.isDisplayed());
    }

}
