package tests.day01;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https:/www.facebook.com");
        String expectedUrl="www.facebook.com";
        String actualUrl=driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILLED");
            System.out.println("actual url: "+actualUrl);
            Thread.sleep(3000);

        }driver.navigate().to("https:/www.amazon.com");
        String exceptedUrl="https://www.amazon.com";
        if (exceptedUrl.equals(actualUrl)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILLED");
            System.out.println("actual url :"+actualUrl);
            Thread.sleep(2999);
        }
driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();
    }
}
