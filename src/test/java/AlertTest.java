import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertTest {
    @Test
    void test(){
        System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sc.npru.ac.th/sc_shortcourses/signup");

        Select nameTitle = new Select(driver.findElement(By.id("nameTitleTha")));
        nameTitle.selectByValue("นางสาว");
        nameTitle.selectByValue("นาง");
        nameTitle.selectByValue("นาย");

        WebElement firstName = driver.findElement(By.id("firstnameTha"));
        firstName.sendKeys("วิศรุต");

        WebElement lastName = driver.findElement(By.id("lastnameTha"));
        lastName.sendKeys("แซ่เล้า");

        Select nameTitleEng = new Select(driver.findElement(By.id("nameTitleEng")));
        nameTitleEng.selectByValue("Ms.");
        nameTitleEng.selectByValue("Mrs.");
        nameTitleEng.selectByValue("Mr.");

        WebElement firstNameEng = driver.findElement(By.id("firstnameEng"));
        firstNameEng.sendKeys("Wisarut");

        WebElement lastNameEng = driver.findElement(By.id("lastnameEng"));
        lastNameEng.sendKeys("Saelao");

        Select birthDate = new Select(driver.findElement(By.id("birthDate")));
        birthDate.selectByValue("16");

        Select birthMonth = new Select(driver.findElement(By.id("birthMonth")));
        birthMonth.selectByValue("10");

        Select birthYear = new Select(driver.findElement(By.id("birthYear")));
        birthYear.selectByValue("2004");

        WebElement idCard = driver.findElement(By.id("idCard"));
        idCard.sendKeys("1700400000090");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("adcDEF123");

        WebElement mobile = driver.findElement(By.id("mobile"));
        mobile.sendKeys("0656683656");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ggjj4511@gmail.com");

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("MJ2 ถนนมาลัยแมน");

        Select province = new Select(driver.findElement(By.id("province")));
        province.selectByValue("นครปฐม");

        WebElement district = driver.findElement(By.id("district"));
        district.sendKeys("เมือง");

        WebElement subDistrict = driver.findElement(By.id("subDistrict"));
        subDistrict.sendKeys("วังตะกู");

        WebElement postalCode = driver.findElement(By.id("postalCode"));
        postalCode.sendKeys("73000");

//        WebElement accept = driver.findElement(By.id("accept"));
        WebElement testCheck = driver.findElement(By.xpath("//*[@id=\"accept\"]"));
        // แก้การทับซ้อนของ element โดยใช้ js กดปุ่มแทน
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("Before: " + testCheck.isSelected());
        if(!testCheck.isSelected()){
            js.executeScript("arguments[0].click();", testCheck);
            System.out.println("After: " + testCheck.isSelected());
        }

        driver.quit();
    }
}
