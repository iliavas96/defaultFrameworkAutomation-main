package pages.registration;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;


public class RegistrationPage {
    private final By NAME = By.xpath("//input[@name='name']");
    private final By EMAIL = By.xpath("//input[@name='email']");
    private final By PASSWORD = By.xpath("//input[@name='password']");
    private final By BUTTON_REGISTRATION = By.xpath("//button[.='Зарегистрироваться']");


    /*Этот By должен быть на странице конструктора, но не стал ее создавать второй раз */
    private final By LINK_USER_CABINET = By.xpath("//a[@href='/profile']");

    public SelenideElement getUserCabinet() {
        return element(LINK_USER_CABINET);
    }

    public SelenideElement getName() {
        return element(NAME);
    }

    public void setName(String name) {
        getName().setValue(name);
    }

    public SelenideElement getEmail() {
        return element(EMAIL);
    }

    public void setEmail(String email) {
        getEmail().setValue(email);
    }

    public SelenideElement getPassword() {
        return element(PASSWORD);
    }

    public void setPassword(String password) {
        getPassword().setValue(password);
    }

    public SelenideElement getButton() {
        return element(BUTTON_REGISTRATION);
    }
}
