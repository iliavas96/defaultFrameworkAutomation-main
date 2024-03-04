package test.registration;

import org.testng.annotations.Test;
import pages.registration.RegistrationPage;
import services.registration.RegistrationService;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.testng.Assert.assertEquals;

public class Registration {
    private final RegistrationService registrationService = new RegistrationService();
    private final RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void checkRegistration() {
        String name = "ILIA"; //имя
        String email = "iliavaswork+" + (int) (Math.random() * 100000) + "@gmail.com"; //Math для создания новой почты
        String password = "qwe123zxctyu"; // пароль

        registrationService.openRegistrationPage();
        registrationPage.setName(name);
        registrationPage.setEmail(email);
        registrationPage.setPassword(password);
        registrationPage.getButton().click();

        sleep(3000); // тайм аут на 3 с.

        webdriver().shouldHave(url("https://burger-frontend-6.prakticum-team.ru/"));
        assertEquals(registrationPage.getUserCabinet().getText(), name);

    }

}
