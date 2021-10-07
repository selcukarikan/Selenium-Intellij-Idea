package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/selcuk/Desktop/selenium dependencies/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/in/selcuk-arikan-28ab07216/");
String expectedUrl="www.linkedin.com";
String actualUrl=driver.getCurrentUrl();
if (expectedUrl.equals(actualUrl)){
    System.out.println("TEST PASSED");
}else{
    System.out.println("TEST FAILLED");
    System.out.println("gecerli url : "+actualUrl);
}
driver.close();
    }

}
