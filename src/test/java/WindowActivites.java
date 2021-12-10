import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowActivites {
    public static void main(String[] args) {
        //FirefoxDriver
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.delasalle.gr");
        driver.navigate().to("https://www.epsilonnet.gr");
        driver.navigate().back();
        driver.navigate().refresh();
    }
}
