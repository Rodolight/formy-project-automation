import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/arieshome/Desktop/Projects/Exercise Files/02_02/start/chromedriver_mac_arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);
        waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        driver.quit();
    }

    private static  void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Rodolfo");
        driver.findElement(By.id("last-name")).sendKeys("De Pena");
        driver.findElement(By.id("job-title")).sendKeys("QA Analyst");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='3']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("08/18/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    private static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
    }

    private static  String getAlertBannerText(WebDriver driver){
        return driver.findElement(By.cssSelector(".alert.alert-success")).getText();
    }

}
