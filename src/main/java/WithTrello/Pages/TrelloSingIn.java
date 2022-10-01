package WithTrello.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrelloSingIn {
    private WebDriver driver;
    private By emailTextBox = By.id("user");
    private By logInBtn = By.xpath("//*[@id=\"login-submit\"]/span/span");
    //    private By passwordTextBox = By.id("session_password");
    //    private By signInBtn = By.name("commit");
    private By signInBtn = By.id("login");
//    private By text = By.xpath("/html/body/div/div/h1");

    public TrelloSingIn(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {

        driver.findElement(emailTextBox).sendKeys(email);
    }

    public void setPassword(String password) {
        By passwordTextBox = By.id("password");

        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickSignInBtn() {
        driver.findElement(signInBtn).click();

    }

    public void clickLogin() {
        driver.findElement(logInBtn).click();
    }
//    public String getText(){
//        return text.get
//    }

}