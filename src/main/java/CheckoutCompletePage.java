import org.openqa.selenium.By;

public class CheckoutCompletePage extends Utils{
    LoadProps loadProps= new LoadProps();

    public void verifyCheckoutSuccessMessage(){
        assertMessage("Your order has been successfully processed!", By.xpath("//*[text()='Your order has been successfully processed!']"));
    }
}
