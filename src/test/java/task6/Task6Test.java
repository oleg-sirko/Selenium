package task6;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;



public class Task6Test{

    public WebDriver driver;
    ChildrenCoursesPage childrenCoursesPage;


    @Before
    public void setUp() {
        //update path according to your chromedriver location
        System.setProperty("webdriver.chrome.driver", "/Users/olegsirko/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://itea.ua/");

        childrenCoursesPage = new ChildrenCoursesPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void checkIfAllCoursesLinkAvailable() {
        /* Change next 3 rows to a single one:
         homePage.clickChildrenCoursesLink(); */
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Дитячі курси']")));
        driver.findElement(By.xpath("//a[text() = 'Дитячі курси']")).click();

        // no need to update rows below. Use them as example of moving locators and logic to Page Object
        boolean available = childrenCoursesPage.checkIfAllCoursesLinkAvailable();
        assertTrue(available);
    }

}