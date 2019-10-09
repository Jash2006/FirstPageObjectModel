import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    LoadProps loadProps= new LoadProps();
    public void verifyUserIsOnShoppingCartPage(){
        assertURL(props.getProperty("shoppingcartpageurl"));
    }
    public void verifyBookIsInShoppingCart(){
        // This code check whether first book is on shopping cart page
        String expectedBook = getTextFromElement(By.xpath("//a[@class='product-name' and text()='First Prize Pies']"));
        Assert.assertEquals("First Prize Pies", expectedBook);
    }

    private By _ckeckBoxTick=By.xpath("//input[@id='termsofservice']");
    private By _countryDropDown=By.xpath("//select[@class='country-input']");
    private By _zipOrPostCode=By.xpath("//input[@id='ZipPostalCode']");
    private By _estimateButton= By.xpath("//input[@id='estimate-shipping-button']");
    private By _checkoutButton=By.xpath("//button[@id='checkout']");

    public void userEnterEstimateShipping(){
        dropDownSelectionByVisibleText(_countryDropDown,"United Kingdom");
        enterText(_zipOrPostCode,"HA0 2LX");
        clickElement(_estimateButton);
    }
    public void userCheckoutProduct(){
        clickElement(_ckeckBoxTick);
        clickElement(_checkoutButton);
    }



}
