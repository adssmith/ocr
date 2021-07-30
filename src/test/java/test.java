import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class test {
    WebDriver driver;

    @BeforeMethod
    public void enter() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        options.addArguments("--window-position=1920,0");
//      options.addArguments("--window-position=2560,250");
        options.addArguments("--window-size=1920,1050");
        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        this.driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void takeScreenShotOnFailure() {
        driver.quit();
    }

    @Test(invocationCount=500, timeOut=5000)
    public void uploadPassport() {
        OCR ocr = new OCR(driver);
        ocr.setDocPassport();
    }

    @Test(invocationCount=500, timeOut=5000)
    public void uploadVU() {
        OCR ocr = new OCR(driver);
        ocr.setDocVU();
    }
}
