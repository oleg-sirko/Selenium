package task7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;


public class Task7Test {

    public WebDriver driver;
    ChildrenCoursesPage childrenCoursesPage;
    HomePage homePage;
    FranchisePage franchisePage;


    @Before
    public void setUp() {
        //update path according to your chromedriver location
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://itea.ua/");

        childrenCoursesPage = new ChildrenCoursesPage(driver);
        homePage = new HomePage(driver);
        franchisePage = new FranchisePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void checkIfAllCoursesLinkAvailable() {
        homePage.clickChildrenCoursesLink();

        boolean available = childrenCoursesPage.checkIfAllCoursesLinkAvailable();
        assertTrue(available);
    }

    @Test
    public void checkIfFillQuestionnaireLinkAvailable (){
        homePage.clickFranchiseLink();

        boolean available = franchisePage.checkIfFillQuestionnaireLinkAvailable();
        assertTrue(available);
    }

    @Test
    public void verifyTextTitleOnContacts () {
        //add locator for Контакти link to Home page and click via clickOnElement()
        driver.findElement(By.xpath("//a[text()='Контакти']")).click();

        //create ContactsPage, define locator for h1Title and method getH1Title() in ContactsPage
        //assert should remain in test
        String h1Title = driver.findElement(By.xpath("//h1")).getText();
        assertEquals("Контакти", h1Title.trim());
    }
}