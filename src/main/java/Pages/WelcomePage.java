package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    private WebDriver driver;
    private By emailTextBox = By.id("session_email");
    private By passwordTextBox = By.id("session_password");
    //    private By signInBtn = By.name("commit");
    private By addressLink = By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]");

    public WelcomePage(WebDriver driver){
        this.driver = driver;
    }
    public void setEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public AddressPage clickAddressLink(){
        driver.findElement(addressLink).click();

       return new AddressPage(driver);

    }

}

