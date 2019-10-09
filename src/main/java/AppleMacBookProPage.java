import org.openqa.selenium.By;

public class AppleMacBookProPage extends Utils {
    LoadProps loadProps= new LoadProps();
    public void verifyUserIsOnAppleMacBookPage(){
        assertURL(props.getProperty("applemacbookpageurl"));
    }
    private By _emailAFriendButton=By.xpath("//input[@value=\"Email a friend\"]");
    private By _friendemail=By.id("FriendEmail");
    private By _personalMessage=By.id("PersonalMessage");
    private By _sendEmailButton=By.xpath("//input[@value='Send email']");
    public void referProductToFriendAsaGuest() {
        clickElement(_emailAFriendButton);
        // to enter friend's email
        enterText(_friendemail, props.getProperty("FriendEmail"));
        // to enter your email address
        enterText(By.xpath("//input[@class='your-email']"),dateStamp()+props.getProperty("Email"));
        // to enter personal message to friend
        enterText(_personalMessage, props.getProperty("PersonalMessage"));
        // to click on SEND EMAIL button
        clickElement(_sendEmailButton);}

     public void referProductToFriendAsARegisteredUser(){
        clickElement(_emailAFriendButton);
         // to enter friend's email
         enterText(_friendemail, props.getProperty("FriendEmail"));
         // to enter personal message to friend
         enterText(_personalMessage, props.getProperty("PersonalMessage"));
         // to click on SEND EMAIL button
         clickElement(_sendEmailButton);}


}
