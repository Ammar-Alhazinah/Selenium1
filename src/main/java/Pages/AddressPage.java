package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddressPage {

    private WebDriver driver;
    private By tableRow = By.xpath("/html/body/div/table/tbody/tr");
    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }
    private int getNumberOfRows(){
        List<WebElement> rows = driver.findElements(tableRow);
        return rows.size();
    }
}
