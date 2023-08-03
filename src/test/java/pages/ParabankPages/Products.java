package pages.ParabankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class Products extends BasePage {
    @FindBy(xpath="(//ul/li/a[.='Products'])[1]")
    private WebElement productClick;

    @FindBy(xpath="//ul/li/a[.='Customer Success']")
    private WebElement CustomerSuccess;

    @FindBy(id="heading-1")
    private WebElement SolutionDrop;

    @FindBy(xpath="//label[.='API Security Testing']")
    private WebElement ApiTestField;


    public void clickOnProduct(){

        productClick.click();
    }

    public void clickOnCustomerSuccess(){

        productClick.click();
    }
    public void clickOnSolution(){

        SolutionDrop.click();
    }
    public void clickOnApi(){

        ApiTestField.click();
    }


}
