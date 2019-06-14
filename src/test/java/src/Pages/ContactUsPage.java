package src.Pages;

import org.joda.time.Seconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContactUsPage {

    private final WebDriver driver;

    public ContactUsPage (WebDriver driver) {
        this.driver = driver;
    }

    private By contactUsBtn      = By.cssSelector("#contact-us h1");
    private By firstNameField    = By.xpath("//form[@id='contact_form']/input[@name='first_name']");
    private By lastNameField     = By.xpath("//form[@id='contact_form']/input[@name='last_name']");
    private By emailAddressField = By.xpath("//form[@id='contact_form']/input[@name='email']");
    private By commentsFields    = By.xpath("//form[@id='contact_form']/textarea[@name='message']");
    private By resetBtn          = By.xpath("//div[@id='form_buttons']/input[@value='RESET']");
    private By submitBtn         = By.xpath("//div[@id='form_buttons']/input[@value='SUBMIT']");

    public ContactUsPage typeContactUsBtn() {
        driver.findElement(contactUsBtn).isDisplayed();
        driver.findElement(contactUsBtn).click();
        return this;
    };

    public ContactUsPage typeFiestName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    };

    public ContactUsPage typeLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    };

    public ContactUsPage typeEmailAddress(String email) {
        driver.findElement(emailAddressField).sendKeys(email);
        return this;
    };

    public ContactUsPage typeComment(String comments) {
        driver.findElement(commentsFields).sendKeys(comments);
        return this;
    };

    public ContactUsPage typeResetBtn() {
        driver.findElement(resetBtn).click();
        return this;
    };

    public ContactUsPage typeSubmitBtn() {
        driver.findElement(submitBtn).click();
        return this;
    };

    public ContactUsPage getTitle(String title){
       Assert.assertEquals(title, driver.getTitle());
        return this;
    }

}