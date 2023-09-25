package belgiumimmo_webuitesting.uiview.pages.AgencyDahsboard;

import core.base_ui.BaseWebUIMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgnecyDashboardAppointmentsMap extends BaseWebUIMap {
    @FindBy(className = "sign-in-btn")
    private WebElement btnSignin;
    @FindBy(id = "login.email")
    private WebElement txtUser;

    @FindBy(id = "login.password")
    private WebElement txtPassword;
    @FindBy(className = "//div[@class='title']")
    private WebElement AppointmentsTitle;
    @FindBy(className = "//span[normalize-space()='Name']")
    private WebElement AppointmentsName;
    @FindBy(className = "//span[normalize-space()='Status']")
    private WebElement AppointmentsStatus;
    @FindBy(className = "//th[normalize-space()='Phone']")
    private WebElement AppointmentsPhone;
    @FindBy(className = "//th[normalize-space()='Email']")
    private WebElement AppointmentsEmail;
    @FindBy(className = "//span[normalize-space()='Date']")
    private WebElement AppointmentsDate;


    public WebElement getBtnLogIn()
    {
        return btnSignin;
    }
    public WebElement getTxtUser()
    {
        return txtUser;
    }
    public WebElement getTxtPassword()
    {
        return txtPassword;
    }
    public WebElement getAppointmentsTitle()
    {
        return AppointmentsTitle;
    }
    public WebElement getAppointmentsName()
    {
        return AppointmentsName;
    }
    public WebElement getAppointmentsStatus()
    {
        return AppointmentsStatus;
    }
    public WebElement getAppointmentsPhone()
    {
        return AppointmentsPhone;
    }
    public WebElement getAppointmentsEmail()
    {
        return AppointmentsEmail;
    }
    public WebElement getAppointmentsDate()
    {
        return AppointmentsDate;
    }

}
