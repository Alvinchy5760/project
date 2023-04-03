import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class targethome extends targetsetup {
    @FindBy(css = "[type=\"search\"]")
    WebElement srch;
    @FindBy(xpath = "//*[@class=\"styles__FilmstripWrapper-sc-9ebcfz-0 hzmilQ\"]/div/div/div[1]/div/h2")
    WebElement gettxt;
    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[3]/a[2]/div/span")
    WebElement clinic;
    @FindBy(css = "[class=\"gh-sb \"]")
    WebElement ebaydrop;

    @FindBy(xpath = "//*[@class=\"styles__StorycardText-sc-1jzjzj1-1 dpUKLM storycard--text\"]/div/span")
    WebElement uurrll;
    @FindBy(xpath = "//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]")
    WebElement ebaylogo;
    @FindBy(xpath = "//*[@id=\"destinations_list2\"]/ul/li[4]/a/div[2]")
    WebElement trgthlp;
    @FindBy(css = "[class=\"styles__ItemTitle-sc-15suhkx-2 CEden\"]")
    List<WebElement> cata;
    @FindBy(xpath = "//*[@id=\"webel-home-page-display\"]/div/div[4]/div/div/div/div[2]/ul/li[1]/a/div/div[2]/div/div[1]/div")
    WebElement gress;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[5]/div/div[2]/div/div[2]/div/div[2]/div/div[3]/div[2]/button/span")
    WebElement addcart;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[5]/div/div[4]/div/div[2]/div[2]/div/div[3]/div[2]/button")
    WebElement viewcart;
    @FindBy(xpath = "//*[@id=\"webel-home-page-display\"]/div/div[12]/div/div/div/div/div/ul/li[7]/div")
    WebElement alt;
    @FindBy(xpath = "//*[@id=\"webel-home-page-display\"]/div/section/div/div/div[3]/div/ul/li[1]/a/span")
    WebElement accordprts;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div[1]/div[3]/div[3]/ul/li[12]/a/div/span")
    WebElement hondafuel;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[3]/div[2]/ul/li[5]/a/div/div[2]/div/div[1]/div")
    WebElement fuelcap;
    @FindBy(xpath = "//*[@id=\"hamburgerMenuBtn\"]/div[1]/span/img")
    WebElement menu;
    @FindBy(xpath = "//*[@id=\"at_drawer_top_header\"]/div/section/div[1]/div[1]/ul/li[2]/a/div/div/div")
    WebElement menuengnoil;
    @FindBy(xpath = "//*[@id=\"nav_wrapper\"]/div[2]/div/button/div/div[2]")
    WebElement addcar;
    @FindBy(xpath = "//*[@id=\"yearheader\"]")
    WebElement caryr;
    @FindBy(xpath = "//*[@id=\"makeheader\"]")
    WebElement make;
    @FindBy(xpath = "//*[@id=\"modelheader\"]")
    WebElement model;
    @FindBy(xpath = "//*[@id=\"gh-cat\"]")
    WebElement d;
    @FindBy(xpath = "//*[@class=\"hl-cat-nav__container\"]/li[4]/a")
    WebElement electronic;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")
    WebElement compu;
    @FindBy(xpath = "//*[@id=\"destinations_list2\"]/ul/li[4]/a/div[2]")
    WebElement cookware;
    @FindBy(css = "[class=\"az_hCb\"]")
    List<WebElement> autolinks;
    @FindBy(css = "[class=\"az_dx\"]")
   List< WebElement> vvv;
    @FindBy(css = "#yDmH0d > c-wiz > div > div > c-wiz > div > div > div > div.DRc6kd.bdn4dc > div.QlyBfb > button")
    WebElement frmm;
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    WebElement gglsrch;
    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement tsrch;
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement headphone;
@FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[8]")
WebElement toys;
@FindBy(xpath = "//*[@id=\"superHeroContainer\"]/div[2]/div[2]/a/div/div[2]/div/div[1]/h3")
WebElement gtf;
@FindBy(xpath = "//*[@id=\"webel-home-page-display\"]/div/section/div/div/div[2]/div/ul/li[1]/a/span")
WebElement fordparts;
@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[3]/div[3]/ul/li[19]/a/div/span")
WebElement trucktow;
@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div/div/div[3]/div[8]/ul/li[6]/a/div/div[2]/div/div[1]/div")
WebElement fordrun;
@FindBy(xpath = "//*[@id=\"azLogoLinkScroll\"]/div/span/img")
WebElement autologo;
@FindBy(xpath = "//*[@id=\"topHeaderWrapper\"]/div/div/div[4]/div[2]/div[1]/div/div")
WebElement signin;
@FindBy(xpath = "//*[@id=\"dropdown-menu-items\"]/a[1]")
WebElement signin1;
@FindBy(xpath = "//*[@id=\"username\"]")
WebElement acc;
@FindBy(xpath = "//*[@id=\"password\"]")
WebElement accpass;
@FindBy(xpath = "//*[@id=\"headerPrimary\"]/a[4]/span")
WebElement tgsign;
@FindBy(xpath = "//*[@id=\"listaccountNav-signIn\"]/a/span")
WebElement tgsignin;
@FindBy(xpath = "//*[@id=\"username\"]")
WebElement tgeml;
@FindBy(xpath = "//*[@id=\"password\"]")
WebElement tgpass;
@FindBy(xpath = "//*[@id=\"nav_wrapper\"]/div[4]/div[2]/div/div/div")
WebElement location;
@FindBy(xpath = "//*[@id=\"changeStoreBtn\"]")
WebElement chngloc;
@FindBy(xpath = "//*[@id=\"SearchInput\"]")
WebElement zip;
@FindBy(xpath = "//*[@id=\"webel-home-page-display\"]/div/div[2]/div/div/a/picture/img")
WebElement agn;
@FindBy(xpath = "//*[@id=\"utilityNav-registries\"]")
WebElement tgr;
void srch1() {
        srch.click();
        srch.sendKeys("baby shoes");
    }

    String gettxt1() {
        return gettxt.getText();
    }

    boolean gettxt2() {
        return gettxt.isDisplayed();
    }


    void drop1() {
        dropdown(ebaydrop, 1);
    }

    void uurrll1() {
        uurrll.click();
    }

    void nm() throws InterruptedException {
        srch.click();
        srch.sendKeys("womens dresses");
        srch.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    boolean logo(WebDriver drvr) {
        movemouse(drvr, ebaylogo);
        boolean s = ebaylogo.isDisplayed();
        return s;

    }

    String ghm(WebDriver dty) {
        movemouse(dty, ebaylogo);
        return ebaylogo.getText();

    }

    void clickk(WebDriver dr) {
        doubleclick(dr, trgthlp);
    }

    ArrayList<String> cata1() {
        ArrayList<String> catatext = new ArrayList<>();
        for (WebElement a : cata) {
            catatext.add(a.getText());
        }
        return catatext;
    }

    void gress1() throws InterruptedException {

        gress.click();
        Thread.sleep(3000);
        addcart.click();
        Thread.sleep(3000);
        viewcart.click();
    }

    boolean atl1() {
        return alt.isDisplayed();
    }

    void alt2() throws InterruptedException {
        alt.click();
    }

    String acrd(WebDriver drf) {
        movemouse(drf, accordprts);
        return accordprts.getText();

    }

    void acrd2(WebDriver drf2) throws InterruptedException {
        movemouse(drf2, accordprts);
        Thread.sleep(3000);
        accordprts.click();
    }

    void acrd3(WebDriver drf3) throws InterruptedException {
        movemouse(drf3, hondafuel);
        Thread.sleep(3000);
        hondafuel.click();
    }

    void acrd4() {
        fuelcap.click();
    }

    void menu1() throws InterruptedException {
        menu.click();
        Thread.sleep(3000);
        menuengnoil.click();
    }

    void addcar1() throws InterruptedException {
        addcar.click();
        Thread.sleep(3000);
        caryr.click();
        Thread.sleep(3000);
        caryr.sendKeys("2009");
        caryr.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        make.sendKeys("honda");
        make.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        model.sendKeys("odyssey");
        model.sendKeys(Keys.ENTER);

    }

    void carr() throws InterruptedException {
        addcar.click();
        Thread.sleep(3000);
        caryr.click();
        Thread.sleep(3000);
        caryr.sendKeys("2009");
        Thread.sleep(3000);
        caryr.clear();
        Thread.sleep(3000);
        caryr.sendKeys("2024");
    }

    void d1() throws InterruptedException {
        dropdown(d, 1);
        Thread.sleep(3000);
        for (int j = 1; j <= 8; j++)
            Thread.sleep(1500);
    }

    void elec(WebDriver fr) throws InterruptedException {
        movemouse(fr, electronic);
        Thread.sleep(2000);
        movemouse(fr, compu);
        compu.click();
    }

    void dishcollect(WebDriver f) throws InterruptedException {
        movemouse(f, cookware);
        cookware.click();
        Thread.sleep(3000);

    }

    ArrayList<String> links() {
        ArrayList<String> linktxt = new ArrayList<>();
        for (WebElement b : autolinks) {
            linktxt.add(b.getText());

        }

        return linktxt;
    }


    void bbb(WebDriver dt){
        for (WebElement T:vvv){
            T.click();
            sabar1(dt,5,T);
            driver.navigate().to("https://autozone.com");
        }

    }
    void tsrch1(WebDriver dr){
        tsrch.click();
        sabar(dr,3,tsrch);
        tsrch.sendKeys("baby girl clothes",Keys.ENTER);
        sabar(dr,3,tsrch);
        tsrch.click();
        sabar(dr,3,tsrch);
        tsrch.clear();
        sabar(dr,3,tsrch);
        tsrch.sendKeys("baby boy clothes",Keys.ENTER);

    }
    void drpchk() throws InterruptedException {
        dropdown(ebaydrop, 5);
        for (int u = 1; u <=37; u++) {
            Thread.sleep(1500);
            dropdown(ebaydrop, u);

        }}
    void drpchk2()   {

        dropdown2(ebaydrop,"Books");
    }
void heaphn(WebDriver fr)  {
        headphone.click();

        headphone.sendKeys("headphone bluthoot",Keys.ENTER);
}
String tytxt(){
        return toys.getText();
}
String gtftxt(){
        return gtf.getText();
}
boolean gttff(){
        return gtf.isDisplayed();
}
void parts(WebDriver gr){
        movemouse(gr,fordparts);
        sabar(gr,3,fordparts);
        fordparts.click();
        sabar(gr,3,trucktow);
        trucktow.click();
        sabar(gr,3,fordrun);
        fordrun.click();
}
boolean log(){
        return autologo.isDisplayed();
}
void signinn(WebDriver ft){
        signin.click();
        sabar(ft,3,signin1);
        signin1.click();
}
void accc(WebDriver ftt){
        signin.click();
        sabar(ftt,3,signin1);
        signin1.click();
        sabar(ftt,3,acc);
        acc.click();
        acc.sendKeys("Bangladesh",Keys.TAB);
        accpass.sendKeys("12345678",Keys.ENTER);

}
void tgsign1(WebDriver df)  {
        tgsign.click();
        sabar(df,3,tgsignin);
        tgsignin.click();
        sabar(df,3,tgeml);
        tgeml.click();
        tgeml.sendKeys("abcde@gmail.com",Keys.TAB);
        tgpass.sendKeys("12345678",Keys.ENTER);
}
void loc(){
        location.click();
}
boolean agn1(){
    return agn.isDisplayed();
}
boolean tgr1(){
    return tgr.isDisplayed();
}
String tgr2(){
    return tgr.getText();
}




    }





























