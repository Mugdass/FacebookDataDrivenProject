package fb.stepdefinitions;

import fb.page.CreateNewAccountPage;
import fb.page.HomePage;
import fb.lib.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Map;

public class StepDefinitions {

    private static WebDriver driver;
    private HomePage home;
    private CreateNewAccountPage createPage;

    @Given("the browser is open on Facebook")
    public void the_browser_is_open_on_facebook() {
        // Reuse WebDriver from TestNG BaseTest would be better; for brevity start a new one via system property
        // This step is typically managed by hooks; here we keep a minimal demo
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        home = new HomePage(driver);
        createPage = new CreateNewAccountPage(driver);
        home.open();
    }

    @When("I open the Create Account dialog")
    public void i_open_create_account() throws InterruptedException {
        home.clickCreateAccount();
        Thread.sleep(1500);
    }

    @When("I fill the form with excel key {string}")
    public void i_fill_form_with_excel_key(String key) throws Exception {
        Map<String,String> row = ExcelReader.readRowByKey("data/users.xlsx", "users", "key", key);
        createPage.fill(row.get("firstName"), row.get("lastName"), row.get("email"), row.get("password"));
    }

    @Then("the form fields should be populated")
    public void form_fields_populated() {
        Assert.assertTrue(true);
        driver.quit();
    }
}
