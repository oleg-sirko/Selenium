package session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FranchisePage {
    public WebDriver driver;

    public FranchisePage (WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfFillQuestionnaireLinkAvailable (){
        driver.findElement(By.xpath("//a[text() = 'Франшиза']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//a[text() = 'ЗАПОЛНИТЬ АНКЕТУ']"));
        return elements.size() > 0;
    }

}
