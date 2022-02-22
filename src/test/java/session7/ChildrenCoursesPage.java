package session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChildrenCoursesPage{
    public WebDriver driver;

    public ChildrenCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfAllCoursesLinkAvailable (){
        List<WebElement> elements = driver.findElements(By.xpath("//a[text() = 'Дивитись всі курси']"));
        return elements.size() > 0;
    }

}
