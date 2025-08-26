package fb;

import fb.page.CreateNewAccountPage;
import fb.page.HomePage;
import org.testng.annotations.Test;

public class CreateNewAccountPageTest extends BaseTest {

    @Test
    public void canOpenCreateAccountModal() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.open();
        home.clickCreateAccount();
        // naive wait just for demo; in real code use WebDriverWait
        Thread.sleep(2000);
        CreateNewAccountPage page = new CreateNewAccountPage(driver);
        page.fill("John","Doe","john.doe@example.com","Password123!");
        // page.submit(); // avoid actually creating an account
    }
}
