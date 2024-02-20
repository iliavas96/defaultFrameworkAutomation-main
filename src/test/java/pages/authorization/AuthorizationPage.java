package pages.authorization;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;


public class AuthorizationPage {  //класс страницы авторизации

  private final By EMAIL = By.xpath("//input[@name='email']"); //Объект класса By.  ищет элемент на странице, у которого имя == email, скорее всего input означает - что это поле ввода
  private final By PASSWORD = By.xpath("//input[@name='password']"); //ищет элемент на странице, у которого имя == password
  private final By ENTER_BUTTON = By.xpath("//button[contains(text(), 'Войти')]"); //ищет кнопку, на которой текст == войти
  private final By LINK_REGISTER = By.xpath("//a[contains(text(), 'Зарегистрироваться')]"); // ищет линк зарегестрироваться
  private final By LINK_FORGOT_PASSWORD = By.xpath("//a[contains(text(), 'Восстановить пароль')]"); // ищет линк восстановить пароль

  public SelenideElement getEmail() { // наводит на емайл?
    return element(EMAIL); // не понимаю что значит element
  }

  public void setEmail(String email) { // метод вызывает поле емэйл (иммитируя клик по полю), после туда вставляется значение (агумент email)
    getEmail().setValue(email);
  }

  public SelenideElement getPassword() {// наводит на пароль?
    return element(PASSWORD);
  }

  public void setPassword(String password) {// то же самое что и емейл, только с паролем
    getPassword().setValue(password);
  }

  public SelenideElement getEnterButton() {// наводит на кнопку Войти
    return element(ENTER_BUTTON);
  }

  public SelenideElement getLinkRegister() {// наводит на линку Заргестрироваться
    return element(LINK_REGISTER);
  }

  public SelenideElement getLinkForgotPassword() {// восстановить пароль
    return element(LINK_FORGOT_PASSWORD);
  }
}