package fb.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAccountPage {
    private final WebDriver driver;

    private final By firstName = By.name("firstname");
    private final By lastName = By.name("lastname");
    private final By email = By.name("reg_email__");
    private final By password = By.name("reg_passwd__");
    private final By signUp = By.name("websubmit");

    public CreateNewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fill(String fn, String ln, String em, String pw) {
        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(email).sendKeys(em);
        driver.findElement(password).sendKeys(pw);
    }

    public void submit() {
        driver.findElement(signUp).click();
    }
}
