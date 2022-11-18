import Pages.AuthPage;
import base.AndroidBaseTest;
import org.junit.Test;

public class AuthPageTest extends AndroidBaseTest {

    @Test
    public void checkAuthSuccess() throws Exception {
        AssertionError asserts = new AssertionError();
        AuthPage authPage = new AuthPage();
        authPage.sendKeysPhone();


    }



}
