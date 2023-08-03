package tests.ParabankTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ParabankPages.*;
import utilities.BaseClass;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.WaitUtils;

public class RegisterTests extends BaseClass {

    @BeforeMethod
    public void goToUrl(){

        driver.get(ConfigurationReader.getProperty("parabank.url"));
        dashBoardPage.clickBtnRegister();
        BrowserUtils.pageVerification("ParaBank | Register for Free Online Account Access",driver.getTitle());
    }

    private DashBoardPage dashBoardPage=new DashBoardPage();
    private RegisterPage registerPage=new RegisterPage();
    private Products prod=new Products();
    private RequestDemoPage request1=new RequestDemoPage();
    private WaitUtils utils=new WaitUtils();
    private ContactUsPage contactUsPage=new ContactUsPage();


    @Test
    public  void registerCustomerTest(){
        registerPage.registerCustomer();
        registerPage.clickOnRegisterBtn();
        // Assert.assertFalse(registerPage.isAccountCreatedDisplayed());
        Assert.assertTrue(registerPage.isAccountCreatedDisplayed());


    }
    @Test
    public  void ProductsPage(){
      //
      //  Products prod=new Products();
        prod.clickOnProduct();
        prod.clickOnCustomerSuccess();
       // prod.clickOnSolution();
       // prod.clickOnApi();


       // Assert.assertTrue(registerPage.isAccountCreatedDisplayed());


    }

    @Test
    public  void requestDemo() throws InterruptedException {

        request1.clickOnProduct();
        Thread.sleep(7000);
        //request1.handleAlert();
//call the alert and accept the alert for this alertField





        // call wait to wait until element is clickable
        WaitUtils.waitUntilElmVisible(By.xpath("(//a[.='Request Demo'])[3]"));

       request1.clickORequest();
        Thread.sleep(3000);
        WaitUtils.waitUntilElmVisible(By.xpath("//input[@id='email-7ed713b5-8852-4410-8832-fb8a72b5ef5a']"));


         request1.requestDemo1();
        //Thread.sleep(3000);



    }
    @Test
    public  void ContactUs() throws InterruptedException {
        dashBoardPage.clickBtnContactUs();
        Thread.sleep(4000);
        contactUsPage.contact();
        contactUsPage.clickOnBtnSend();
        Thread.sleep(4000);













    }

}