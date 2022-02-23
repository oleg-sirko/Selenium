package task7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.fail;

public class ChildrenCoursesPage extends BasePage{

    @FindBy(xpath = "//a[text() = 'Дивитись всі курси']")
    private WebElement allCoursesLink;

    public ChildrenCoursesPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfAllCoursesLinkAvailable (){

        return isElementVisible(allCoursesLink);
    }

}
