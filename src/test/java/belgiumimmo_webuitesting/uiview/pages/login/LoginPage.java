package belgiumimmo_webuitesting.uiview.pages.login;

import core.base_action.WebAction;
import core.base_ui.BaseWebUI;


public class LoginPage extends BaseWebUI<LoginPageMap> {
    public LoginPage(WebAction action) {
        super(new LoginPageMap(), action);
    }

    public LoginPage navigate(String url) {
        webAction.getToUrl(url, true);
        return this;
    }
    //public belgiumimmo_webuitesting.uiview.pages.login.LoginPage signin() {
   //     webAction.type(Map().getBtnSignIn(),"Signin");
    //    return this;
    //}
    public LoginPage login(String user, String password) throws InterruptedException {
        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.type(Map().getTxtUser(), user,"User Name");
        webAction.type(Map().getTxtPassword(), password, "Password");
        webAction.click(Map().getBtnLogIn(), "Login");
        Thread.sleep(5000);

        return this;
    }
    /*public void verifyTitle(){
        WebDriver driver= new ChromeDriver();
        String sellerleadstable;
        sellerleadstable=driver.getTitle();
        Assert.assertTrue(sellerleadstable.contains("Seller Leads"));
    }*/
    public LoginPage GmailLoginPage (String gmail, String password){
        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.click(Map().getBtnGoogleLogin(),"GoogleLoginIn");
        webAction.type(Map().getBtnGoogleEmailLogin(),gmail, "GoogleEmailLoginIn");
        webAction.click(Map().getBtnGoogleEmailLoginNext(),"GoogleEmailLoginInNextButton");
        webAction.type(Map().getBtnGooglePasswordEnter(),password,"GooglePassword");
        webAction.click(Map().getBtnGooglePasswordButton(),"GoogleClickNext");

        return this;

    }
    public LoginPage FacebookLoginPage (String facebookuser, String password){
        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.click(Map().getBtnFacebookLoginButton(),"FacebookLoginIn");
        webAction.type(Map().getBtnFacebookEnterEmail(),facebookuser, "FacebookEmailLoginIn");
        webAction.type(Map().getBtnFacebookEnterPassword(),password,"FacebookPassword");
        webAction.click(Map().getBtnFacebookButtonClick(),"GoogleClickNext");

        return this;

    }
}
