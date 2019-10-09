import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProps props = new LoadProps();
    @BeforeMethod
    public void setupBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get(props.getProperty("url"));
    }

    @AfterMethod
    public void teardown(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            takeScreenshot(result.getName());
        }
        //to close the browser
        quiteDriver();
    }

}
