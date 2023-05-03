package N11.pages;

import N11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11 {
    public N11() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "myLocation-close-info")
    public WebElement tamam;
    @FindBy(xpath = "(//button[@class='dn-slide-deny-btn'])[1]")
    public WebElement dahaSonra;
    @FindBy(xpath = "//a[@href='https://www.n11.com/elektronik']")
    public WebElement elektronik;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailGiris;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifreGiris;
    @FindBy(xpath = "//div[@id='myLocation-close-info']")
    public WebElement uyariKapat;
    @FindBy(xpath = "//div[@class='banner__reject-button']")
    public WebElement cerezReddet;
    @FindBy(xpath = "//efilli-layout-n11[@class='efilli-layout-n11']")
    public WebElement shadowRoot;
    @FindBy(xpath = "//input[@id='searchData']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//h3[@class='productName']")
    public WebElement findikKremasi;
    @FindBy(xpath = "(//strong[text()=.])[2]")
    public WebElement urunSonucSayisi;
    @FindBy(xpath = "(//strong[text()=.])[2]")
    public WebElement urunSonucSayisiText;






}
