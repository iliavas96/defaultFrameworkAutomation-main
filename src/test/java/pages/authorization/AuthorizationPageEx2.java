package pages.authorization;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;
public class AuthorizationPageEx2 {

    private final By EMAIL = By.xpath("//input[@name='email']");
    private final By PASSWORD = By.xpath("//ibput[@name='password']");
    private final By BUTTON = By.xpath("//button[contains(text(), 'Войти')]");
    private final By LINK_REGISTRATION = By.xpath("//a[contains(text(), 'Зарегестрироваться')]");
    private final By LINK_FORGOT_PASSWORD = By.xpath("//a[contains(text(), 'Восстановить пароль')]");

    public SelenideElement getEmail() {
        return element(EMAIL);
    }
    public void setEMAIL (String email) {
        getEmail().setValue(email);
    }

    public SelenideElement getPassword () {
        return element(PASSWORD);
    }
    public void setPASSWORD (String password) {
        getPassword().setValue(password);
    }

    public SelenideElement getButton () {
        return element(BUTTON);
    }
    public SelenideElement getLinkRegister () {
        return element(LINK_REGISTRATION);
    }
    public SelenideElement getLinkForgotPassword () {
        return element(LINK_FORGOT_PASSWORD);
    }
}
