package TestWithTrello;

import Help.OpenBrowsers;
import WithTrello.Pages.Boards;
import WithTrello.Pages.TrelloHomePage;
import WithTrello.Pages.TrelloSingIn;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSignIn {

    static WebDriver driver;
    static TrelloSingIn singIn;
    static Boards boards;

    @BeforeSuite
    public void setUp() {
        driver = OpenBrowsers.openBrowser("chrome");
//        driver.get("http://a.testaddressbook.com/sign_in");
        driver.get("https://trello.com");
    }

    @Test(priority = 1)
    public void testEnterEmail() throws InterruptedException {

        TrelloHomePage homePage = new TrelloHomePage(driver);
        singIn = homePage.login();
        singIn.setEmail("ammar.alhazinah@gmail.com");
        singIn.clickSignInBtn();

//        String text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/section/div[1]/div[1]/div/div")).getText();
//        Assert.assertEquals(text, "Log in to continue to:");

    }

    @Test(priority = 2)
    public void testEnterPassword() throws InterruptedException {
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
                */
        Thread.sleep(3000);
        singIn.setPassword("test@123");
        singIn.clickLogin();

    }

   /* @Test(priority = 3)
    public void testClickCreateBoard() throws InterruptedException {
        Thread.sleep(5000);
        boards = new Boards(driver);
        boards.clickCreateBtn();
        Thread.sleep(1000);
        boards.clickCreateBoardBtn();
        boards.setBoardTitleBoxTxt("Test With Selenium");
        Thread.sleep(3000);
        boards.boardCreateBtnClick();
    }

    *//*@Test(priority = 4)
    public void testDeleteBoard() throws InterruptedException {
        boards.closeAndDeleteBoard();
    }*//*
    @Test(priority = 5)
    public void testAddCard() throws InterruptedException {
        boards.addCardClick("Card Title Test");
    }
*/
    @AfterSuite
    public void quite() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
