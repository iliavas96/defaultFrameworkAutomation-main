package services.authorization;

import base.BaseService;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationServiceEx2 extends BaseService {
    public void openAuthorizationPage () {
        open(baseUrl2+"/login");
    }

}
