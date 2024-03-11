package services.construcor;

import base.BaseService;

import static com.codeborne.selenide.Selenide.open;

public class ConstructorService extends BaseService {

    public void openConstructorPage() {
        open(baseUrl);
    }

}
