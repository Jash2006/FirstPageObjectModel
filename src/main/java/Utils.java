import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{
    LoadProps props=new LoadProps();
    // this method is to get the screenshot
    public void takeScreenshot(String filename){
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshot As method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File("src\\test\\Screenshots"+filename+dateStamp()+".png");

        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //This code will generate datestamp.
    public static String dateStamp(){
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyhhmmss");
        return format.format(new Date());
    }
    //to quite the driver
    public void quiteDriver(){
        driver.quit();
    }
    //select from dropdown by visible text
    public void dropDownSelectionByVisibleText(By by, String text) {
        Select drpDate = new Select(driver.findElement(by));
        drpDate.selectByVisibleText(text);
    }
    //this method is to click on element
    public  void clickElement(By by){
        driver.findElement(by).click();
    }
    //this method is to enter the text at element
    public void enterText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    //this method is to get text as a return from element
    public String  getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

   // this method is to verify user is on required URL.
    public void assertURL(String expectedURL){
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }

    public void assertMessage(String expectedMessage,By by){
        String actualMessage= getTextFromElement(by);
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    // (4)this method is for webdriver to wait until the clickable element is present explicit wait
    public static void waitForElementClickable(By by,long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    // (5)this method is for webdriver to wait until the  element is visible
    public static void waitForElementVisible(By by,long time){
        WebDriverWait wait= new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }




}
