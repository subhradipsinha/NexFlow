package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager extends ConfigarationManager {

    //public static ConfigarationManager configarationManager = new ConfigarationManager();
    public static WebDriver driver;


    public static void browser() throws Exception {

        ConfigarationManager.conficfile();
        String Url = ConfigarationManager.config.getProperty("URL");
        String browsername = ConfigarationManager.config.getProperty("browser1");
        if (browsername.equalsIgnoreCase("Chrome")) {

//            WebElement frm = driver.findElement(By.xpath("//iframe[@tabindex='0']"));
//    driver.switchTo().frame(frm); using Frame
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\comNexFlowdemo\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        driver.get(Url);
        Thread.sleep(5000);

    }
}


