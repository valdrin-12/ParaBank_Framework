package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BrowserUtils extends BaseClass{

    public static void pageVerification(String exp, String url){

        Assert.assertEquals(exp ,url);
    }
    public static void selectByValue(String str, WebElement elm){


        select =new Select(elm);
        select.selectByVisibleText(str);
    }
    public static void movetoelement(WebElement elm){

        actions.moveToElement(elm).click().perform();
    }
    public static void dragAnddropTest(WebElement startLocation ,WebElement destination){

        actions.dragAndDrop(startLocation,destination).perform();
    }
    public static void switchToAlert(){
        alert=driver.switchTo().alert();

    }
    public static void switchToParentFrame(){

        driver.switchTo().parentFrame();
    }
    public static void switchToFrame(String name){

        driver.switchTo().frame(name);
    }
}
