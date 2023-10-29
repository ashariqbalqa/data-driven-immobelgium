package belgiumimmo_webuitesting.keywords;

import core.base_action.Action;
import belgiumimmo_webuitesting.uiview.pages.SavedSearches.SavedSearchesPage;

public class SavedSearchesActions extends Action {
    public SavedSearchesActions(Action action) {
        super(action);
    }

    public void VerifyPageTitle()
    {
        SavedSearchesPage ss = new SavedSearchesPage(getWebAction());


    }

}
