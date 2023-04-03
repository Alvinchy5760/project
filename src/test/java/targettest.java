import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class targettest extends targetsetup {
    targethome home;
    @BeforeMethod
    void setuptst(){
        setupdriver("https://target.com");
         home= PageFactory.initElements(driver,targethome.class);
    }
    @AfterMethod
    void quit() throws InterruptedException {
        close();
    }
    @Test
    void srch1test(){
        home.srch1();
    }
    @Test
    void gettxttest(){
        String actualtxt = home.gettxt1();
        Assert.assertEquals(actualtxt,"Get hopping on Easter gifts");
    }
    @Test
    void gettxttest2(){
        Assert.assertTrue(home.gettxt2());
    }

@Test

    void uurrlltst(){
        home.uurrll1();
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://www.target.com/");
}
@Test
void nm1() throws InterruptedException {
        home.nm();
}
    @Test
    void catatst(){
        int num =home.cata1().size();
        Assert.assertEquals(num,18);
    }
    @Test
    void tsrch2(){
    home.tsrch1(driver);
    }
    @Test
    void tgsigntst()  {
        home.tgsign1(driver);
    }
    @Test
    void tgrtst(){
        Assert.assertTrue(home.tgr1());
    }
    @Test
    void tgr2tst(){
        String actualtxt =home.tgr2();
        Assert.assertEquals(actualtxt,"Registry");
    }






}
