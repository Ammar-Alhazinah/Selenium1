package WithTrello.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrelloHomePage {
    private WebDriver driver;
    //    private By signInBtn = By.name("commit");
    private By loginBtn = By.xpath("//*[@id=\"BXP-APP\"]/header[1]/div/div[1]/div[2]/a[1]");

    public TrelloHomePage(WebDriver driver){
        this.driver = driver;
    }
    public TrelloSingIn login(){
        driver.findElement(loginBtn).click();

        return new TrelloSingIn(driver);
    }

}
