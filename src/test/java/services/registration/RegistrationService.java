package services.registration;

import base.BaseService;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationService extends BaseService {
    public void openRegistrationPage() {
        open(baseUrl + "/register");
    }
}
