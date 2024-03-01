package test.registration;


import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.registration.RegistrationPage;
import services.authorization.AuthorizationService;
import services.registration.RegistrationService;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class Registration {
    private final RegistrationService registrationService = new RegistrationService(); //создает объект класса
    private final RegistrationPage registrationPage = new RegistrationPage(); //создает объект класса


    @Test
    public void checkAuthorization() {
        String name = "ILIA"; //имя
        String email = "iliavaswork+"+(int)(Math.random()*100000)+"@gmail.com"; //емаил, MATH random добавляет цифры после индивидуального адреса, пока не придумал
        // как сделать чтобы вообше не было шанса на повторение. Можно записывать в файл переменную, но пока решил не делать этого
        String password = "qwe123zxctyu"; // пароль
        registrationService.openRegistrationPage(); // открыть страницу регистрации
        registrationPage.setName(name); // ввсети имя
        registrationPage.setEmail(email); //ввести емаил
        registrationPage.setPassword(password); //ввести пароль
        registrationPage.getButton().click(); //навести на кнопку зарегестрироваться, кликнуть
        sleep(3000); // тайм аут на 3 с.
        assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(), // сравнивает url //проверяет, что после клика, был переход на основную страницу
                "https://burger-frontend-6.prakticum-team.ru/"
        );

        assertEquals(registrationPage.getUserCabinet().getText(), name); // проверяет что имя введенное в поле Name равняется тому, что показано на линке личный кабинет



    }

}
