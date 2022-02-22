package session7;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;



public class Task7Test{

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
        boolean available = franchisePage.checkIfFillQuestionnaireLinkAvailable();
        assertTrue(available);
    }
}