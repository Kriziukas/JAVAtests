package lt.techin.orangehrm.kristina.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        WebElement inputUsername = driver.findElement(By.cssSelector("input[name='username']"));
        inputUsername.sendKeys("Admin");
        WebElement inputPassword = driver.findElement(By.cssSelector("input[name='password']"));
        inputPassword.sendKeys("admin123");
        WebElement clickLoginButton = driver.findElement(By.cssSelector(".orangehrm-login-button"));
        clickLoginButton.click();
        assertEquals();
    }

    private void assertEquals() {
        String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String currentUrl = driver.getCurrentUrl();
    }

}

