import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowTest {
    @Test
    public void newWindowTest(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");

        //switching to new Window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://amazon.com");



        driver.quit();
    }
}
