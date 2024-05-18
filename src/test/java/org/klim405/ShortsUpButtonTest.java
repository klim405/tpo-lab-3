package org.klim405;

// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class ShortsUpButtonTest {
    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shortsUpButton() throws InterruptedException {
        driver.get("https://www.youtube.com/shorts");
        sleep(1500);
        driver.manage().window().setSize(new Dimension(1221, 775));
        {
            List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"navigation-button-up\"]/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div"));
            assert (elements.isEmpty());
        }
        sleep(1500);
        driver.findElement(By.xpath("//div[@id=\"navigation-button-down\"]/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
        sleep(1500);
        {
            List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"navigation-button-up\"]/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
            assert (!elements.isEmpty());
        }
        sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"navigation-button-up\"]/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
        sleep(10000);
    }
}

