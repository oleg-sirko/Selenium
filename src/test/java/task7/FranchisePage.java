package task7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.fail;

public class FranchisePage extends BasePage{

    @FindBy(xpath = "//a[text() = 'ЗАПОЛНИТЬ АНКЕТУ']")
    private WebElement fillQuestionarieLink;

    public FranchisePage (WebDriver driver) {
        super(driver);
    }

    public boolean checkIfFillQuestionnaireLinkAvailable (){

        return isElementVisible(fillQuestionarieLink);
    }

}
