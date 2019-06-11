package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUsPage clickStartBtn() {
      driver.findElement(By.xpath("asd"));
      return this;
    };

    public ContactUsPage fillFields() {
        driver.findElement(By.xpath("asd"));
        return this;
    };
}
