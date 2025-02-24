package testcases;

import baseclass.BaseClass;
import org.testng.annotations.Test;
import pages.SliderDemoPage;

public class SliderTest extends BaseClass {
    SliderDemoPage sliderDemoPage;

    @Test
    public void sliderValidation(){
        NavigateUrl();
        sliderDemoPage=new SliderDemoPage(driver);
        sliderDemoPage.validateSlider();
    }
}
