package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Created by Karthik on 31/01/2019.
 */

public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {

        // scenario.getName()
       // scenarioDef = base.features.createNode("Name");

        System.out.println("Opening the browser : Firefox");

        System.setProperty("webdriver.firefox.marionette", "/Applications/Firefox.app/Contents/MacOS/firefox");
        base.Driver = new FirefoxDriver();


        //Chrome driver
        // System.setProperty("webdriver.chrome.driver", "C:\Libs\chromedriver");
        // base.Driver = new ChromeDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        //if (scenario.isFailed()) {
            //Take screenshot logic goes here
           // System.out.println(scenario.getName());
       // }
        System.out.println("Closing the browser : MOCK");
    }

}
