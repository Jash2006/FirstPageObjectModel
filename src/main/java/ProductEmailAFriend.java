import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriend extends Utils{
    LoadProps loadProps= new LoadProps();
    public void verifyUserIsOnProductEmailAFriendPage(){
        assertURL(props.getProperty("productemailafriendpage"));
    }
    private By _actualfailureMsg=By.xpath("//*[text()='Only registered customers can use email a friend feature']");
    private By _actualsuccessMsg=By.xpath("//div[@class='result']  ");

    public void verifyProductRefferalFailureMessage(){
        String actualrefermsg = getTextFromElement(_actualfailureMsg);
        Assert.assertEquals(actualrefermsg,"Only registered customers can use email a friend feature");
    }
    public void verifyProductRefferalSuccessMessage(){
        String actualrefermsg = getTextFromElement(_actualsuccessMsg);
        Assert.assertEquals(actualrefermsg,"Your message has been sent.");
    }
}
