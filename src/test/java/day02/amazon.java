package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) {

        /*
         1 ChromeDriver'in yerini belirtiyoruz ve WebDriver'i baslatiyoruz.
         2 Amazon web sitesine gidiyoruz.
         3 Arama kutusunu buluyoruz ve icine "laptop" kelimesini yaziyoruz.
         4 Aramaa butonunu buluyoruz ve tikliyoruz.
         5 Ilk laptobun adini ve fiyatini aliyoruz.
         6 Assertion 1: Arama kutusunun dogru bir sekilde bulundugunu kontrol ediyoruz.
         7 Assertion 2: Arama butonunun dogru bir sekilde bulundugunu kontrol ediyoruz.
         8 Assertion 3: Urun adinin bos olmadiginni kontrol ediyoruz.
         9 Assertion 4: Urun fiyatinin bos olmadiginni kontrol ediyoruz.
         10 urun adini ve fiyatini konsola yazdiriyoruz.
         11 WebDriver'i kapatiyoruz.
         * */

        WebDriver driver = new ChromeDriver();

        //Tarayiciyi tam ekran yapma
        driver.manage().window().maximize();
        //Amazon web sitesini acma
        driver.get("https://www.amazon.com");

        // Bekleme
        try {
            Thread.sleep(10000); // 5 saniye bekle
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Arama kutusunu buluyoruz ve icine laptop kelimesini yaziyoruz
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");

        //Arama butonunu buluyoruz ve tikliyoruz
        driver.findElement(By.id("nav-search-submit-button")).click();

        //Bir urunun adini ve fiyatini aliyoruz.
        /*WebElement ilkUrun=driver.findElement(By.xpath("//h2[@class=\"a-size-medium a-spacing-none a-color-base a-text-normal\" and @aria-label=\"Sponsored Ad - Amazon Fire Max 11 tablet (newest model) vivid 11” display, all-in-one for streaming, reading, and gaming, 14-hour battery life, optional stylus and keyboard, 64 GB, Gray\"]/span\n"));*/
        //WebElement ilkUrun = driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal' and contains(@aria-label, 'Amazon Fire Max 11 tablet')]"));
        //WebElement ilkUrun = driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
        WebElement ilkUrun= driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal' and contains(@aria-label, 'Acer Aspire 3 A315-24P-R7VH Slim Laptop')]"));


        //Ilk urun title
        String UrunTitle = ilkUrun.getText();
        System.out.println("Urun Title bu = " + UrunTitle);

        //fiyat
        WebElement fiyat= driver.findElement(By.className("a-price"));

        String ilkUrunFiyat = fiyat.getText();

        System.out.println("ilk Urunun Fiyati = " + ilkUrunFiyat);

    }
}
