import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

    private static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    public void doLogin() throws InterruptedException {

        driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("dfsvsv");
        driver.findElement(By.xpath("//span[text()='Next']")).click();

    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
