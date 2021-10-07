package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // todo 1. Bir class oluşturun: LocatorsIntro
        // todo 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // todo a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // todo b. Sign in butonuna basin
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();
        // todo c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        Thread.sleep(2990);
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButon = driver.findElement(By.name("commit"));
        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButon.click();
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement dogruKullanici = driver.findElement(By.className("navbar-text"));
        String username = "testtechproed@gmail.com";
        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.

        if (dogruKullanici.getText().equals(username)) {
            System.out.println("Dogru kullanici TEST PASSED");
        } else {
            System.out.println("Dogru kullanici TEST FAILED");

        }
        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressesLink= driver.findElement(By.linkText("Addresses"));
        WebElement signOutLink=driver.findElement(By.linkText("Sign out"));

        if (adressesLink.isDisplayed()) {
            System.out.println("adresses linki gorunuyor, TEST PASSED");
        } else {
            System.out.println("adresses linki gorunmuyor, TEST FAILED");
        }
        if (signOutLink.isDisplayed()) {
            System.out.println("signout linki gorunuyor, TEST PASSED");
        } else {
            System.out.println("singout linki gorunmuyor, TEST FAILED");
            //3. Sayfada kac tane link oldugunu bulun.
        }
    }
}