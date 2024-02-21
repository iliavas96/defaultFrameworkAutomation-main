package services.authorization;

import base.BaseService;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationService extends BaseService { // наследник класса в котором ссылка на сайт бургер

  public void openAutorizationPage() {
    open(baseUrl + "/login"); // open - метод открывает страницу. В параметрах baseurl - адрес основной, /login - адрес окна авторизации
  }
}