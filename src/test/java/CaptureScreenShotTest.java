import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class CaptureScreenShotTest {

    @Test
    public void screenShotTest() throws IOException {

        // set up driver and chromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // go to the application
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

        //Find logo and save as webElement
        WebElement logo=driver.findElement(By.cssSelector("#divLogo"));

        //get the screenshot of webElement
        File file=logo.getScreenshotAs(OutputType.FILE);

        //save screenshot into our project directory
        File destinationFile= new File("logo.png");
        FileUtils.copyFile(file, destinationFile);

        driver.quit();

    }


}