package task7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.fail;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Дитячі курси']")
    private WebElement childrenCoursesLink;

    @FindBy(xpath = "//a[text() = 'Франшиза']")
    private WebElement franchiseLink;

    public HomePage(WebDriver driver)  {
        super(driver);
    }

    public void clickChildrenCoursesLink () {

        clickOnElement(childrenCoursesLink);
    }


    public void clickFranchiseLink () {

        clickOnElement(franchiseLink);
    }

}
