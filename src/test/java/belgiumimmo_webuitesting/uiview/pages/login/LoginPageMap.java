package belgiumimmo_webuitesting.uiview.pages.login;

import core.base_ui.BaseWebUIMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageMap extends BaseWebUIMap {
    @FindBy(className = "sign-in-btn")
    private WebElement btnSignin;
    @FindBy(id = "login.email")
    private WebElement txtUser;

    @FindBy(id = "login.password")
    private WebElement txtPassword;

    @FindBy(xpath = "//span[normalize-space()='Log in with Google']")
    private WebElement btnLogIn;

    @FindBy(xpath = "//span[normalize-space()='Log in with Google']")
    private WebElement btnGoogleLogin;

    @FindBy(xpath = "//input[@id='identifierId']")
    private WebElement signinGoogleEmail;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    private WebElement signinGoogleNextButton;

    @FindBy(name = "Passwd")
    private WebElement signinGooglePassword;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    private WebElement signinGoogleNextButtonFinal;

    @FindBy(xpath = "//span[normalize-space()='Log in with Facebook']")
    private WebElement signinWithFacebook;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement signinFacebookEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement signinFacebookPassword;

    @FindBy(xpath = "//button[@id='loginbutton']")
    private WebElement clickFacebookLoginButton;

    @FindBy(css = "h3[data-test='error']")
    private WebElement divLoginError;

    public WebElement getTxtUser()
    {
        return txtUser;
    }

    public WebElement getTxtPassword()
    {
        return txtPassword;
    }

    public WebElement getBtnLogIn()
    {
        return btnSignin;
    }
    public WebElement getBtnGoogleLogin()
    {
        return btnGoogleLogin;
    }

    public WebElement getBtnGoogleEmailLogin()
    {
        return signinGoogleEmail;
    }

    public WebElement getBtnGoogleEmailLoginNext()
    {
        return signinGoogleNextButton;
    }
    public WebElement getBtnGooglePasswordEnter()
    {
        return signinGooglePassword;
    }
    public WebElement getBtnGooglePasswordButton()
    {
        return signinGoogleNextButtonFinal;
    }

    public WebElement getBtnFacebookLoginButton()
    {
        return signinWithFacebook;
    }
    public WebElement getBtnFacebookEnterEmail()
    {
        return signinFacebookEmail;
    }
    public WebElement getBtnFacebookEnterPassword()
    {
        return signinFacebookPassword;
    }
    public WebElement getBtnFacebookButtonClick()
    {
        return clickFacebookLoginButton;
    }
    public WebElement getDivLoginError() {
        return divLoginError;
    }
}
