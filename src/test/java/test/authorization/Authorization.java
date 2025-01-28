package test.authorization;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import services.authorization.AuthorizationService;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class Authorization { // создаем класс авторизация

    private final AuthorizationService authorizationService = new AuthorizationService(); // создание класса наследования
    private final AuthorizationPage authorizationPage = new AuthorizationPage(); // создание класса наследования

    @Test
    public void checkAuthorization() {
        String email = "iliavaswork+123123@gmail.com";// создаем стринг email который содержит iliavaswork+123123@gmail.com
        String password = "qwezxc";// создаем стринг password который содержит qwezxc

        authorizationService.openAutorizationPage(); // открыть страницу авторизации
        authorizationPage.setEmail(email); //ввести mail
        authorizationPage.setPassword(password); // ввести пароль
        authorizationPage.getEnterButton().click(); // войти



        sleep(3000); // делать паузу в 3 секунды между шагами

        assertEquals(
                WebDriverRunner.url(),
                "https://burger-frontend-6.prakticum-team.ru/", "URL должен быть - 'https://burger-frontend-6.prakticum-team.ru/'"
        );
    }
}


