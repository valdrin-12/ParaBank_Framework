package pages.ParabankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class ContactUsPage extends BasePage {
    @FindBy(xpath="//input[@id='name']")
    private WebElement firstNAmeField;
    @FindBy(xpath="//input[@id='email']")
    private WebElement emailField;
    @FindBy(xpath="//input[@id='phone']")
    private WebElement phoneField;
    @FindBy(xpath="//tr/td/textarea[@class='input']")
    private WebElement messageField;
    @FindBy(xpath=" //tr/td/input[@class='button']")
    private WebElement sendBtn;


    public void contact(){
        String password=faker.internet().password();

        firstNAmeField.sendKeys(faker.name().firstName());
        emailField.sendKeys("hh@gmail.com");
        phoneField.sendKeys("99423345638");
        messageField.sendKeys("please confirm my message");


    }
    public void clickOnBtnSend(){


        sendBtn.click();
    }


}
