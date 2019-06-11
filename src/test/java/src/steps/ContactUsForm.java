package src.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public  class ContactUsForm {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Dmitry.Nahliuk\\IdeaProjects\\autoBDD\\src\\main\\resources\\drivers\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @After
    public void exit(){
        this.driver.quit();
    }

    @Given("User navigate to general page of the WebDriverUniversity")
    public void user_navigate_to_general_page_of_the_WebDriverUniversity() {
        this.driver.get("http://webdriveruniversity.com/");
    }

    @When("User click the Login button")
    public void user_click_the_Login_button() {
        this.driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));

    }

    @When("User fill name field")
    public void user_fill_name_field() {
        this.driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("Wolf Hunters");

    }

    @When("User fill password field")
    public void user_fill_password_field() {
        this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234567890");

    }

    @When("User enter a {string} name")
    public void user_enter_a_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User click on the login button")
    public void user_click_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User should be presented with a successful validation alert")
    public void user_should_be_presented_with_a_successful_validation_alert() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User should be presented with a unsuccessful validation alert")
    public void user_should_be_presented_with_a_unsuccessful_validation_alert() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}