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

    public void setName(String name) { // сеттер вводит ИМЯ
        getName().setValue(name);
    }

    public SelenideElement getEmail() {
        return element(EMAIL);
    }

    public void setEmail(String email) { // сеттер вводит ЕМАИЛ
        getEmail().setValue(email);
    }

    public SelenideElement getPassword() {  //геттер, возврашает элемент с которым можно взаимоджействовать, наводит на ПАРОЛЬ
        return element(PASSWORD);
    }

    public void setPassword(String password) { // сеттер вводит ПАРОЛЬ
        getPassword().setValue(password);
    }

    public SelenideElement getButton() { // геттер, возврашает элемент с которым можно взаимоджействовать, наводит на кнопку РЕГИСТРАЦИИ
        return element(BUTTON_REGISTRATION);
    }
}
