package test.authorization;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class Authorization {

    private final AuthorizationService authorizationService = new AuthorizationService();
    private final AuthorizationPage authorizationPage = new AuthorizationPage();


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
                WebDriverRunner.url(),
                "https://burger-frontend-6.prakticum-team.ru/", "URL должен быть - 'https://burger-frontend-6.prakticum-team.ru/'"
        );
    }
}


