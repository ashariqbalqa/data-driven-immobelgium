package belgiumimmo_webuitesting.uiview.pages.SavedSearches;

import core.base_action.WebAction;
import core.base_ui.BaseWebUI;

import static org.testng.Assert.assertEquals;

public class SavedSearchesPage extends BaseWebUI<SavedSearchesMap> {
    public SavedSearchesPage(WebAction action) {super(new SavedSearchesMap(),action);
    }
    public SavedSearchesPage navigate (String url){
        webAction.getToUrl("Https://staging.belgiumimmo.be/en/saved-searches", true);
        return this;
    }
    public SavedSearchesPage VerifyPageTitle()
    {
        String ExpectedTitle= "Saved Searches";
        String ActualTitle;

        ActualTitle= webAction.getText(Map().getSavedSearchesTitle());
        System.out.println("Actual Title:"+ ActualTitle);
        assertEquals(ActualTitle, ExpectedTitle);

        return this;
    }
    public SavedSearchesPage EditButton()
    {
        String ExpectedTitle= "Edit Saved Search";
        String ActualTitle;

        webAction.click(Map().getEditButton(), "EditButton");
        ActualTitle= webAction.getText(Map().getEditButtonPopUpTitle());
        System.out.println("Actual Email:"+ ActualTitle);
        assertEquals(ActualTitle, ExpectedTitle);
        return this;
    }
    public SavedSearchesPage CrossButtonFunctionality()
    {
        String ExpectedTitle= "Saved Searches";
        String ActualTitle;

        webAction.click(Map().getClickEditSavedSearchCloseButton(), "EditPop-upCrossButton");
        ActualTitle= webAction.getText(Map().getSavedSearchesTitle());
        System.out.println("Actual Email:"+ ActualTitle);
        assertEquals(ActualTitle, ExpectedTitle);
        return this;
    }
    public SavedSearchesPage UpdateSavedSearchName(String savedsearchname)
    {
        webAction.click(Map().getEditButton(), "EditButton");
        webAction.type(Map().getUpdateSavedSearchName(), savedsearchname, "SavedSearchName");
        return this;
    }
    public SavedSearchesPage UpdateSubscriptionToDaily()
    {
        webAction.click(Map().getEditButton(), "EditButton");
        webAction.scrollIntoView(Map().getSubscriptionDaily());

        return this;
    }
    public SavedSearchesPage DisableSubscriptionButton()
    {
        webAction.click(Map().getEditButton(), "EditButton");
        webAction.click(Map().getSubscriptionOff(), "Subscriptionoff");

        return this;
    }
    public SavedSearchesPage ClickCancelButton()
    {
        webAction.click(Map().getEditButton(), "EditButton");
        webAction.click(Map().getClickCancelButton(), "ClickCancelButton");

        return this;
    }
    public SavedSearchesPage ClickDeleteButton()
    {
        webAction.click(Map().getEditButton(), "EditButton");
        webAction.click(Map().getClickDeleteButton(), "ClickDeleteButton");
        return this;
    }

}
