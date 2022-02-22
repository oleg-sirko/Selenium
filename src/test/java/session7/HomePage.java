package session7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver)  {
        this.driver = driver;
    }
    public void clickChildrenCoursesLink() {
        driver.findElement(By.xpath("//a[text() = 'Дитячі курси']")).click();

    }

}
