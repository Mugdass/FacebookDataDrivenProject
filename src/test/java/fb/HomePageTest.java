package fb;

import fb.page.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void canOpenFacebookAndSeeLogin() {
        HomePage home = new HomePage(driver);
        home.open();
        // Just opening the page as a smoke check; real assertions would check elements
    }
}
