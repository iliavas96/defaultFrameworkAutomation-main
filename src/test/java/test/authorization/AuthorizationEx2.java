package test.authorization;

import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.authorization.AuthorizationPageEx2;
import pages.constructor.ConstructorPage;
import services.authorization.AuthorizationService;
import services.authorization.AuthorizationServiceEx2;

import static com.codeborne.selenide.Condition.visible;

public class AuthorizationEx2 {
    private final AuthorizationServiceEx2 authorizationServiceEx2 = new AuthorizationServiceEx2();
    private final AuthorizationPageEx2 authorizationPageEx2 = new AuthorizationPageEx2();
    private final private final ConstructorPage constructorPage = new ConstructorPage();

    @Test
    public void checkAuthorization() {
        String email = "iliavaswork+7070@gmail.com";
        String password = "qwe123zxc";

        authorizationServiceEx2.openAuthorizationPage();
        authorizationPageEx2.setEMAIL(email);
        authorizationPageEx2.setPASSWORD(password);
        authorizationPageEx2.getButton().click();

        constructorPage.getTitle()
                .shouldBe(visible.because("Пользователь не авторизован"));



    }




}
