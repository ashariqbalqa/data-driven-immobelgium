package belgiumimmo_webuitesting.uiview.pages.Search;

import belgiumimmo_webuitesting.uiview.pages.SavedSearches.SavedSearchesPage;
import core.base_action.WebAction;
import core.base_ui.BaseWebUI;
import core.base_ui.BaseWebUIMap;

public class SearchPage extends BaseWebUI<SearchMap> {
    public SearchPage (WebAction action) {super(new SearchMap(),action);}
    public SearchPage navigate (String url){
        webAction.getToUrl("Https://staging.belgiumimmo.be/en/search", true);
        return this;
    }
    public SearchPage SearchBarTest(){
        webAction.type(Map().getClickSearchBar(), "IMMO NOBELS","SearchBar");

        return this;
    }
    public SearchPage ClickFiltersButtonAndCloseButton(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getClickCrossButtonFilter(), "Cross Button Filter");

        return this;
    }
    public SearchPage ClickFiltersButtonAndShowButton(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getClickShowButtonFilter(), "Show Button Filter");

        return this;
    }
    public SearchPage EnterValuesInMinMaxBox(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.type(Map().getClickMinPriceBox(), "Min Button Box","MinButton");
        webAction.type(Map().getClickMaxPriceBox(), "Max Button Box","MaxButton");

        return this;
    }
    public SearchPage ClickNumberOfRoomsThree(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getClick3NumberOfRooms(), "Select Number Of Rooms Three");

        return this;
    }
    public SearchPage ClickNumberOfBathrooms2(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getClick2NumberOfBathrooms(), "Select Number Of Bathrooms Two");

        return this;
    }
    public SearchPage SelectEPCLabelA(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectEPCLabelA(), "Select EPC Lable A");

        return this;
    }
    public SearchPage EnterValuesInLivingAreaMinMaxBox(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.type(Map().getEnterMinLivingAreaBox(), "Min Living Area Box","MinButton");
        webAction.type(Map().getEnterMaxLivingArea(), "Max Living Area Box","MaxButton");

        return this;
    }
    public SearchPage EnterValuesInPlotAreaMinMaxBox(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.type(Map().getEnterMinPlotArea(), "Min Plot Area Box","MinButton");
        webAction.type(Map().getEnterMaxPriceBox(), "Max Plot Area Box","MaxButton");

        return this;
    }
    public SearchPage ClickPropertyCondition(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getClickPropertyCondition(), "Select Property Condition");

        return this;
    }
}

