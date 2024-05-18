package org.klim405;
// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShortsAuthorTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shortsAuthor() throws InterruptedException {
        driver.get("https://www.youtube.com/shorts");
        sleep(1000);
        vars.put("chanel_tag", driver.findElement(By.xpath("//*[@id=\"text\"]/a[@spellcheck='false']")).getText());
        sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"text\"]/a[@spellcheck='false']")).click();
        sleep(1500);
        assertThat(driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/div/div[2]/yt-page-header-renderer/yt-page-header-view-model/div/div[1]/div/yt-content-metadata-view-model/div[1]/span")).getText(), is(vars.get("chanel_tag").toString()));
        sleep(10000);
    }
}

