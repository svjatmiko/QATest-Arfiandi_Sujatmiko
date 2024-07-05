import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class Open {
    public static void main() {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
        driver.get("https://www.saucedemo.com");
        WebElement element =  driver.findElement(By.xpath("//div[@class='login_logo']"));
        String actualText = element.getText();
        String expectedText = "Swag Labs";
        Assert.assertEquals(actualText, expectedText, "Element text does not match!");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
    }
}
