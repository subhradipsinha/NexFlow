package Com.PageObject;

import com.demo.ScreenShot;
import com.demo.TestBase;

public class schedular extends TestBase {
    Inner_progect_page inner_progect_page = new Inner_progect_page();
    public void SchudularTest() throws Exception {

            TestBase.byXpath("Schedular").click();
            Thread.sleep(2000);
            ScreenShot.nexflow(driver, "Schedular");
            Thread.sleep(2000);

        // 3dots Click
        TestBase.byXpath("3dots").click();
        Thread.sleep(2000);
        // Edit Tab Click
        TestBase.byXpath("Edit").click();
        Thread.sleep(3000);
        // back to return page
        driver.navigate().back();
        Thread.sleep(5000);
    }

}
