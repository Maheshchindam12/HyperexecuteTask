package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void simpleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com");
        assert driver.getTitle().contains("LambdaTest");
        driver.quit();
    }
}
