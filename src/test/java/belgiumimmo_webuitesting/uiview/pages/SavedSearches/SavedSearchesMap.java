package belgiumimmo_webuitesting.uiview.pages.SavedSearches;

import core.base_ui.BaseWebUIMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedSearchesMap extends BaseWebUIMap {
    @FindBy (className = "title header-title")
    private WebElement SavedSearchesTitle;
    @FindBy(xpath = "//div[@class='Dashboard__container dashboard-container pl-4 pr-4 pr-lg-0 py-4 py-lg-0']//div[2]//div[3]//div[1]//button[1]//span[2]")
    private WebElement EditButton;
    @FindBy(className = "title-modal mt-3")
    private WebElement EditButtonPopUpTitle;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
    private WebElement ClickEditSavedSearchCloseButton;
    @FindBy(xpath="//input[@type='text']")
    private WebElement UpdateSavedSearchName;
    @FindBy(xpath = "//div[3]/div/div/label/span")
    private WebElement SubscriptionDaily;
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Daily'])[1]/following::div[2]")
    private WebElement SubscriptionInstant;
    @FindBy(xpath = "xpath=//div[3]/div/div/label/span")
    private WebElement SubscriptionOff;
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[4]/following::button[1]")
    private WebElement ClickCancelButton;
    @FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Instant'])[1]/following::span[1]")
    private WebElement ClickDeleteButton;

    public WebElement getSavedSearchesTitle(){
        return SavedSearchesTitle;
    }
    public WebElement getEditButton(){
        return EditButton;
    }
    public WebElement getEditButtonPopUpTitle(){
        return EditButtonPopUpTitle;
    }
    public WebElement getClickEditSavedSearchCloseButton(){
        return  ClickEditSavedSearchCloseButton;
    }
    public WebElement getUpdateSavedSearchName(){
        return UpdateSavedSearchName;
    }
    public WebElement getSubscriptionDaily(){
        return SubscriptionDaily;
    }
    public WebElement getSubscriptionInstant(){
        return SubscriptionInstant;
    }
    public WebElement getSubscriptionOff(){
        return SubscriptionOff;
    }
    public WebElement getClickCancelButton(){
        return ClickCancelButton;
    }
    public WebElement getClickDeleteButton(){
        return ClickDeleteButton;
    }

}
