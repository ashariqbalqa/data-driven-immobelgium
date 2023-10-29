package belgiumimmo_webuitesting.uiview.pages.SavedSearches;

import core.base_ui.BaseWebUIMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedSearchesMap extends BaseWebUIMap {
    @FindBy (className = "title header-title")
    private WebElement savedSearchesTitle;
    @FindBy(xpath = "//div[@class='Dashboard__container dashboard-container pl-4 pr-4 pr-lg-0 py-4 py-lg-0']//div[2]//div[3]//div[1]//button[1]//span[2]")
    private WebElement editButton;
    @FindBy(className = "title-modal mt-3")
    private WebElement editButtonPopUpTitle;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
    private WebElement clickEditSavedSearchCloseButton;
    @FindBy(xpath="//input[@type='text']")
    private WebElement updateSavedSearchName;
    @FindBy(xpath = "//div[3]/div/div/label/span")
    private WebElement subscriptionDaily;
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Daily'])[1]/following::div[2]")
    private WebElement subscriptionInstant;
    @FindBy(xpath = "xpath=//div[3]/div/div/label/span")
    private WebElement subscriptionOff;
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[4]/following::button[1]")
    private WebElement clickCancelButton;
    @FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Instant'])[1]/following::span[1]")
    private WebElement clickDeleteButton;
}
