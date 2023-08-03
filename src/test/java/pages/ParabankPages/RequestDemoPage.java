package pages.ParabankPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class RequestDemoPage extends BasePage {
    @FindBy(xpath="(//ul/li/a[.='Products'])[1]")
    private WebElement productClick;

    @FindBy(xpath="//div[@data-clickable=\"true\" and @data-backend-test-id=\"message-bubble\" and contains(@class, \"display-card\")]\n")
    private WebElement alertField;
    @FindBy(xpath="(//a[.='Try Parasoft'])[1]")
    private WebElement ParasoftBtn;
    @FindBy(xpath="(//a[.='Request Demo'])[3]")
    private WebElement requestBtn;
    @FindBy(xpath="//input[@id='email-7ed713b5-8852-4410-8832-fb8a72b5ef5a']")
    private WebElement emailField;



       // firstNAmeField.sendKeys(faker.name().firstName());
       public void requestDemo1(){
          // String password=faker.internet().password();

           emailField.sendKeys("myemail@company.com");



       }

    public void handleAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present.");
        }
    }

    public void clickOnProduct(){

        productClick.click();
    }

    public void clickOParasoftBtn(){

        ParasoftBtn.click();
    }
    public void clickORequest(){

        requestBtn.click();
    }




}
