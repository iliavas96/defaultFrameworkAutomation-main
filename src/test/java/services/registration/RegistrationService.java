package services.registration;

import base.BaseService;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationService extends BaseService { //клас наследник BaseService
    public void openRegistrationPage() {
        open(baseUrl+"/register"); // открывает страницу регистрации
    }
}
