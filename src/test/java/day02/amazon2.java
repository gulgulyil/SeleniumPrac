package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon2 {
    public static void main(String[] args) {

        // ChromeOptions nesnesi oluşturma
        ChromeOptions options = new ChromeOptions();

        // Proxy ayarını ekleme
        options.addArguments("--proxy-server=http://your_proxy:port");

        // WebDriver başlatma
        WebDriver driver = new ChromeDriver(options);

        // Amazon web sayfasını açma
        driver.get("https://www.amazon.com");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");

        // WebDriver kapatma
        driver.quit();

    }
}

