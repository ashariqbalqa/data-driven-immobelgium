package belgiumimmo_webuitesting.uiview.pages.AgencyDahsboard;

import core.base_action.WebAction;
import core.base_ui.BaseWebUI;

import static org.testng.Assert.assertEquals;

public class AgnecyDashboardAppointmentsPage extends BaseWebUI<AgnecyDashboardAppointmentsMap> {
    public AgnecyDashboardAppointmentsPage(WebAction action) {
        super(new AgnecyDashboardAppointmentsMap(), action);
    }
    public AgnecyDashboardAppointmentsPage navigate(String url) {
        webAction.getToUrl("Https://staging.belgiumimmo.be/en/agency/login", true);
        return this;
    }
    public AgnecyDashboardAppointmentsPage  AgencyVerifyAppointmentsTitle(String agencyuser, String password) {
        String ExpectedTitle = "Appointments";
        String ActualTitle;

        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.type(Map().getTxtUser(), agencyuser,"User Name");
        webAction.type(Map().getTxtPassword(), password, "Password");
        webAction.click(Map().getBtnLogIn(), "Login");
        ActualTitle= webAction.getText(Map().getAppointmentsDate());
        System.out.println("Actual Title:"+ ActualTitle);
        assertEquals(ActualTitle, ExpectedTitle);
        return this;
    }

    public AgnecyDashboardAppointmentsPage  AgencyVerifyAppointmentsDate(String agencyuser, String password) {
        String ExpectedDate = "Date";
        String ActualDate;

        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.type(Map().getTxtUser(), agencyuser,"User Name");
        webAction.type(Map().getTxtPassword(), password, "Password");
        webAction.click(Map().getBtnLogIn(), "Login");
        ActualDate= webAction.getText(Map().getAppointmentsDate());
        System.out.println("Actual Date:"+ ActualDate);
        assertEquals(ActualDate, ExpectedDate);
        return this;
    }
    public AgnecyDashboardAppointmentsPage  AgencyVerifyAppointmentsEmail(String agencyuser, String password) {
        String ExpectedEmail = "Email";
        String ActualEmail;

        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.type(Map().getTxtUser(), agencyuser,"User Name");
        webAction.type(Map().getTxtPassword(), password, "Password");
        webAction.click(Map().getBtnLogIn(), "Login");
        ActualEmail= webAction.getText(Map().getAppointmentsDate());
        System.out.println("Actual Email:"+ ActualEmail);
        assertEquals(ActualEmail, ExpectedEmail);
        return this;
    }

    public AgnecyDashboardAppointmentsPage  AgencyVerifyAppointmentsName(String agencyuser, String password) {
        String ExpectedName = "Name";
        String ActualName;

        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.type(Map().getTxtUser(), agencyuser,"User Name");
        webAction.type(Map().getTxtPassword(), password, "Password");
        webAction.click(Map().getBtnLogIn(), "Login");
        ActualName= webAction.getText(Map().getAppointmentsDate());
        System.out.println("Actual Name:"+ ActualName);
        assertEquals(ActualName, ExpectedName);
        return this;
    }
    public AgnecyDashboardAppointmentsPage  AgencyVerifyAppointmentsPhone(String agencyuser, String password) {
        String ExpectedPhone = "Phone";
        String ActualPhone;

        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.type(Map().getTxtUser(), agencyuser,"User Name");
        webAction.type(Map().getTxtPassword(), password, "Password");
        webAction.click(Map().getBtnLogIn(), "Login");
        ActualPhone= webAction.getText(Map().getAppointmentsDate());
        System.out.println("Actual Phone:"+ ActualPhone);
        assertEquals(ActualPhone, ExpectedPhone);
        return this;
    }
    public AgnecyDashboardAppointmentsPage  AgencyVerifyAppointmentsStatus(String agencyuser, String password) {
        String ExpectedStatus = "Status";
        String ActualStatus;

        webAction.click(Map().getBtnLogIn(),"Signin");
        webAction.type(Map().getTxtUser(), agencyuser,"User Name");
        webAction.type(Map().getTxtPassword(), password, "Password");
        webAction.click(Map().getBtnLogIn(), "Login");
        ActualStatus= webAction.getText(Map().getAppointmentsDate());
        System.out.println("Actual Status:"+ ActualStatus);
        assertEquals(ActualStatus, ExpectedStatus);
        return this;
    }

}
