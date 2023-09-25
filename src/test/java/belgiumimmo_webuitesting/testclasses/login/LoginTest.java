package belgiumimmo_webuitesting.testclasses.login;

import belgiumimmo_webuitesting.testclasses.BelgiumImmoDemoBaseTest;
import org.testng.annotations.DataProvider;

public class LoginTest extends BelgiumImmoDemoBaseTest {
    @DataProvider
    @Override
    protected Object[] testDataSet() {
        return fetchDataToDataSet("functional/login/LoginTest.json");
    }
}
