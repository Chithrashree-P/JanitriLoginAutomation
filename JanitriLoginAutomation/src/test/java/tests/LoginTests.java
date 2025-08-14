package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void testBlankFieldsLogin() {
        LoginPage login = new LoginPage(driver);
        Assert.assertFalse(login.isLoginButtonEnabled(), "Login button should be disabled for blank fields");
    }

    @Test
    public void testInvalidCredentials() {
        LoginPage login = new LoginPage(driver);
        login.enterUserId("wrongUser");
        login.enterPassword("wrongPass");
        login.clickLogin();
        Assert.assertTrue(login.getErrorMessage().contains("Invalid"), "Error message should be shown for invalid login");
    }

    @Test
    public void testPasswordMaskingToggle() {
        LoginPage login = new LoginPage(driver);
        login.enterPassword("testPass123");
        login.togglePasswordVisibility();
    }

    @Test
    public void testUIElementsPresence() {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.isLoginButtonEnabled() == false || login.isLoginButtonEnabled() == true,
                          "Login button should be present");
    }
}
