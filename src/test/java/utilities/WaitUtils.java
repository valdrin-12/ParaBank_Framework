package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WaitUtils extends BaseClass{

    public static void waitElmIsDisplayed(By elm){

        wait.until(ExpectedConditions.presenceOfElementLocated(elm));


    }
    public static void waitUntilElmVisible(By elm){

        wait.until(ExpectedConditions.elementToBeClickable(elm));
    }
    public static void waitUntilElmInvisible(By elm){


        wait.until(ExpectedConditions.invisibilityOfElementLocated(elm));
    }
    public static void sleep(int sec){

        try{
            Thread.sleep(sec*1000);



        }catch(InterruptedException e){
            throw  new RuntimeException(e);
        }

    }


}

