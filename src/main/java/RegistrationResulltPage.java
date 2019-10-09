import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResulltPage extends Utils{
    LoadProps loadProps= new LoadProps();
    public void verifyUserIsOnRegistrationSuccessPage(){
        assertURL(props.getProperty("registrationsuccesspageurl"));
    }

    public void verifySuccessMessage(){
        assertMessage(props.getProperty("registersuccessmessage"),By.xpath("//div[@class='result']"));
    }

    private By _continueButton= By.name("register-continue");
    private By _computerButton= By.linkText("Computers");
    private By _electronicsButton=By.linkText("Electronics");
    private By _apparelButton = By.linkText("Apparel");
    private By _digitalDownloadsButton =By.linkText("Digital downloads");
    private By _booksButton = By.linkText("Books");
    private By _jewelryButton =By.linkText("Jewelry");
    private By _giftCardButton = By.linkText("Gift Cards");
    private By _searchButton=By.xpath("//input[@class='search-box-text ui-autocomplete-input']");
    private By _myAccountButton=By.xpath("//a[@class='ico-account']");

    public void userClickOnContinueButton(){
        clickElement(_continueButton);
    }

}
