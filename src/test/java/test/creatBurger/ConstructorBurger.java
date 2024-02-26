package test.creatBurger;

import com.codeborne.selenide.Condition;
import pages.construсtor.ConstructorPage;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import services.authorization.AuthorizationService;
import services.construcor.ConstructorService;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class ConstructorBurger {
    final private ConstructorPage constructorPage = new ConstructorPage();
    final private ConstructorService constructorService = new ConstructorService();
    private final AuthorizationService authorizationService = new AuthorizationService(); //создает объект класса AuthorizationServise
    private final AuthorizationPage authorizationPage = new AuthorizationPage(); // создает объект класса AuthorizationPage

    @Test void checkConstructorBurger() {
        String email = "alex20-03sh@mail.ru"; //вводимый емайл
        String password = "022093Aa"; //вводимый пароль
        authorizationService.openAutorizationPage();
        authorizationPage.setEmail(email); // вставляет емейл "alex20-03sh@mail.ru"
        authorizationPage.setPassword(password); // вставляет пароль "022093Aa"
        authorizationPage.getEnterButton().click(); // наводит на Кнопку Войти, click - нажать на кнопку
        sleep(3000); // тайм аут на 3 с.
        assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(), // сравнивает url
                "https://burger-frontend-6.prakticum-team.ru/"
        );

        for (int i)
        $(constructorPage.getButton_Ingredient(0))  //0 - индекс краторной булки
                .dragAndDropTo(constructorPage.getBread_AdditionN_Area()); // Перетащить - добавить булку в конструктор

        $(constructorPage.getButton_Ingredient(2))
                .dragAndDropTo(constructorPage.getFilling_Addition_Area()); // Перетащить - добавить первый элемент набора ингридиентов

        $(constructorPage.getButton_Ingredient(3))
                .dragAndDropTo(constructorPage.getFilling_Addition_Area());// Перетащить - добавить второй элемент набора ингридиентов

        $(constructorPage.getButton_Ingredient(4))
                .dragAndDropTo(constructorPage.getFilling_Addition_Area());// Перетащить - добавить третий элемент набора ингридиентов

        $(constructorPage.getButton_Ingredient(5))
                .dragAndDropTo(constructorPage.getFilling_Addition_Area());// Перетащить - добавить четвертый элемент набора ингридиентов

        $(constructorPage.getButton_Ingredient(11))
                .dragAndDropTo(constructorPage.getFilling_Addition_Area());// Перетащить - добавить пятый элемент набора ингридиентов (соус)

        $(constructorPage.getButton_Ingredient(12))
                .dragAndDropTo(constructorPage.getFilling_Addition_Area());// Перетащить - добавить шестой элемент набора ингридиентов (соус)

        /*Дальше идет проверка, добавления элементов.*/

        for (int i = 0; i<7; i++) { //в арей листе 7 эллементов, по очереди их проверяет
            $(constructorPage.getSetIngredient_One(i)).shouldBe(visible);
        }


        System.out.println("ddd");





    }



}
