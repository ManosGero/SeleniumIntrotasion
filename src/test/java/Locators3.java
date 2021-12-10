import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.xpath("//div[1]//button//following-sibling::button[1]")).getText());


        driver.close();
    }
}
