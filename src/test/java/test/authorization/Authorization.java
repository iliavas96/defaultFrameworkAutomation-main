package test.authorization;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class Authorization {  //тест класс для проверки авторизации

    private final AuthorizationService authorizationService = new AuthorizationService(); //создает объект класса AuthorizationServise
    private final AuthorizationPage authorizationPage = new AuthorizationPage(); // создает объект класса AuthorizationPage


    @Test
    public void checkAuthorization() {
        String email = "alex20-03sh@mail.ru";
        String password = "022093Aa";

        authorizationService.openAutorizationPage();
        authorizationPage.setEmail(email);
        authorizationPage.setPassword(password);
        authorizationPage.getEnterButton().click();
        sleep(3000);
        assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://burger-frontend-6.prakticum-team.ru/", "URL должен быть - 'https://burger-frontend-6.prakticum-team.ru/'"
        );
    }
}


