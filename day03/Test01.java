package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        // b. Locate email textbox
        Thread.sleep(2500);
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        // c. Locate password textbox ve
        Thread.sleep(2500);
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");
        // d. Locate signin button

        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        WebElement sign= driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input"));
        sign.click();

        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
    }
}
