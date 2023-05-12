package N11.tests.day02;

import N11.pages.N11_Kitap;
import N11.pages.N11_Login;
import N11.utilities.ConfigReader;
import N11.utilities.Driver;
import N11.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static N11.utilities.ReusableMethods.extentTest;

public class C03 {
    @Test
    public void testName() {

        // "https://www.n11.com/" adresine git
        ReusableMethods.extentReport();

        ReusableMethods.extentRaporBitir();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        N11_Kitap n11Kitap = new N11_Kitap();
        N11_Login n11Login = new N11_Login();

        Driver.getDriver().get(ConfigReader.getProperty("N11Url"));
        ReusableMethods.extentTestInfo("\"https://www.n11.com/\" adresine gidildi");
        ReusableMethods.uyarilariKapat();
        ReusableMethods.extentTestInfo("Uyarilar kapatildi");
        //giris yap
        ReusableMethods.girisYap();
        ReusableMethods.arrowDown();
        ReusableMethods.arrowDown();
        ReusableMethods.webElementScreenShoot(n11Kitap.guvenlikKoduGirMesaji);
        n11Login.dahaSonra.click();


        ReusableMethods.extentTestInfo("giris yapildi");

        //kitap menusu ustune git
        ReusableMethods.moveToElement(n11Kitap.kitap);
        ReusableMethods.bekle(2);
        ReusableMethods.extentTestInfo("kitap menusu ustune gidildi");

        //Yetişkin/Hobi/oyun menusunu tiklayin
        n11Kitap.oyun.click();
        ReusableMethods.extentTestInfo("Yetişkin/Hobi/oyun menusu tiklandi");

        //akilli siralama dropdown tikla
        n11Kitap.akilliSiralama.click();
        ReusableMethods.bekle(2);
        ReusableMethods.extentTestInfo("akilli siralama dropdown tiklandi");

        //satis miktarini sec
        n11Kitap.yorumSayisi.click();
        ReusableMethods.extentTestInfo("satis miktari secildi");

        //ilk urunu tikla
        int sayac = 1;
        List<WebElement> urunler = Driver.getDriver().findElements(By.xpath("//div[@class='imgHolder  cargoCampaign ']"));

        for (int i = 1; i < 6; i++) {
            urunler.get(i).click();
        }
        ReusableMethods.extentTestInfo("ilk urunu tiklandi");
        ReusableMethods.extentTestInfo("sayfa kapatildi");
        ReusableMethods.extentRaporBitir();
        Driver.closeDriver();


    }
}
