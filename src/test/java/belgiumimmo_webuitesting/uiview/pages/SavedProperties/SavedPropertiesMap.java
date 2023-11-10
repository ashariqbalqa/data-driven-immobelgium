package belgiumimmo_webuitesting.uiview.pages.SavedProperties;

import core.base_ui.BaseWebUIMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedPropertiesMap extends BaseWebUIMap {
    @FindBy(className = "//div[@class='title header-title']")
    private WebElement SavedPropertiesTitle;
    @FindBy (className= "//button[@class='ant-dropdown-trigger header-button dropdown-item ant-dropdown-open']")
    private WebElement ClickShowingAllDropDown;
    @FindBy (className= "//div[@id='__next']/div/div[2]/div/div[2]/div/div/div[2]/button[2]")
    private WebElement ClickSortedByDateDropDown;

    public WebElement getSavedPropertiesTitle(){return SavedPropertiesTitle;}
    public WebElement getClickShowingAllDropDown(){return ClickShowingAllDropDown;}
    public WebElement getClickSortedByDateDropDown(){return ClickSortedByDateDropDown;}


}
