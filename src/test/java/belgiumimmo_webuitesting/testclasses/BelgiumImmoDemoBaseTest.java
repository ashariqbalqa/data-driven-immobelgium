package belgiumimmo_webuitesting.testclasses;

import core.base_action.RestAction;
import core.base_action.WebAction;
import core.test_execution.BaseTest;
import org.kohsuke.rngom.parse.host.Base;

public abstract class BelgiumImmoDemoBaseTest extends BaseTest {
    public BelgiumImmoDemoBaseTest(){
        actions.setWebAction(new WebAction());
        actions.setRestAction(new RestAction());

        setUserKeywordPackage("belgiumimmo_webuitesting.keywords");
        actions.getWebAction().setAttributeAsElementName("id","class");
        testDataManager.setTestDataPath("src/test/java/belgiumimmo_webuitesting/suites/");

        testVars.getConfigVars().put("loginPageURL","https://staging.belgiumimmo.be/en");
    }

}
