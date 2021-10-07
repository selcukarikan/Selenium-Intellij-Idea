package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;
//
//Erste Test

public class C01_ErsteTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.arikanbilgisayar.com/");
        System.out.println("su andaki url: "+driver.getCurrentUrl());
        System.out.println("su andaki baslik :"+driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000
        );
        Thread.sleep(2000);
        driver.navigate().to("http://www.youtube.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        driver.close();
       // driver.quit(); Acik olan tum browserlari kapatir , close ise sadece  1 browser kapatir

    }
}
