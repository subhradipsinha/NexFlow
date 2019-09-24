package Com.PageObject;

import com.demo.ScreenShot;
import com.demo.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Inner_progect_page extends TestBase {
    Dashboard dashboard = new Dashboard();

    {
    }

    @Test(priority = 12)
    public void loadpage() throws Exception {

        //data_pipelines Tab Click
        TestBase.byXpath("data_pipelines").click();
        Thread.sleep(3000);

        // Scroll the Driver
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,600)");

        // Call the Load page
           if (!TestBase.byXpath("LoadPage").isSelected()) {
                TestBase.byXpath("LoadPage").click();
               ScreenShot.nexflow(driver,"Loadpage click");
                // Load page not call that time any project innerpage call
            } else if (!TestBase.byXpath("InnerPage").isSelected()) {
                TestBase.byXpath("InnerPage").click();
            }
        }
        @Test(priority = 13)
        public void projectpage1() throws Exception {
        // Search box used search project
        TestBase.byXpath("Lablesearch").sendKeys(TestData.getProperty("Teva_flow"));
        }
    @Test(priority = 14)
        public void projectpage() throws Exception {
        // inner project file click
        TestBase.byXpath("Project").click();
        Thread.sleep(2000);
        // Inner Execute Project Button click
        if(!TestBase.byXpath("Execute").isSelected()) {
            TestBase.byXpath("Execute").click();
            Thread.sleep(2000);
        }
        // Execute button not working that time switch to close button
        else if (!TestBase.byXpath("Close").isSelected()){
            TestBase.byXpath("Close").click();
        }

        // Execute button working that time complete the process and next process Close button click
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(
        ExpectedConditions.elementToBeClickable(TestBase.byXpath("Close")));
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        }



    }