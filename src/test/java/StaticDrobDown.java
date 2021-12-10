import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDrobDown {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // page :    https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"USD");
        dropdown.selectByVisibleText("AED");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"AED");


        driver.quit();


    }
}
