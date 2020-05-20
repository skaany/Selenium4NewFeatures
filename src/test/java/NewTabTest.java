import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTabTest {

    @Test
    public void newTabTest(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");

        //switching to new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");



        driver.quit();
    }
}
