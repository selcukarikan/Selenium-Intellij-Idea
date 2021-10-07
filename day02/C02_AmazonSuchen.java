package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.w3c.dom.ls.LSOutput;

public class C02_AmazonSuchen {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

      //  <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Suche">

            driver.get("https://www.amazon.com");
        WebElement suchenbox=driver.findElement(By.id("twotabsearchtextbox"));
        suchenbox.sendKeys("java"+ Keys.ENTER);
        WebElement sonucYazisi=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());



    }
}
