import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OCR {
    WebDriver driver;

    public OCR(WebDriver driver) {
        this.driver = driver;
    }

    public void setDocPassport() {
        driver.get("http://ocr2.ads-soft.ru/recognizer/interface");
        By fileInput = By.cssSelector("input[type=file]");
        String filePath = "C:\\Upload\\passport.jpg";
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(By.cssSelector(".mt-3")).click();
    }
    public void setDocVU() {
        driver.get("http://ocr2.ads-soft.ru/recognizer/interface");
        By fileInput = By.cssSelector("input[type=file]");
        String filePath = "C:\\Upload\\vu.jpg";
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(By.cssSelector(".mt-3")).click();
    }
}
