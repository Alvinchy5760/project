import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test extends targetsetup {
    targethome home;
    @BeforeMethod
    void setuptst(){
        setupdriver("https:ebay.com");
        home= PageFactory.initElements(driver,targethome.class);
    }
    @AfterMethod
    void off() throws InterruptedException {
       close();
    }
    @Test
    void drop2()  {
        home.drop1();
    }
 @Test
  void logo2(){
        boolean d = home.logo(driver);
        Assert.assertTrue(d);
 }
 @Test
    void dry(){
        Assert.assertTrue(home.ghm(driver).contains("1995-2023"));
 }
    @Test
    void clicktstt(){
        home.clickk(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("bn_7115656410"));
    }
    @Test
    void dtest() throws InterruptedException {
        home.d1();
    }
    @Test
    void electest() throws InterruptedException {
        home.elec(driver);

    }
    @Test
    void dishtst() throws InterruptedException {
        home.dishcollect(driver);
    }
    @Test
    void drpchk1() throws InterruptedException {
        home.drpchk();

    }
    @Test
    void drpchk2tst()  {
        home.drpchk2();
    }
    @Test
    void dr(){
        dropdown(home.ebaydrop, 8);
    }
   @Test
    void hdphn()  {
        home.heaphn(driver);
   }
@Test
    void tytst(){
        String actualtxt=home.tytxt();
        Assert.assertEquals(actualtxt,"Toys");
        actualtxt.substring(0,1);
}










}
