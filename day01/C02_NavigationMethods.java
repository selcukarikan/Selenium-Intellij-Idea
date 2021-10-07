package tests.day01;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethods {
    ////1. Yeni bir Class olusturalim.(NavigationMethods)
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        // //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com");
// //3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
// //4. Tekrar YouTube'sayfasina donelim
        driver.navigate().back();
// //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
// //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().forward();
// //7. Sayfayi tam ekran yapalim
        driver.manage().window().maximize();
// //8. Sayfayi kapatalim / Tum sayfalari kapatalim
       driver.close();
    }
}
