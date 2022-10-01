package WithTrello.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Boards {
    WebDriver driver;
    private By createBtn = By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/button");
    private By createBoardBtn = By.xpath("/html/body/div[3]/div/section/div/nav/ul/li[1]/button");

    private By boardTitleBoxTxt = By.xpath("/html/body/div[3]/div/section/div/form/div[1]/label/input");

    private By boardCreateBtn = By.xpath("/html/body/div[3]/div/section/div/form/button");

    private By closeBoard_0 = By.xpath("//*[@id=\"popover-boundary\"]/div/div[1]/nav/div[1]/div/div/div[2]/div/div[3]/ul/div[2]/li[2]/div[2]/div[1]/button");

    private By closeBoard_1 = By.xpath("/html/body/div[6]/div/section/div/div/button");

    private By closeBoard_2 = By.xpath("/html/body/div[6]/div/section/div/button");

    private By closeBoard_3 = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/div[2]/button");

    private By closeBoard_4 = By.xpath("/html/body/div[6]/div/section/div/button");

    private By addCard_0 = By.xpath("//*[@id=\"board\"]/div[1]/div/div[3]/a");

    private By addCardTitle = By.xpath(".//div//textarea[@class='list-card-composer-textarea js-card-title']");

   private By addCardBtn = By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input");
    public Boards(WebDriver driver){
        this.driver = driver;
    }
    public void clickCreateBtn(){
        driver.findElement(createBtn).click();
    }
    public void clickCreateBoardBtn(){
        driver.findElement(createBoardBtn).click();
    }

    public void setBoardTitleBoxTxt(String title){
        driver.findElement(boardTitleBoxTxt).sendKeys(title);
    }

    public void boardCreateBtnClick(){
        driver.findElement(boardCreateBtn).click();
    }
    public void closeAndDeleteBoard() throws InterruptedException {
        driver.findElement(closeBoard_0).click();
        Thread.sleep(2000);
        driver.findElement(closeBoard_1).click();
        Thread.sleep(2000);

        driver.findElement(closeBoard_2).click();
        Thread.sleep(2000);

        driver.findElement(closeBoard_3).click();
        Thread.sleep(2000);

        driver.findElement(closeBoard_4).click();
        Thread.sleep(2000);

    }

    public void addCardClick(String cardTitle) throws InterruptedException {
        driver.findElement(addCard_0).click();
        Thread.sleep(2000);

        driver.findElement(addCardTitle).sendKeys(cardTitle);
        Thread.sleep(2000);
        driver.findElement(addCardBtn).click();
    }
}
