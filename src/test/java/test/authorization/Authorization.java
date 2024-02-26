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
    public void checkAuthorization() {  // метод проверки авторизации
        String email = "alex20-03sh@mail.ru"; //вводимый емайл
        String password = "022093Aa"; //вводимый пароль

        authorizationService.openAutorizationPage(); //открывает страницу с авторизацией
        authorizationPage.setEmail(email); // вставляет емейл "alex20-03sh@mail.ru"
        authorizationPage.setPassword(password); // вставляет пароль "022093Aa"
        authorizationPage.getEnterButton().click(); // наводит на Кнопку Войти, click - нажать на кнопку
        sleep(3000); // тайм аут на 3 с.
        assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(), // сравнивает url
                "https://burger-frontend-6.prakticum-team.ru/"
        );
    }
}


