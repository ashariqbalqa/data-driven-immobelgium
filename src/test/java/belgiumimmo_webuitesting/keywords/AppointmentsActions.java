package belgiumimmo_webuitesting.keywords;

import belgiumimmo_webuitesting.uiview.pages.AgencyDahsboard.AgnecyDashboardAppointmentsPage;
import belgiumimmo_webuitesting.uiview.pages.login.LoginPage;
import core.base_action.Action;

public class AppointmentsActions extends Action {
    public AppointmentsActions(Action action){
        super(action);
    }

    public void AgencyVerifyAppointmentsTitle(String agencyuser, String password) {
        AgnecyDashboardAppointmentsPage adv = new AgnecyDashboardAppointmentsPage(getWebAction());
        adv.navigate("https://staging.belgiumimmo.be/en")
                .AgencyVerifyAppointmentsTitle(agencyuser, password);
    }
    public void AgencyVerifyAppointmentsDate(String agencyuser, String password)
    {
        AgnecyDashboardAppointmentsPage adv = new AgnecyDashboardAppointmentsPage(getWebAction());
        adv.navigate("https://staging.belgiumimmo.be/en")
                .AgencyVerifyAppointmentsDate(agencyuser, password);
    }
    public void AgencyVerifyAppointmentsEmail(String agencyuser, String password)
    {
        AgnecyDashboardAppointmentsPage adv = new AgnecyDashboardAppointmentsPage(getWebAction());
        adv.navigate("https://staging.belgiumimmo.be/en")
                .AgencyVerifyAppointmentsEmail(agencyuser, password);
    }
    public void AgencyVerifyAppointmentsName(String agencyuser, String password)
    {
        AgnecyDashboardAppointmentsPage adv = new AgnecyDashboardAppointmentsPage(getWebAction());
        adv.navigate("https://staging.belgiumimmo.be/en")
                .AgencyVerifyAppointmentsName(agencyuser, password);
    }
    public void AgencyVerifyAppointmentsPhone(String agencyuser, String password)
    {
        AgnecyDashboardAppointmentsPage adv = new AgnecyDashboardAppointmentsPage(getWebAction());
        adv.navigate("https://staging.belgiumimmo.be/en")
                .AgencyVerifyAppointmentsPhone(agencyuser, password);
    }
    public void AgencyVerifyAppointmentsStatus(String agencyuser, String password)
    {
        AgnecyDashboardAppointmentsPage adv = new AgnecyDashboardAppointmentsPage(getWebAction());
        adv.navigate("https://staging.belgiumimmo.be/en")
                .AgencyVerifyAppointmentsStatus(agencyuser, password);
    }

}
