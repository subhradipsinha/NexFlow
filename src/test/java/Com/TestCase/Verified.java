package Com.TestCase;

import Com.PageObject.Dashboard;
import Com.PageObject.FileUploader;
import Com.PageObject.Inner_progect_page;
import Com.PageObject.schedular;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verified {

public static Dashboard dashboard = new Dashboard();
public static Inner_progect_page inner_progect_page = new Inner_progect_page();
public static schedular schedular = new schedular();
public static FileUploader fileUploader = new FileUploader();

@BeforeTest
public void beforetest() throws Exception {
    dashboard.init();
}
@Test(priority = 4)
    public void verifyValidLogin() throws Exception {
    dashboard.dashboard();
    dashboard.dashboard1();
    dashboard.dashboard2();
    dashboard.dashboard3();
    dashboard.schedular();
    dashboard.FileUploader();
    dashboard.DataPipelines();
    dashboard.AccountSettings();
    dashboard.LogOut();
    dashboard.trigerbutton();
    dashboard.trigerbutton1();
}
    @Test (priority = 3)
     public void Inner_page() throws Exception {
        inner_progect_page.loadpage();
        inner_progect_page.projectpage1();
        inner_progect_page.projectpage();
    }
    @Test(priority = 2)
     public void schedulaedemo() throws Exception {
            schedular.SchudularTest();
        }
     @Test(priority = 1)
     public void Fileupload() throws Exception {

    fileUploader.fileupload();
    fileUploader.radiobutton();
    fileUploader.startupbutton();
    fileUploader.radiobutton2();
    fileUploader.radiobutton3();
    fileUploader.textbox();
    fileUploader.textbox1();
    fileUploader.droup_down_box();
    fileUploader.Folder_name();

     }
@AfterTest
    public void aftertest(){
    dashboard.quit();

}
}
