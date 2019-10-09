import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils{
    LoadProps props=new LoadProps();
    private By _registerButton= By.xpath("//a[@class='ico-register']");
    private By _logInButton= By.xpath("//a[@class='ico-login']");
    private By _wishListButton=By.xpath("//span[@class='wishlist-label']");
    private By _shoppingCartButton=By.xpath("//span[@class='cart-label']");
    private By _computerButton= By.linkText("Computers");
    private By _electronicsButton=By.linkText("Electronics");
    private By _apparelButton = By.linkText("Apparel");
    private By _digitalDownloadsButton =By.linkText("Digital downloads");
    private By _booksButton = By.linkText("Books");
    private By _jewelryButton =By.linkText("Jewelry");
    private By _giftCardButton = By.linkText("Gift Cards");
    private By _searchTextBox = By.xpath("//input[@class='search-box-text ui-autocomplete-input']");
    private By _appleMacbookImage=By.xpath("//img[@title=\"Show details for Apple MacBook Pro 13-inch\"]");

    // to click on register button
    public void clickOnRegisterButton(){
        clickElement(_registerButton);
    }
    // to click on login button
    public void clickOnLoginButton(){
        clickElement(_logInButton);
    }
    // to click on wish list button
    public void clickOnWishListButton(){
        clickElement(_wishListButton);
    }
    // to click on shopping cart button
    public void clickOnShoppingCartButton(){
        clickElement(_shoppingCartButton);
    }
    // to click on computer category
    public void clickOnComputerButton(){
        clickElement(_computerButton);
    }
    //to click on electronics category
    public void clickOnElectronicsButton(){
        clickElement(_electronicsButton);
    }
    //to click on apparel category
    public void clickOnApparelButton(){
        clickElement(_apparelButton);
    }
    //to click on Digital downloads category
    public void clickOnDigitalDownloadsButton(){
        clickElement(_digitalDownloadsButton);
    }
    //to click on books category
    public void clickOnBooksButton(){
        clickElement(_booksButton);
    }
    //to click on jewelry category
    public void clickOnJewelryButton(){
        clickElement(_jewelryButton);
    }
    //to click on gift cards category
    public void clickOnGiftCardsButton(){
        clickElement(_giftCardButton);
    }
    //to enter text in search text-box
    public void enterTextInSearchTextBox(){
        enterText(_searchTextBox,props.getProperty("searchtext"));
    }

    public void verifyUserIsOnHomePage(){
        assertURL(props.getProperty("url"));
    }

    public void referProductToFriendAsaRegisteredUser() {
        // to click on nopp commerce logo
        clickElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        // to select the Apple macbook image
        clickElement(By.xpath("//img[@title=\"Show details for Apple MacBook Pro 13-inch\"]"));
        // to select email a friend
        clickElement(By.xpath("//input[@value=\"Email a friend\"]"));
        // to enter friend's email
        enterText(By.id("FriendEmail"), props.getProperty("FriendEmail"));
        // to enter personal message to friend
        enterText(By.id("PersonalMessage"), props.getProperty("PersonalMessage"));
        // to click on SEND EMAIL button
        clickElement(By.xpath("//input[@value='Send email']"));}

    public void verifyProductRefferalSuccessMessage(){
        String actualrefermsg = getTextFromElement(By.xpath("//*[@class='result' and contains(text(),'Your message has been sent.')]"));
        Assert.assertEquals(actualrefermsg,"Your message has been sent.");
    }
    public void userChooseProductToReferAFriend(){
        // to select the Apple macbook image
        clickElement(_appleMacbookImage);
    }





}
