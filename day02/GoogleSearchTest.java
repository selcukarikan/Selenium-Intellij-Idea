package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GoogleSearchTest {
    //1. Bir class oluşturun : GoogleSearchTest
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.




    //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //a.google web sayfasına gidin. https://www.google.com/
        driver.get("https:/www.google.com");
        //b. Search(ara) “city bike”

        //<input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both"
        // aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false"
        // title="Suche" value="" aria-label="Suche" data-ved="0ahUKEwjO6rX0-bXzAhUNJBoKHaVVDuwQ39UDCAY">

       Thread.sleep(3000);
        WebElement suchenBox=driver.findElement(By.name("q"));
        suchenBox.sendKeys("city bike"+ Keys.ENTER);

        //c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın

        //<div id="result-stats">Ungefähr 1.410.000.000 Ergebnisse<nobr> (0,79 Sekunden)&nbsp;</nobr></div>
        WebElement goruntulenme= driver.findElement(By.id("result-stats"));
        System.out.println("ungefähr ergebnisse : " +goruntulenme.getText());

        // d. “Shopping” e tıklayın.
       driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
       Thread.sleep(4000);

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        //<img src="https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcQl9KbScLncVfPkjOiXVi1ttdvZpKYnsOKpOscYz3Pf2gI_U7Ks8yzKXp-tLW-PTqhwjMle8jhSvmkBcCmTIZKwG_mHZw8BADemDwVZCETE&amp;usqp=CAE" alt="" role="presentation" data-iml="1633531283150" data-atf="1" data-frt="0">
WebElement ersteSeite= driver.findElement(By.partialLinkText("pted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcQl9KbScLncVfPkjOiXVi1ttdv"));
    }

}
