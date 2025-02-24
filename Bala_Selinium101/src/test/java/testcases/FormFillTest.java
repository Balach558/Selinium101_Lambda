package testcases;

import baseclass.BaseClass;
import org.testng.annotations.Test;
import pages.FormFillDemoPage;

public class FormFillTest extends BaseClass {
    FormFillDemoPage formFillDemoPage;


    @Test
    public void formFillvalidation() throws InterruptedException {
        formFillDemoPage=new FormFillDemoPage(driver);
        NavigateUrl();
        formFillDemoPage.formFillValidation();
    }
}
