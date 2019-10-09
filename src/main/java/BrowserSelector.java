import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserSelector extends Utils {
    LoadProps loadProps= new LoadProps();
    public void setUpBrowser(){
        String browser= loadProps.getProperty("browser");
        if(browser.equalsIgnoreCase("firefox")){
          System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
          driver= new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDrivers\\IEDriverServer.exe");
            InternetExplorerOptions internetExplorerOptions=new InternetExplorerOptions();
            internetExplorerOptions.setCapability(InternetExplorerDriver.IE_SWITCHES,"-private");
            internetExplorerOptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
            driver= new InternetExplorerDriver();

        }
        else{
            System.out.println("Browser name entered is either wrong or empty:"+ browser);
        }

    }
}
