import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class autotst extends targetsetup{
    targethome home;
@BeforeMethod
    void autotst(){
    setupdriver("https://autozone.com");
     home=PageFactory.initElements(driver,targethome.class);
}

@AfterMethod
void off() throws InterruptedException {
    close();
}

@Test
    void gresstst() throws InterruptedException {
    home.gress1();

}
@Test
    void alttst(){
    home.atl1();
}
@Test
    void atltst2() throws InterruptedException {
    home.alt2();
}
@Test
void acrdtst(){
    String actualtxt= home.acrd(driver);
    Assert.assertEquals(actualtxt,"Honda Accord Parts");
}
@Test
    void acrdtst2() throws InterruptedException {
    home.acrd2(driver);
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    home.acrd3(driver);
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    home.acrd4();
}
@Test
    void menutst() throws InterruptedException {
    home.menu1();
}
@Test
void addcartst() throws InterruptedException {
    home.addcar1();
}
@Test
    void cartst() throws InterruptedException {
    home.carr();
}
@Test
    void getchemical(){
    ArrayList<String> chemicaltxt=home.links();
    System.out.println(chemicaltxt);
    Assert.assertTrue(chemicaltxt.contains("Chemicals"));
}
@Test
    void bbbtst(){
    home.bbb(driver);
}
@Test
    void gtftst(){
    String actualtxt=home.gtftxt();
    Assert.assertEquals(actualtxt,"GET IT FAST");
}
@Test
    void gtfvisi(){
    home.gttff();
}
@Test
    void prttest(){
    home.parts(driver);
}
@Test
    void towtst(){
    home.parts(driver);
}
@Test
    void frdrun(){
    home.parts(driver);
}
@Test
    void logtst(){
    home.log();
}
@Test
    void signtst(){
    home.signinn(driver);
}
@Test
    void accctst() throws InterruptedException {
    home.accc(driver);
    Thread.sleep(3000);
    driver.navigate().to("https://autozone.com");
    driver.getCurrentUrl();
    String gtu=driver.getCurrentUrl();
    System.out.println(gtu);
}
@Test
    void loctst(){
    home.loc();
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    home.chngloc.click();
    home.zip.click();

    home.zip.sendKeys("19082", Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    driver.navigate().to("https://autozone.com");

}
@Test
    void agn1tst(){
    Assert.assertTrue(home.agn1());
}






}
