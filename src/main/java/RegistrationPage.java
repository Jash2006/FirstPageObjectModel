import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    LoadProps loadProps = new LoadProps();
    private By _maleGender=By.xpath("//input[@value='M']");
    private By _femaleGender=By.xpath("//input[@value='M']");
    private By _firstName=By.id("FirstName");
    private By _lastName=By.xpath("//input[@name='LastName']");
    private By _birthDate= By.xpath("//select[@name='DateOfBirthDay']");
    private By _birthMonth= By.xpath("//select[@name='DateOfBirthMonth']");
    private By _birthYear=By.xpath("//select[@name='DateOfBirthYear']");
    private By _email=By.name("Email");
    private By _password= By.name("Password");
    private By _confirmPassword= By.id("ConfirmPassword");
    private By _registerButton= By.name("register-button");

    public void verifyUserIsOnRegistrationPage(){
        assertURL(props.getProperty("registrationpageurl"));
    }
    public void userEnterRegistrationDetails(){
        clickElement(_maleGender);
        enterText(_firstName,props.getProperty("FirstName"));
        enterText(_lastName,props.getProperty("LastName"));
        dropDownSelectionByVisibleText(_birthDate,props.getProperty("Date"));
        dropDownSelectionByVisibleText(_birthMonth,props.getProperty("Month"));
        dropDownSelectionByVisibleText(_birthYear,props.getProperty("Year"));
        enterText(_email,dateStamp()+props.getProperty("Email"));
        enterText(_password,props.getProperty("Password"));
        enterText(_confirmPassword,props.getProperty("ConfirmPassword"));
        clickElement(_registerButton);
    }

}
