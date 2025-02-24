package baseclass;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class BaseClass {

    public RemoteWebDriver driver=null;
    public String username="balachandar_r";
    final String accesKey="kEr1tBR1PkQo9pg91mMP7RoiCqCoUYcwEh5R4XzfZIMPsdBomk";
    public String hub = "@hub.lambdatest.com/wd/hub";
    DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

    @Parameters(value = {"Browser","Version","Platform"})
    @BeforeMethod
    public  void setup(String browserName,String browserVersion,String platform) throws MalformedURLException {
        desiredCapabilities.setCapability("browserName",browserName);
        desiredCapabilities.setCapability("version",browserVersion);
        desiredCapabilities.setCapability("platform",platform);
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", username);
        ltOptions.put("accesKey", accesKey);
        ltOptions.put("visual", true);
        ltOptions.put("video", true);
        ltOptions.put("network", true);
        ltOptions.put("build", "Selenium 101 Assignment_Lambda");
        ltOptions.put("project", "Selenium 101 Assignment_Lambda");
        ltOptions.put("name", "Selenium 101 Assignment_Lambda");
        ltOptions.put("console",true);
        ltOptions.put("selenium_version", "4.0.0");
        ltOptions.put("plugin", "java-testNG");
        desiredCapabilities.setCapability("LT:Options", ltOptions);
        try{
            driver = new RemoteWebDriver(new URL("http://" + username + ":" + accesKey + hub),desiredCapabilities);
        }catch (MalformedURLException exception){
            exception.printStackTrace();
        }

    }

    @AfterMethod
    public void tearDown(){
    driver.quit();

    }

    public void NavigateUrl(){
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
    }
}
