package belgiumimmo_webuitesting.uiview.pages.SavedProperties;

import core.base_action.WebAction;
import core.base_ui.BaseWebUI;

import static org.testng.Assert.assertEquals;

public class SavedPropertiesPage extends BaseWebUI<SavedPropertiesMap> {
    public SavedPropertiesPage(WebAction action) {super(new SavedPropertiesMap(),action);
    }
    public SavedPropertiesPage navigate (String url){
        webAction.getToUrl("Https://staging.belgiumimmo.be/en/saved-searches", true);
        return this;
    }
    public SavedPropertiesPage VerifyPageTitle()
    {
        String ExpectedTitle= "Saved properties";
        String ActualTitle;

        ActualTitle= webAction.getText(Map().getSavedPropertiesTitle());
        System.out.println("Actual Title:"+ ActualTitle);
        assertEquals(ActualTitle, ExpectedTitle);

        return this;
    }
    public SavedPropertiesPage ClickShowingAllDropDown()
    {


        webAction.click(Map().getClickShowingAllDropDown(), "ClickDropDownButton");

        return this;
    }


}
