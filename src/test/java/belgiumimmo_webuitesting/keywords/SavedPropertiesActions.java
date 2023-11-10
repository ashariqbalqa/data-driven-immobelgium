package belgiumimmo_webuitesting.keywords;

import belgiumimmo_webuitesting.uiview.pages.SavedProperties.SavedPropertiesPage;
import core.base_action.Action;

public class SavedPropertiesActions extends Action {
    public SavedPropertiesActions (Action action) {
        super(action);
    }

    public void VerifyPageTitle()
    {
        SavedPropertiesPage sp = new SavedPropertiesPage(getWebAction());


    }
}
