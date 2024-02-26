package pages.authorization;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;


public class AuthorizationPage {  //класс страницы авторизации

  private final By EMAIL = By.xpath("//input[@name='email']"); //находит элемент по xpath, класс input, атрибут name == email
  private final By PASSWORD = By.xpath("//input[@name='password']"); //ищет элемент на странице, у которого имя == password
  private final By ENTER_BUTTON = By.xpath("//button[contains(text(), 'Войти')]"); //ищет кнопку, на которой текст == войти
  private final By LINK_REGISTER = By.xpath("//a[contains(text(), 'Зарегистрироваться')]"); // ищет линк зарегестрироваться
  private final By LINK_FORGOT_PASSWORD = By.xpath("//a[contains(text(), 'Восстановить пароль')]"); // ищет линк восстановить пароль

  public SelenideElement getEmail() { // наводит на емайл?
    return element(EMAIL); // геттер. возвращает element, с которым можно взаиможействовать на странице
  }

  public void setEmail(String email) {
    getEmail().setValue(email);
  } // сеттер. Записывает в поле емаил, параметр String email

  public SelenideElement getPassword() {//
    return element(PASSWORD);
  } // геттер. возвращает element, с которым можно взаимодействовать

  public void setPassword(String password) {
    getPassword().setValue(password);
  } // записывает значение password в поле емаил

  public SelenideElement getEnterButton() {// геттер. возвращает element, с которым можно взаиможействовать на странице (кнопка)
    return element(ENTER_BUTTON);
  }

  public SelenideElement getLinkRegister() {
    return element(LINK_REGISTER);
  } // геттер. возвращает element, с которым можно взаиможействовать на странице (линк регистрации)

  public SelenideElement getLinkForgotPassword() {
    return element(LINK_FORGOT_PASSWORD);
  } //геттер. возвращает element, с которым можно взаиможействовать на странице (линк восстановления пароля)

}