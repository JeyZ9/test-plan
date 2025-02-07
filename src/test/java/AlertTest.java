import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    @Test
    void test(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/index.html");
        WebElement btnAlert = driver.findElement(By.id("alertBtn"));
        btnAlert.click();

        Alert alert = driver.switchTo().alert();
        String msg_alert = alert.getText();
        System.out.printf("Message: %s", msg_alert);
        alert.dismiss();
    }
}
