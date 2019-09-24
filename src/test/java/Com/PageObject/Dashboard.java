package Com.PageObject;

import com.demo.ScreenShot;
import com.demo.TestBase;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.demo.ConfigarationManager.TestData;


public class Dashboard extends TestBase {
@BeforeTest
    public void init() throws Exception {
        TestBase.initilize();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public void dashboard() throws Exception {

        //data_pipelines Tab Click
        TestBase.byXpath("data_pipelines").click();
        Thread.sleep(3000);
        // Lablesearch search button search
        TestBase.byXpath("Lablesearch").sendKeys(TestData.getProperty("LablesearchComments"));
        Thread.sleep(2000);
        ScreenShot.nexflow(driver, "LablesearchComments");
        Thread.sleep(2000);
        TestBase.byXpath("Lablesearch").clear();

        SoftAssert softAssert = new SoftAssert();
        String actual_error = TestData.getProperty("actual_Massage");
        String expect_error = TestData.getProperty("expect_Massage");
        softAssert.assertEquals(actual_error, expect_error);
        softAssert.assertTrue(actual_error.contains(TestData.getProperty("error_Massage")));
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void dashboard1() throws Exception {
        // Lablesearch search button search
        TestBase.byXpath("Lablesearch").sendKeys(TestData.getProperty("LablesearchComments1"));
        Thread.sleep(2000);
        ScreenShot.nexflow(driver, "LablesearchComments1");
        Thread.sleep(2000);
        TestBase.byXpath("Lablesearch").clear();

        SoftAssert softAssert = new SoftAssert();
        String actual_error1 = TestData.getProperty("actual_Massage1");
        String expect_error1 = TestData.getProperty("expect_Massage1");
        softAssert.assertEquals(actual_error1, expect_error1);
        softAssert.assertTrue(actual_error1.contains(TestData.getProperty("error_Massage")));
        Thread.sleep(2000);

    }

    @Test(priority = 3)
    public void dashboard2() throws Exception {
        // Lablesearch search button search
        TestBase.byXpath("Lablesearch").sendKeys(TestData.getProperty("LablesearchComments2"));
        Thread.sleep(2000);
        ScreenShot.nexflow(driver, "LablesearchComments2");
        Thread.sleep(2000);
        TestBase.byXpath("Lablesearch").clear();

        SoftAssert softAssert = new SoftAssert();
        String actual_error2 = TestData.getProperty("actual_Massage2");
        String expect_error2 = TestData.getProperty("expect_Massage2");
        softAssert.assertEquals(actual_error2, expect_error2);
        softAssert.assertTrue(actual_error2.contains(TestData.getProperty("error_Massage")));
        Thread.sleep(2000);

    }

    @Test(priority = 4)
    public void dashboard3() throws Exception {
        // Lablesearch search button search
        TestBase.byXpath("Lablesearch").sendKeys(TestData.getProperty("LablesearchComments3"));
        Thread.sleep(2000);
        ScreenShot.nexflow(driver, "LablesearchComments3");
        Thread.sleep(2000);
        TestBase.byXpath("Lablesearch").clear();

        SoftAssert softAssert = new SoftAssert();
        String actual_error3 = TestData.getProperty("actual_Massage3");
        String expect_error3 = TestData.getProperty("expect_Massage3");
        softAssert.assertEquals(actual_error3, expect_error3);
        softAssert.assertTrue(actual_error3.contains(TestData.getProperty("error_Massage")));
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    // schedular Tab Click
    public void schedular() throws Exception {
        try {
            TestBase.byXpath("Schedular").click();
            Thread.sleep(2000);
            ScreenShot.nexflow(driver, "Schedular");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        String actual_error4 = TestData.getProperty("actual_Massage4");
        String expect_error4= TestData.getProperty("expect_Massage4");
        softAssert.assertEquals(actual_error4, expect_error4);
        softAssert.assertTrue(actual_error4.contains(TestData.getProperty("error_Massage4")));
        Thread.sleep(2000);
    }


    @Test(priority = 6)
    //FileUploader Tab Click
    public void FileUploader() throws Exception {
        TestBase.byXpath("File_Uploader").click();
        ScreenShot.nexflow(driver, "File_Uploader");
        Thread.sleep(1000);

        SoftAssert softAssert = new SoftAssert();
        String actual_error5 = TestData.getProperty("actual_Massage5");
        String expect_error5= TestData.getProperty("expect_Massage5");
        softAssert.assertEquals(actual_error5, expect_error5);
        softAssert.assertTrue(actual_error5.contains(TestData.getProperty("error_Massage5")));
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void DataPipelines() throws Exception {
        //DataPipelines Tab Click
        try {
            TestBase.byXpath("data_pipelines").click();
            ScreenShot.nexflow(driver, "data_pipelines");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
            Thread.sleep(2000);
        }
        SoftAssert softAssert = new SoftAssert();
        String actual_error6 = TestData.getProperty("actual_Massage6");
        String expect_error6= TestData.getProperty("expect_Massage6");
        softAssert.assertEquals(actual_error6, expect_error6);
        softAssert.assertTrue(actual_error6.contains(TestData.getProperty("error_Massage6")));
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void AccountSettings() throws Exception {
        // DC Hover Click and go for AccountSettings Button Click

        //Mouseover on DC button
        WebElement ele = TestBase.byXpath("DC");
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        ScreenShot.nexflow(driver, "hover Button click");
        Thread.sleep(2000);
        //Click on AccountSettings button
        WebElement b = TestBase.byXpath("AccountSettings");
        ScreenShot.nexflow(driver, "AccountSettings Button click");
        b.click();
        Thread.sleep(2000);


        SoftAssert softAssert = new SoftAssert();
        String actual_error7 = TestData.getProperty("actual_Massage7");
        String expect_error7= TestData.getProperty("expect_Massage7");
        softAssert.assertEquals(actual_error7, expect_error7);
        softAssert.assertTrue(actual_error7.contains(TestData.getProperty("error_Massage7")));
        Thread.sleep(2000);
    }
    @Test (priority = 9)
    public void LogOut() throws Exception {

        //Mouseover on Dc Tab
        WebElement ele = TestBase.byXpath("DC");
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        Thread.sleep(2000);

        // Click SingOut Button
        WebElement b = TestBase.byXpath("LogOUt");
        ScreenShot.nexflow(driver, "LogOUt Button click");
        b.click();
        Thread.sleep(2000);

        /*String actual_error8 = TestData.getProperty("actual_Massage8");
        String expect_error8= TestData.getProperty("expect_Massage8");
        Assert.assertEquals(actual_error8, expect_error8);
        Assert.assertTrue(actual_error8.contains(TestData.getProperty("error_Massage8")));
        Thread.sleep(2000);*/

    }
    // Menu bar Click
    @Test (priority = 10)
    public void trigerbutton() throws Exception {
        WebElement ele = TestBase.byXpath("TrigerButton");
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        ScreenShot.nexflow(driver, "TrigerButton Button click");
        Thread.sleep(2000);

        // Click ADD Button
        WebElement b = TestBase.byXpath("ADDButton");
        ScreenShot.nexflow(driver, "ADDButton click");
        b.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
    @Test(priority = 11)
    public void trigerbutton1() throws Exception {
        WebElement ele = TestBase.byXpath("TrigerButton");
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        Thread.sleep(2000);

        // Click Upload Button
        WebElement b = TestBase.byXpath("UploadFile");
        ScreenShot.nexflow(driver, "UploadFile Button click");
        b.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

    }
    @AfterTest
    public void quit()
    {
        driver.quit();
    }

}
