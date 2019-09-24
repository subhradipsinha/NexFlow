package Com.PageObject;

import com.demo.ScreenShot;
import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class FileUploader extends TestBase {
    schedular schedular = new schedular();

    @Test(priority = 15)
    // File_Uploader Tab Click
    public void fileupload() throws Exception {
        TestBase.byXpath("File_Uploader").click();
        ScreenShot.nexflow(driver, "File_Uploader");
        Thread.sleep(3000);
    }

    @Test(priority = 16)
    public void radiobutton() throws Exception {
        // Data Radio Button Click
            WebElement radiobtn = TestBase.byXpath("DataRadioButton");
            radiobtn.click();
            Thread.sleep(10000);
        }

        //Star on and Off Button click
    @Test(priority = 17)
    public void startupbutton() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/md-content[1]/div[1]/div[1]/div[1]/div[1]/md-content[1]/div[1]/div[2]/div[1]/md-switch[1]/div[2]")));
        element.click();
        Thread.sleep(4000);
    }
    // First_Project selected
    @Test(priority = 18)
    public void radiobutton2() throws Exception {
    TestBase.byXpath("First_Project").click();
    Thread.sleep(4000);
    ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,12000)");
    Thread.sleep(4000);
    }

    @Test(priority = 19)
    public void radiobutton3() throws Exception {
        TestBase.byXpath("From_URL").click();
//        Thread.sleep(5000);
    }
    @Test(priority = 20)
    public void textbox() throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TestBase.byXpath("Pipline_URL").sendKeys(TestData.getProperty("Comments"));
        Thread.sleep(3000);
        TestBase.byXpath("Pipline_URL").clear();
        Thread.sleep(3000);
    }
    @Test(priority = 21)
    public void textbox1() throws Exception {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TestBase.byXpath("Pipline_URL").sendKeys(TestData.getProperty("Comments1"));
        Thread.sleep(5000);
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(12000,0)");
        driver.navigate().refresh();
        Thread.sleep(5000);
    }

    //droup_down_box Value read
    @Test(priority = 22)
    public void droup_down_box() throws Exception {
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,200)");
        Select dr_sp_upload = new Select(TestBase.byXpath("sd_uploads"));
        dr_sp_upload.selectByVisibleText("Teva");
        Thread.sleep(4000);
    }
    // Folder given Value
    @Test(priority = 23)
    public void Folder_name() throws Exception {
        TestBase.byXpath("Folder_name_xpath").sendKeys(TestData.getProperty("Folder_name_comments"));
        //TestBase.byXpath("Add_folder_button_click").click();
        Thread.sleep(4000);

        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(400,0)");
        Thread.sleep(3000);
    }
}