import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/arieshome/Desktop/Projects/Exercise_Files/02_02/start/chromedriver_mac_arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();

//        dropdownMenu.click();
//        WebElement dropdown = driver.findElement(By.cssSelector("body > div > div > div > a:nth-child(6)"));
//        dropdown.click();

        driver.quit();
    }
}
