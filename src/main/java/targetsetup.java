import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class targetsetup {

    WebDriver driver;
    void setupdriver(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
         driver= new ChromeDriver();
         driver.get(url);

    }
    void close() throws InterruptedException {
        Thread.sleep(8000);
        driver.quit();
    }
    void dropdown(WebElement element,int index){
        Select select=new Select(element);
        select.selectByIndex(index);
    }
    void dropdown2(WebElement element,String text){
        Select select=new Select(element);
        select.deselectByVisibleText(text);
    }

    void movemouse(WebDriver drv,WebElement element){
        Actions action = new Actions(drv);
        action.moveToElement(element).perform();
    }
void doubleclick(WebDriver dr,WebElement element){
        Actions action =new Actions(dr);
        action.doubleClick(element).perform();
}

void sabar(WebDriver dtt,int time,WebElement element){
        WebDriverWait wait=new WebDriverWait(dtt,time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    void sabar1(WebDriver dtt,int time,WebElement element){
        WebDriverWait wait=new WebDriverWait(dtt,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }










    }












