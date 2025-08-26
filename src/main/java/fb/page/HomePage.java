package fb.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;
    private final By emailInput = By.id("email");
    private final By passwordInput = By.id("pass");
    private final By loginButton = By.name("login");
    private final By createAccountButton = By.xpath("//a[contains(@data-testid,'open-registration-form-button') or contains(text(),'Create new account')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.facebook.com/");
    }

    public void login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void clickCreateAccount() {
        WebElement btn = driver.findElement(createAccountButton);
        btn.click();
    }
}
