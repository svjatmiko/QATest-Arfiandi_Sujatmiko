import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Cart {
    public static void main() {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement titleOnList =  driver.findElement(By.id("item_4_title_link"));
        String actualText = titleOnList.getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        WebElement titleOnCart =  driver.findElement(By.id("item_4_title_link"));
        String expectedText = titleOnCart.getText();
        Assert.assertEquals(actualText,expectedText,"Element text does not match!");
        driver.quit();

    }
}
