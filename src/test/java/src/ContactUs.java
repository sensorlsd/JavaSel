package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ContactUs {
    public static void main(String[] args) throws InterruptedException {

        // 1. Open browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dmitry.Nahliuk\\IdeaProjects\\autoBDD\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        // 2. Navigate to web page
        driver.get("http://sgp-dev.skywindtech.corp:8080/simulation-web-app/spring/auth/login;jsessionid=965701D6495C9C5CBC6FCE3720814407");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        // 3. Fill required field
        driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("Dmitry.Nahliuk");
        driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("qwe123QWE");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/table/tbody/tr[3]/td/input")).click();
        Thread.sleep(2000);
        driver.quit();

        // 4. Click submit

        // 5. Close browser


    }
}
