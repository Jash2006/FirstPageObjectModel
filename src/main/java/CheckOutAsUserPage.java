import org.openqa.selenium.By;

public class CheckOutAsUserPage extends Utils{
    LoadProps loadProps= new LoadProps();
    public void verifyUserIsOnCheckOutAsUserPage(){
        assertURL(props.getProperty("checkoutasguesturl"));
    }
    public void verifyGuestWelComeMessage(){
        assertMessage(props.getProperty("checkoutasguestwelcomemessage"), By.xpath("//*[text()='Welcome, Please Sign In!']"));
    }
    private By _checkoutAsGuestButton=By.xpath("//input[@class='button-1 checkout-as-guest-button']");


    public void guestClickOnCheckoutAsGuest(){
        clickElement(_checkoutAsGuestButton);


    }
}
