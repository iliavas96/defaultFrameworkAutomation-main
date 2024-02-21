package test.authorization;

import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.constructor.ConstructorPage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Condition.visible;

public class Authorization {  //публичный класс авторизация

  private final AuthorizationService authorizationService = new AuthorizationService(); //создает объект класса, у которого метод открывает сайт на страницу авторизации
  private final AuthorizationPage authorizationPage = new AuthorizationPage(); // создает объект класса, в котором указаны необходимые поля ввода, кнопка и линки на восстановление пароля и регистрацию
  private final ConstructorPage constructorPage = new ConstructorPage(); //почему то не импортировался.

  @Test
  public void checkAuthorization() {
    String email = "alex20-03sh@mail.ru"; //вводимый емайл
    String password = "022093Aa"; //вводимый пароль

    authorizationService.openAutorizationPage(); //открывает страницу с авторизацией
    authorizationPage.setEmail(email); // вставляет емейл "alex20-03sh@mail.ru"
    authorizationPage.setPassword(password); // вставляет пароль "022093Aa"
    authorizationPage.getEnterButton().click(); // наводит на Кнопку Войти, click - нажать на кнопку
    constructorPage.getTitle()
        .shouldBe(visible.because("Пользователь не авторизован")); // не могу понять, не импортирует класс ConstructorPage. Но насколько я понял
  }//  тут проиходит проверка, высветилась ли надпись, пользователь не авторизован? Но вот тут я не понимаю.
}


