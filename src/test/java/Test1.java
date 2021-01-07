import org.testng.Assert;
import org.testng.annotations.*;

import static tools.PageManager.getPage;
public class Test1 extends BaseTestClass {

    @Test
    public void test_1(){
        Assert.assertTrue(getPage().startPage.getFooterAutoWithMileage().isDisplayed(), "something wrong!");
        getPage().startPage.getFooterAutoWithMileage().click();

    }
}
