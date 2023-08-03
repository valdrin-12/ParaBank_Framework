package pages.ParabankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;



public class RegisterPage extends BasePage {

    @FindBy(id="customer.firstName")
    private WebElement firstNAmeField;

    @FindBy(id="customer.lastName")
    private WebElement lastNAmeField;

    @FindBy(id="customer.address.street")
    private WebElement addressField;

    @FindBy(id="customer.address.city")
    private WebElement cityField;

    @FindBy(id="customer.address.state")
    private WebElement stateField;

    @FindBy(id="customer.address.zipCode")
    private WebElement zipCodeField;

    @FindBy(id="customer.phoneNumber")
    private WebElement phoneField;

    @FindBy(id="customer.ssn")
    private WebElement ssnField;
    @FindBy(id="customer.username")
    private WebElement usernameField;

    @FindBy(id="customer.password")
    private WebElement passwordField;

    @FindBy(id="repeatedPassword")
    private WebElement confirmPasswordField;

    @FindBy(xpath="//*[@value='Register']")
    private WebElement registerbtnField;

    @FindBy(xpath = "//*[contains(text(),'created')]")
    private WebElement accountCreated;


    public void registerCustomer(){
        String password=faker.internet().password();

        firstNAmeField.sendKeys(faker.name().firstName());
        lastNAmeField.sendKeys(faker.name().lastName());
        addressField.sendKeys(faker.address().streetAddress());
        cityField.sendKeys(faker.address().city());
        stateField.sendKeys(faker.address().state());
        zipCodeField.sendKeys(faker.address().zipCode());
        phoneField.sendKeys(faker.phoneNumber().phoneNumber());
        ssnField.sendKeys(faker.idNumber().ssnValid());
        usernameField.sendKeys(faker.name().username());
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);


    }
    public void clickOnRegisterBtn(){

        registerbtnField.click();
    }
    public boolean isAccountCreatedDisplayed (){

        return accountCreated.isDisplayed();
    }





}
