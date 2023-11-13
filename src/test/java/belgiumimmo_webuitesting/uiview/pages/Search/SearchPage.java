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
    public SearchPage SearchBar(){
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
    public SearchPage EnterMinAndMaxPriceForSale(){
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
    public SearchPage EnterValuesInLivingAreaMinMax(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.type(Map().getEnterMinLivingAreaBox(), "Min Living Area Box","MinButton");
        webAction.type(Map().getEnterMaxLivingArea(), "Max Living Area Box","MaxButton");

        return this;
    }
    public SearchPage EnterValuesInPlotAreaMinMax(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.type(Map().getEnterMinPlotArea(), "Min Plot Area Box","MinButton");
        webAction.type(Map().getEnterMaxPriceBox(), "Max Plot Area Box","MaxButton");

        return this;
    }
    public SearchPage SelectPropertyConditionSale(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getClickPropertyCondition(), "Select Property Condition");

        return this;
    }
    public SearchPage EnterValuesInConstructionYearStartEnd(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.type(Map().getEnterConstructionYearStart(), "Min Construction Year","MinButtonConstructionYear");
        webAction.type(Map().getEnterConstructionYearEnd(), "Max Construction Year","MaxButtonConstructionYear");

        return this;
    }
    public SearchPage SelectPropertyStatusIsImmediatelyAvailable(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getClickImmediatelyAvailable(), "Immediately Available");

        return this;
    }
    public SearchPage ClickRentEnterMaxMinPrice(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.type(Map().getClickMinPriceBox(), "Min Button Box","MinButton");
        webAction.type(Map().getClickMaxPriceBox(), "Max Button Box","MaxButton");

        return this;
    }
    public SearchPage ClickRentSelectNumberOfRooms(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.click(Map().getClick3NumberOfRooms(), "Select Number Of Rooms Three");

        return this;
    }
    public SearchPage ClickRentSelectNumberOfBathrooms(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.click(Map().getClick2NumberOfBathrooms(), "Select Number Of Bathrooms Two");

        return this;
    }
    public SearchPage ClickRentSelectEPCLabel(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.click(Map().getSelectEPCLabelA(), "Select EPC Label");

        return this;
    }
    public SearchPage ClickRentSelectMinMaxLivingArea(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.type(Map().getEnterMinLivingAreaBox(), "Min Living Area Box","MinButton");
        webAction.type(Map().getEnterMaxLivingArea(), "Max Living Area Box","MaxButton");

        return this;
    }
    public SearchPage ClickRentSelectPlotSize(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.type(Map().getEnterMinPlotArea(), "Min Plot Area Box","MinButton");
        webAction.type(Map().getEnterMaxPriceBox(), "Max Plot Area Box","MaxButton");

        return this;
    }
    public SearchPage ClickRentSelectPropertyCondition(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.click(Map().getSelectPropertyConditionToRestore(), "Select Property Condition To Restore");

        return this;
    }
    public SearchPage ClickRentEnterConstructionYear(){
        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.type(Map().getEnterConstructionYearStart(), "Min Construction Year","MinButtonConstructionYear");
        webAction.type(Map().getEnterConstructionYearEnd(), "Max Construction Year","MaxButtonConstructionYear");

        return this;
    }
    public SearchPage SelectPropertyStatusIsImmediatelyAvailableRent(){

        webAction.click(Map().getClickFilterButton(),"Filters Button");
        webAction.click(Map().getSelectForRent(), "Select For Rent");
        webAction.click(Map().getClickImmediatelyAvailable(), "Immediately Available");
        return this;
    }
    public SearchPage SelectPropertyTypeHouse(){

        webAction.click(Map().getClickFilterButton(),"Filters Button");

        webAction.click(Map().getSelectPropertyTypeHouse(),"Select Property Type House");
        return this;
    }
    public SearchPage SelectPropertySubTypeBunglow(){

        webAction.click(Map().getClickFilterButton(),"Filters Button");

        webAction.click(Map().getSelectPropertyTypeHouse(),"Select Property Type House");
        webAction.click(Map().getSelectPropertySubTypeBungalow(),"Select Property Sub-Type Bungalow");
        return this;
    }
    public SearchPage SelectPropertySubTypeChalet(){

        webAction.click(Map().getClickFilterButton(),"Filters Button");

        webAction.click(Map().getSelectPropertyTypeHouse(),"Select Property Type House");
        webAction.click(Map().getSelectPropertySubTypeChalet(),"Select Property Sub-Type Chalet");
        return this;
    }
    public SearchPage SelectPropertySubTypeCastle(){

        webAction.click(Map().getClickFilterButton(),"Filters Button");

        webAction.click(Map().getSelectPropertyTypeHouse(),"Select Property Type House");
        webAction.click(Map().getSelectPropertySubTypeCastle(),"Select Property Sub-Type Castle");
        return this;
    }
}

