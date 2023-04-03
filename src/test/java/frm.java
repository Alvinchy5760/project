import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frm extends targetsetup{
    targethome home;
    @BeforeMethod
    void fff(){
        setupdriver("https://google.com");
        home= PageFactory.initElements(driver,targethome.class);
    }
    @AfterMethod
    void off() throws InterruptedException {
        close();
    }
    @Test
    void frametest(){
        driver.switchTo().frame(0);
        home.frmm.click();
    }
    @Test
    void ggl(){
        home.gglsrch.sendKeys("AR15", Keys.ENTER);

    }




}
