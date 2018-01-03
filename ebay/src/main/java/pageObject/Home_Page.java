package pageObject;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends CommonAPI {
    @FindBy(id = "gh-ac")
    public static WebElement searchBar;

    public void searchItem() {
        // search by product search option
        searchBar.sendKeys("tablet", Keys.ENTER);
        System.out.println("Get Product Search Page Title: " + driver.getTitle());
    }
}