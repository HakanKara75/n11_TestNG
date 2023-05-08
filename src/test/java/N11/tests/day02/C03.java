package N11.tests.day02;

import N11.pages.N11_Kitap;
import N11.pages.N11_Login;
import N11.utilities.ConfigReader;
import N11.utilities.Driver;
import N11.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class C03 {
    @Test
    public void testName() {
        // "https://www.n11.com/" adresine git
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        N11_Kitap n11Kitap = new N11_Kitap();
        N11_Login n11Login = new N11_Login();

        Driver.getDriver().get(ConfigReader.getProperty("N11Url"));
        ReusableMethods.uyarilariKapat();

        //giris yap
        ReusableMethods.girisYap();
        ReusableMethods.bekle(2);
        n11Login.dahaSonra.click();

        //kitap menusu ustune git
        ReusableMethods.moveToElement(n11Kitap.kitap);
        ReusableMethods.bekle(2);

        //Yetişkin/Hobi/oyun menusunu tiklayin
        n11Kitap.oyun.click();

        //artan fiyat tikla
        n11Kitap.akilliSiralama.click();
        ReusableMethods.bekle(2);

        //satis miktarini sec
        n11Kitap.yorumSayisi.click();

        //ilk urunu tikla
        int sayac=1;
        List<WebElement> urunler= Driver.getDriver().findElements(By.xpath("//div[@class='imgHolder  cargoCampaign ']"));

        for (int i = 1; i < 6; i++) {
            urunler.get(i).click();
        }
        //yorum sayisini al

        //acilan sayfayi kapat

        //ikinci urunu tikla

        //yorum sayisini al

        //ucuncu urunu tikla

        //yorum sayisini al

        //dorduncu urunu tikla

        //yorum sayisini al

        //besinci urunu tikla

        //yorum sayisini al




        Driver.closeDriver();


    }
}