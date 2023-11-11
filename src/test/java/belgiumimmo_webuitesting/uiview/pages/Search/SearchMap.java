package belgiumimmo_webuitesting.uiview.pages.Search;

import core.base_ui.BaseWebUIMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchMap extends BaseWebUIMap {
    @FindBy (name = "search")
    private WebElement ClickSearchBar;
    @FindBy (xpath = "//button[@class='filters-icon']")
    private WebElement ClickFilterButton;
    @FindBy (css = "//span[@aria-label='close']//*[name()='svg']")
    private WebElement ClickCrossButtonFilter;
    @FindBy (xpath="//span[normalize-space()='Show']")
    private WebElement ClickShowButtonFilter;
    @FindBy (name = "minPrice")
    private WebElement EnterMinPriceBox;
    @FindBy (name = "maxPrice")
    private WebElement EnterMaxPriceBox;
    @FindBy (xpath = "//div[@class='ant-modal-body']//div[2]//button[4]")
    private WebElement Click3NumberOfRooms;
    @FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Any'])[2]/following::span[2]")
    private WebElement Click2NumberOfBathrooms;//input[@value='A']
    @FindBy (xpath = "//input[@value='A']")
    private WebElement SelectEPCLabelA;
    @FindBy (name = "minSize")
    private WebElement EnterMinLivingArea;
    @FindBy (name = "maxSize")
    private WebElement EnterMaxLivingArea;
    @FindBy (xpath = "//div[7]//div[2]//div[1]//input[1]")
    private WebElement EnterMinPlotArea;
    @FindBy (xpath = "//div[7]//div[2]//div[2]//input[1]")
    private WebElement EnterMaxPlotArea;
    @FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Property Condition'])[1]/following::span[1]")
    private WebElement ClickPropertyCondition;
    public WebElement getClickSearchBar(){
        return ClickSearchBar;
    }
    public WebElement getClickFilterButton(){
        return ClickFilterButton;
    }
    public WebElement getClickCrossButtonFilter(){
        return ClickCrossButtonFilter;
    }
    public WebElement getClickShowButtonFilter(){
        return ClickShowButtonFilter;
    }
    public WebElement getClickMinPriceBox(){
        return EnterMinPriceBox;
    }
    public WebElement getClickMaxPriceBox(){
        return EnterMaxPriceBox;
    }
    public WebElement getClickPropertyCondition(){
        return ClickPropertyCondition;
    }
    public WebElement getClick3NumberOfRooms(){return Click3NumberOfRooms;}
    public WebElement getClick2NumberOfBathrooms(){return Click2NumberOfBathrooms;}
    public WebElement getSelectEPCLabelA(){return SelectEPCLabelA;}
    public WebElement getEnterMinLivingAreaBox(){
        return EnterMinLivingArea;
    }
    public WebElement getEnterMaxLivingArea(){
        return EnterMaxLivingArea;
    }
    public WebElement getEnterMinPlotArea(){
        return EnterMinPlotArea;
    }
    public WebElement getEnterMaxPriceBox(){
        return EnterMaxPlotArea;
    }
}
