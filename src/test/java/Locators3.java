import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.xpath("//header//div//button[1]//following-sibling::button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header//div//button[1]//parent::div//button[2]")).getText());


        driver.close();
    }
}
