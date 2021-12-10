import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class locators2 {
    public static void main(String[] args) {
        // login page testing :  https://www.rahulshettyacademy.com/locatorspractice/
        //first Login Page  Testing using maven selenium-java and Testng
        //initialize WebDriver

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        String name = "ManosGero";
        String pass = getPass(driver);
        //System.out.println(pass);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pass);
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class= 'login-container']//h2 ")).getText(),"Hello "+name+",");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class= 'login-container']//h1")).getText(),"Welcome to Rahul Shetty Academy");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

        driver.close();
    }

    private static String getPass(WebDriver driver) {

        driver.findElement(By.linkText("Forgot your password?")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("button[class*='reset-pwd-btn']")).click();
        String passString = driver.findElement(By.cssSelector("p.infoMsg")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] arrayPass = passString.split("'");
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        return arrayPass[1].split("'")[0];
    }


}












