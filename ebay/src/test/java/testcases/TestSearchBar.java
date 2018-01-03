package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObject.Home_Page;

public class TestSearchBar extends CommonAPI {

    @Test
    public void testProductSearch(){
        Home_Page sr = PageFactory.initElements(driver, Home_Page.class);
        sr.searchItem();
    }
}
