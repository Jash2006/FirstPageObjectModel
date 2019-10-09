import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage= new HomePage();
    RegistrationPage registrationPage= new RegistrationPage();
    RegistrationResulltPage registrationResulltPage=new RegistrationResulltPage();
    BooksPage booksPage= new BooksPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    OnePageCheckOutPage onePageCheckOutPage=new OnePageCheckOutPage();
    CheckOutAsUserPage checkOutAsUserPage=new CheckOutAsUserPage();
    CheckoutCompletePage checkoutCompletePage=new CheckoutCompletePage();
    AppleMacBookProPage appleMacBookProPage=new AppleMacBookProPage();
    ProductEmailAFriend productEmailAFriend=new ProductEmailAFriend();

    @Test
    public void userShouldBeAbleToRegisterSuccessfully(){
      homePage.clickOnRegisterButton();
      registrationPage.verifyUserIsOnRegistrationPage();
      registrationPage.userEnterRegistrationDetails();
      registrationResulltPage.verifyUserIsOnRegistrationSuccessPage();
      registrationResulltPage.verifySuccessMessage();
    }
    @Test
    public void registeredUserShouldBeAbleToReferProductToFriend(){
        userShouldBeAbleToRegisterSuccessfully();
        registrationResulltPage.verifyUserIsOnRegistrationSuccessPage();
        registrationResulltPage.verifySuccessMessage();
        registrationResulltPage.userClickOnContinueButton();
        homePage.verifyUserIsOnHomePage();
        homePage.userChooseProductToReferAFriend();
        appleMacBookProPage.verifyUserIsOnAppleMacBookPage();
        appleMacBookProPage.referProductToFriendAsARegisteredUser();
        productEmailAFriend.verifyUserIsOnProductEmailAFriendPage();
        productEmailAFriend.verifyProductRefferalSuccessMessage();
    }
    @Test
    public void unregisteredUserShouldNotBeAbleToReferProductToFriend(){
        homePage.userChooseProductToReferAFriend();
        appleMacBookProPage.referProductToFriendAsaGuest();
        productEmailAFriend.verifyUserIsOnProductEmailAFriendPage();
        productEmailAFriend.verifyProductRefferalFailureMessage();
    }
    @Test
    public void registeredUserShouldBeAbleToBuyProductSuccessfully(){
        userShouldBeAbleToRegisterSuccessfully();
        registrationResulltPage.verifyUserIsOnRegistrationSuccessPage();
        registrationResulltPage.verifySuccessMessage();
        registrationResulltPage.userClickOnContinueButton();
        homePage.verifyUserIsOnHomePage();
        homePage.clickOnBooksButton();
        booksPage.userSelectBookToEnterInCart();
        shoppingCartPage.verifyUserIsOnShoppingCartPage();
        shoppingCartPage.verifyBookIsInShoppingCart();
        shoppingCartPage.userEnterEstimateShipping();
        shoppingCartPage.userCheckoutProduct();
        onePageCheckOutPage.verifyCheckoutMessage();
        onePageCheckOutPage.registeredUserEnterDetailsForCheckOut();
        checkoutCompletePage.verifyCheckoutSuccessMessage();
    }
    @Test
    public void guestUserShouldBeAbleToBuyProduct(){
        homePage.clickOnBooksButton();
        booksPage.verifyUserIsOnBooksPage();
        booksPage.userSelectBookToEnterInCart();
        shoppingCartPage.verifyBookIsInShoppingCart();
        shoppingCartPage.verifyBookIsInShoppingCart();
        shoppingCartPage.userEnterEstimateShipping();
        shoppingCartPage.userCheckoutProduct();
        checkOutAsUserPage.verifyUserIsOnCheckOutAsUserPage();
        checkOutAsUserPage.verifyGuestWelComeMessage();
        checkOutAsUserPage.guestClickOnCheckoutAsGuest();
        onePageCheckOutPage.verifyUserIsOnOnePageCheckoutPage();
        onePageCheckOutPage.guestUserEnterDetails();
        checkoutCompletePage.verifyCheckoutSuccessMessage();
    }


}
