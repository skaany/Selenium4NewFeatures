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

public class LocationTest {

    @Test
    public void locationTest() throws IOException {

        // set up driver and chromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // go to the application
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

        //Find logo and save as webElement
        WebElement logo=driver.findElement(By.cssSelector("#divLogo"));

        // Height of logo
        System.out.println("Height: "+logo.getRect().getDimension().getHeight());
        //Width of logo
        System.out.println("Width: "+logo.getRect().getDimension().getWidth());
        //x coordinates of logo
        System.out.println("X Location: "+logo.getRect().getX());
        //y coordinates of logo
        System.out.println("Y Location: "+logo.getRect().getY());

        driver.quit();

    }
}
