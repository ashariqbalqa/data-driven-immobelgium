package belgiumimmo_webuitesting.uiview.pages.SavedSearches;

import core.base_action.WebAction;
import core.base_ui.BaseWebUI;

public class SavedSearchesPage extends BaseWebUI<SavedSearchesMap> {
    public SavedSearchesPage(WebAction action) {super(new SavedSearchesMap(),action);
    }
    public SavedSearchesPage navigate (String url){
        webAction.getToUrl("Https://staging.belgiumimmo.be/en/saved-searches", true);
        return this;
    }
    public SavedSearchesPage VerifyPageTitle()
    {
        return this;
    }
    public SavedSearchesPage EditButton()
    {
        return this;
    }
    public SavedSearchesPage CrossButtonFunctionality()
    {
        return this;
    }
    public SavedSearchesPage UpdateSavedSearchName()
    {
        return this;
    }
    public SavedSearchesPage UpdateSubscriptionToDaily()
    {
        return this;
    }
    public SavedSearchesPage DisableSubscriptionButton()
    {
        return this;
    }
    public SavedSearchesPage ClickCancelButton()
    {
        return this;
    }
    public SavedSearchesPage ClickDeleteButton()
    {
        return this;
    }

}
