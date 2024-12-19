package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args) {
        //Webdriver star
        WebDriver driver= new ChromeDriver();

        //Google ope
        driver.get("https://www.google.com/");
    }
}
