package belgiumimmo_webuitesting.testclasses.AgencyDashboardAppointments;

import org.testng.annotations.DataProvider;
import belgiumimmo_webuitesting.testclasses.BelgiumImmoDemoBaseTest;

public class AgencyDashboardAppointmentsTest extends BelgiumImmoDemoBaseTest {
    @DataProvider
    @Override
    protected Object[] testDataSet() {
        return fetchDataToDataSet("functional/AgencyAppointments/AgencyDashboardAppointmentsTest.json");
    }

}
