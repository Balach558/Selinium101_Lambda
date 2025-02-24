package testcases;

import baseclass.BaseClass;
import org.testng.annotations.Test;
import pages.SimpleFormDemoPage;

public class SimpleFormTest extends BaseClass {
    SimpleFormDemoPage simpleFormDemoPage;

    @Test
    public void simpleFormValidation(){
        simpleFormDemoPage=new SimpleFormDemoPage(driver);
        NavigateUrl();
        simpleFormDemoPage.validateSimpleForm();
    }
}
