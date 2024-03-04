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
        String name = "ILIA";
        String email = "iliavaswork+" + (int) (Math.random() * 100000) + "@gmail.com";
        String password = "qwe123zxctyu";

        registrationService.openRegistrationPage();
        registrationPage.setName(name);
        registrationPage.setEmail(email);
        registrationPage.setPassword(password);
        registrationPage.getButton().click();

        sleep(3000); // без тайм аути не успевает прогрузиться страница

        webdriver().shouldHave(url("https://burger-frontend-6.prakticum-team.ru/"));
        assertEquals(registrationPage.getUserCabinet().getText(), name);

    }

}
