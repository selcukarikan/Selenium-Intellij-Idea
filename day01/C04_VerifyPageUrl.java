package tests.day01;

import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // Youtube ana sayfasina gidelim https://www.arikanbilgisayar.com/");
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        //Sayfa URL'inin www.techproeducation.com oldugunu dogrulayin
        String expectedUrl="www.tecproeducation.com";
        String actualUrl= driver.getCurrentUrl();
        if ((expectedUrl.equals(actualUrl))){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
            System.out.println(("Gecerli URL :"+actualUrl));
        }
        driver.close();
    }
}
