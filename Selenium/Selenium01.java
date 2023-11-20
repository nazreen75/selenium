package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium01 {
    public static void main(String[] args) throws InterruptedException{
//if we are useing selenuim<4.6
        //need to set the property for driver
        //System.setProperty("webdriver.chrome.driver","path");
        // selenium 4.10 manager takes care of all the

        ChromeOptions options=new ChromeOptions();

        //options.addArguments("--start maximized");
        options.addArguments("--incognito");
        options.addArguments("--window-size=400,400");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://sdet.live");
        Thread.sleep(4000);

        System.out.println(driver.getTitle());
        driver.quit();
    }
}
