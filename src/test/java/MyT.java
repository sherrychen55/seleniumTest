import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MyT {
    @Test
    public void demo() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        //chrome web driver已经放在PATH路径中
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.209.1:4444/wd/hub/"), chromeOptions);
        driver.get("http://www.baidu.com");
        WebElement inputElement = driver.findElement(By.id("kw"));
        inputElement.sendKeys("'test");
        inputElement.submit();//回车
        driver.quit();
        //test2
    }
}
