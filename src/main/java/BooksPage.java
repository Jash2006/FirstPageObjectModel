import org.openqa.selenium.By;
import org.testng.Assert;

public class BooksPage extends Utils {
    LoadProps loadProps= new LoadProps();
    public void verifyUserIsOnBooksPage(){
        assertURL(props.getProperty("bookspageurl"));
    }
    private By _firstPrizePiesBook=By.linkText("First Prize Pies");
    private By _firstPrizePiesBookAddToCart=By.xpath("//input[@id='add-to-cart-button-38']");
    private By _shoppingCartButton=By.xpath("//a[@href=\"/cart\" and text()='shopping cart']");

    public void userSelectBookToEnterInCart(){
        clickElement(_firstPrizePiesBook);
        clickElement(_firstPrizePiesBookAddToCart);
        waitForElementVisible(By.xpath("//span[@class='cart-qty' and text()='(1)']"), 10);
        clickElement(_shoppingCartButton);
    }


}
