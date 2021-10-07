package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin

        Thread.sleep(2000);
       // WebElement addButonu= driver.findElement(By.tagName("button")); 1.method
       // WebElement addButonu= driver.findElement(By.xpath("//button")); 2.method
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']")); 3.method
        WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']")); //4.method
        addButonu.click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
if (deleteButonu.isDisplayed()){
    System.out.println("Delete butonu TEST PASSED");
}else{
    System.out.println("Delete butonu TEST FAILED");
}

        //4- Delete tusuna basin
        deleteButonu.click();
        //5- Delete butonunun gorunur olmadigini test edin
        // eger butone bastigimizda HTML kodundaki satir da siliniyorsa
        // driver'in o elemente ulasmasi mumkun olmayacagindan
        // varligini yada yoklugunu test etmemiz mumkun olmaz
        // varolan bir element bu sekilde silindikten sonra locate etmeye calisirsak
        // StaleElementReferenceException exception'i aliriz

        /*
        if (!deleteButonu.isDisplayed()){
            System.out.println("delete butonu gorunmuyor testi PASS");
        } else {
            System.out.println("delete butonu gorunmuyor testi FAILED");
        }
        */
        driver.close();
    }
}