package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
// <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
// placeholder="E-Mail-Adresse oder Telefonnummer" autofocus="1" aria-label="E-Mail-Adresse oder Telefonnummer">

        driver.get("https://de-de.facebook.com/");

        //email textbox selcuk a yazdir
     WebElement mailTextBoxId=driver.findElement(By.id("email"));

    mailTextBoxId.sendKeys("selcukarikan1301@gmail.com");
        Thread.sleep(2000);
        mailTextBoxId.clear();
    WebElement mailTextBoxTagName=driver.findElement(By.tagName("input"));
// mailTextBoxTagName.sendKeys("belmaarikan@gmail.com");
      //  WebElement uncorrectElement= driver.findElement(By.id("emailyanlis"));
       // uncorrectElement.sendKeys("yanliseleman");
    WebElement girisButonu=driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
    girisButonu.click();


    }

}
