package belgiumimmo_webuitesting.keywords;

import core.base_action.Action;
import belgiumimmo_webuitesting.uiview.pages.login.LoginPage;
//import belgiumimmo_webuitesting.uiview.pages.main.inventory.InventoryPage;

public class LoginAction extends Action {
    public LoginAction(Action action){
        super(action);
    }

    public void login(String user, String password) throws InterruptedException {
        LoginPage lg = new LoginPage(getWebAction());
        lg.navigate("https://staging.belgiumimmo.be/en")
                .login(user, password);
    }
        public void GmailLoginPage(String gmail, String password){
            LoginPage gl = new LoginPage(getWebAction());
            gl.navigate("https://staging.belgiumimmo.be/en")
                    .GmailLoginPage(gmail, password);



        //else {
       //     getSoftAssert().assertEquals(lg.Map().getDivLoginError().getText(),errorMessage,"Ensure the error login show message [" + errorMessage + "]");
        //}
    }
    public void FacebookLoginPage(String facebookuser, String password) {
        LoginPage fbl = new LoginPage(getWebAction());
        fbl.navigate("https://staging.belgiumimmo.be/en")
                .FacebookLoginPage(facebookuser, password);
    }

}
