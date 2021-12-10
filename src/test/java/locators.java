import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

    public static void main(String[] args) {

        //ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //EdgeDriver
		WebDriverManager.edgedriver().setup();
		WebDriver driverE  = new EdgeDriver();

		//FirefoxDriver
		WebDriverManager.firefoxdriver().setup();
		WebDriver  driverF = new FirefoxDriver();



        driver.get("https://www.delasalle.gr");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driverE.get("https://www.delasalle.gr");
        System.out.println(driverE.getTitle());
        System.out.println(driverE.getCurrentUrl());
        System.out.println(driverE.getPageSource());

        driverF.get("https://www.delasalle.gr");
        System.out.println(driverF.getTitle());
        System.out.println(driverF.getCurrentUrl());
        System.out.println(driverF.getPageSource());

        //driver.close();
        driver.quit();
        driverE.quit();
        driverF.quit();
    }
}
