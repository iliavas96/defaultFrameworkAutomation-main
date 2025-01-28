package pages.authorization;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;


public class AuthorizationPage {

    private final By EMAIL = By.xpath("//input[@name='email']"); // создали конснансу с переменной EMAIL с данным икспасом
    private final By PASSWORD = By.xpath("//input[@name='password']"); // создали конснансу с переменной PASSWORD с данным икспасом
    private final By ENTER_BUTTON = By.xpath("//button[contains(text(), 'Войти')]"); // создали конснансу с переменной ENTER_BUTTON с данным икспасом
    private final By LINK_REGISTER = By.xpath("//a[contains(text(), 'Зарегистрироваться')]"); // создали конснансу с переменной LINK_REGISTER с данным икспасом
    private final By LINK_FORGOT_PASSWORD = By.xpath("//a[contains(text(), 'Восстановить пароль')]"); // оздали конснансу с переменной LINK_FORGOT_PASSWORD с данным икспасом

    public SelenideElement getEmail() { // гетемайл возвращает element EMAIL с которым можно взаиможействовать
        return element(EMAIL);
    }

    public void setEmail(String email) {
        getEmail().setValue(email); // через getEmail запрашиваем емайл, setValue(email)устанавливаем еайл
    }

    public SelenideElement getPassword() {// гетпасворд возвращает element PASSWORD с которым можно взаиможействовать
        return element(PASSWORD);
    }

    public void setPassword(String password) {
        getPassword().setValue(password); // через getPassword запрашиваем пароль, setValue(password) мы устанавливаем пароль
    }

    public SelenideElement getEnterButton() {//гетинтербат возвращает element ENTER_BUTTON с которым можно взаиможействовать
        return element(ENTER_BUTTON);
    }

    public SelenideElement getLinkRegister() { // гетлинкрегистр возвращает element LINK_REGISTER с которым можно взаиможействовать
        return element(LINK_REGISTER);
    }

    public SelenideElement getLinkForgotPassword() { //гетлинкфорготпасворд возвращает element LINK_FORGOT_PASSWORD с которым можно взаиможействовать
        return element(LINK_FORGOT_PASSWORD);
    }
}