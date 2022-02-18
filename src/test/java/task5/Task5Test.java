package task5;


import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class Task5Test {
    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/olegsirko/Downloads/chromedriver");
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void task5() {

        driver.get("https://itea.ua/");
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Дитячі курси']")));
        driver.findElement(By.xpath("//a[text() = 'Дитячі курси']")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//a[text() = 'Дивитись всі курси']"));
        assertEquals(elements.size(), 1);
    }


}