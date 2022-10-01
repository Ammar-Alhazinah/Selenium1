import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Help.OpenBrowsers;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
        import org.testng.annotations.Test;

public class TestOpenBrowser {

    public static WebDriver openBrowser(String webDriverName) {

        WebDriver driver;
        if (webDriverName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

            //Instantiating driver object
            driver = new ChromeDriver();
        } else {
            driver = null;
        }

        return driver;
    }


    @Parameters({"webDriverName"})
    @Test
    public void testOne(String webDriverName) throws InterruptedException {
        WebDriver driver = OpenBrowsers.openBrowser(webDriverName);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.quit();

    }


}