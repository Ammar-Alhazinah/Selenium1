package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    private WebDriver driver;
    private By emailTextBox = By.id("session_email");
    private By passwordTextBox = By.id("session_password");
//    private By signInBtn = By.name("commit");
    private By signInBtn = By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input");
    private By text = By.xpath("/html/body/div/div/h1");

    public SignIn(WebDriver driver){
        this.driver = driver;
    }
    public void setEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickSignInBtn(){
        driver.findElement(signInBtn).click();

    }
//    public String getText(){
//        return text.get
//    }

}
