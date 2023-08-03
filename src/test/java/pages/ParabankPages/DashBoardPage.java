package pages.ParabankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class DashBoardPage extends BasePage {

    @FindBy(xpath ="//a[.='Register']")
    private WebElement registerBtn;

    @FindBy(xpath ="(//a[.='Contact Us'])[1]")
    private WebElement contactUsBtn;



    public void clickBtnRegister(){

        registerBtn.click();
    }
    public void clickBtnContactUs(){

        contactUsBtn.click();
    }

}
