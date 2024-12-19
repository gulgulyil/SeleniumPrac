package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) {

        /*
         *1 ChromeDriver'in yerini belirtiyoruz ve WebDriver'i baslatiyoruz.
         * Amazon web sitesine gidiyoruz.
         * Arama kutusunu buluyoruz ve icine "laptop" kelimesini yaziyoruz.
         * Aramaa butonunu buluyoruz ve tikliyoruz.
         * Bir urunun adini ve fiyatini aliyoruz.
         * Assertion 1: Arama kutusunun dogru bir sekilde bulundugunu kontrol ediyoruz.
         * Assertion 2: Arama butonunun dogru bir sekilde bulundugunu kontrol ediyoruz.
         * Assertion 3: Urun adinin bos olmadiginni kontrol ediyoruz.
         * Assertion 4: Urun fiyatinin bos olmadiginni kontrol ediyoruz.
         * urun adini ve fiyatini konsola yazdiriyoruz.
         * WebDriver'i kapatiyoruz.
         * */

        WebDriver driver = new ChromeDriver();

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

    }
}
