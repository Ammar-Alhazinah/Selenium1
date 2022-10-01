import Help.OpenBrowsers;
import Pages.SignIn;
import Pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAddressPage {
    static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = OpenBrowsers.openBrowser("chrome");
        driver.get("http://a.testaddressbook.com/sign_in");
    }

    @Test
    public void testSingIn() throws InterruptedException {

        SignIn signIn = new SignIn(driver);
        signIn.setEmail("ammarhz117@gmail.com");
        signIn.setPassword("ammar@123");
        Thread.sleep(3000);
        signIn.clickSignInBtn();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "testSingIn")
    public void testClickAddressLink() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        Thread.sleep(2000);
        System.out.println();
        welcomePage.clickAddressLink();
    }
/*
    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }*/
}
