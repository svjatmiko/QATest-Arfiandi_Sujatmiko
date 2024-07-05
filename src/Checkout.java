import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Checkout {
    public static void main() {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement titleOnList = driver.findElement(By.id("item_4_title_link"));
        String actualText = titleOnList.getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("Test");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("continue")).click();
        WebElement titleOnCheckout = driver.findElement(By.id("item_4_title_link"));
        String expectedText = titleOnCheckout.getText();
        Assert.assertEquals(actualText,expectedText,"Element text does not match!");
        driver.quit();
    }
}
