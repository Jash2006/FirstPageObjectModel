import org.openqa.selenium.By;

public class OnePageCheckOutPage extends Utils{
    LoadProps loadProps= new LoadProps();
    public void verifyUserIsOnOnePageCheckoutPage(){
        assertURL(props.getProperty("onepagecheckoutpage"));
    }
    public void verifyCheckoutMessage(){
        assertMessage("Checkout", By.xpath("//*[text()='Checkout']"));
    }
    private By _firstName=By.xpath("//input[@id='BillingNewAddress_FirstName']");
    private By _lastName=By.xpath("//input[@id='BillingNewAddress_LastName']");
    private By _guestEmail=By.xpath("//input[@id='BillingNewAddress_Email']");
    private By _countryDropDown=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    private By _cityTextBox=By.xpath("//input[@id='BillingNewAddress_City']");
    private By _address1TextBox=By.xpath("//input[@id='BillingNewAddress_Address1']");
    private By _zipOrPostcode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private By _phoneNumberTextBox= By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private By _continueButton1= By.xpath("//input[@class='button-1 new-address-next-step-button' and @onclick='Billing.save()']");
    private By _continueButton2=By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
    private By _creditCardSelect=By.xpath("//input[@id='paymentmethod_1']");
    private By _continueButton3=By.xpath("//input[@class='button-1 payment-method-next-step-button']");
    private By _creditCardDropDown=By.xpath("//select[@id='CreditCardType']");
    private By _cardHolderName=By.xpath("//input[@id='CardholderName']");
    private By _cardNumber=By.xpath("//input[@id='CardNumber']");
    private By _cardExpiryMonth= By.xpath("//select[@id='ExpireMonth']");
    private By _cardExpiryYear=By.xpath("//select[@id='ExpireYear']");
    private By _cardCode=By.xpath("//input[@id='CardCode']");
    private By _continueButton4=By.xpath("//input[@class='button-1 payment-info-next-step-button']");
    private By _confirmButton=By.xpath("//input[@class='button-1 confirm-order-next-step-button']");

    public void guestUserEnterDetails(){
        enterText(_firstName,props.getProperty("guestfirstname"));
        enterText(_lastName,props.getProperty("guestlastname"));
        enterText(_guestEmail,props.getProperty("guestemail"));
        dropDownSelectionByVisibleText(_countryDropDown,props.getProperty("guestcountry"));
        enterText(_cityTextBox,props.getProperty("guestcity"));
        enterText(_address1TextBox,props.getProperty("guestaddress1"));
        enterText(_zipOrPostcode,props.getProperty("guestpostcode"));
        enterText(_phoneNumberTextBox,props.getProperty("guestphonenumber"));
        clickElement(_continueButton1);
        waitForElementClickable(_continueButton2,10);
        clickElement(_continueButton2);
        clickElement(_creditCardSelect);
        clickElement(_continueButton3);
        dropDownSelectionByVisibleText(_creditCardDropDown,"Master card");
        enterText(_cardHolderName,props.getProperty("cardholdername"));
        enterText(_cardNumber,props.getProperty("cardnumber"));
        dropDownSelectionByVisibleText(_cardExpiryMonth,"04");
        dropDownSelectionByVisibleText(_cardExpiryYear,"2023");
        enterText(_cardCode,"123");
        clickElement(_continueButton4);
        waitForElementClickable(_confirmButton,10);
        clickElement(_confirmButton);
    }

    public void registeredUserEnterDetailsForCheckOut(){
        dropDownSelectionByVisibleText(_countryDropDown,props.getProperty("guestcountry"));
        enterText(_cityTextBox,"Wembley");
        enterText(_address1TextBox,"16 Chestnut Grove");
        enterText(_zipOrPostcode,"UB5 4RG");
        enterText(_phoneNumberTextBox,"07876654234");
        waitForElementClickable(_continueButton1,10);
        clickElement(_continueButton1);
        waitForElementClickable(_continueButton2,10);
        clickElement(_continueButton2);
        clickElement(_creditCardSelect);
        clickElement(_continueButton3);
        dropDownSelectionByVisibleText(_creditCardDropDown,"Master card");
        enterText(_cardHolderName,"Uday Patel");
        enterText(_cardNumber,props.getProperty("cardnumber"));
        dropDownSelectionByVisibleText(_cardExpiryMonth,"04");
        dropDownSelectionByVisibleText(_cardExpiryYear,"2023");
        enterText(_cardCode,"123");
        waitForElementClickable(_continueButton4,10);
        clickElement(_continueButton4);
        waitForElementClickable(_confirmButton,10);
        clickElement(_confirmButton);


    }


}
