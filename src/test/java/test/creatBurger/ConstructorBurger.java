package test.creatBurger;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import pages.construсtor.ConstructorPage;
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

    @Test
    void checkConstructorBurger() {
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

        for (int i = 0; i < constructorPage
                .listIngredient_One().size(); i++) {    //проверяет размер, не больше размера ArrayList ListIngridient_One

            $(constructorPage
                    .getListIngredient_One(i))
                    .dragAndDropTo(constructorPage
                            .getFilling_Addition_Area()); //переносит элементы ArrayList  List_Ingredient_One в область добавления ингридиентов)
        }

        /*Дальше идет проверка, добавления элементов.*/

        for (int i = 0; i < constructorPage
                .setIngredient_One().size(); i++) { //проверяет размер, не больше размера ArrayList setIngridient_One
            $(constructorPage
                    .getSetIngredient_One(i))
                    .shouldBe(visible); // проверяет наличия элемента на странице
        }

        /* Сравнение цены ингридиентов и общей цены */

        int sumPrice = 0; //для суммы всех ингдредиентов

        for (int i = 0;
             i < constructorPage.priceIngredient_One().size(); i++) {// i меньше size ArrayList PRICE_INGREDIENT_ONE
            sumPrice += Integer.parseInt(                            // Складывает общую стоимость. Переводит String в INTEGER и потом в int для дальнейшего сравнения
                    constructorPage
                            .getPriceIngredient_One(i)         //метод возвращает элемент ArrayList PriceIngridient_One
                            .getText());                             //Читает текст
        }


        assertEquals(sumPrice,                           //Сравнивает два int - равна ли цена кажого отдельного эллемента - общей стоимости показанно на сайте
                Integer.parseInt(               // Переводит String в INTEGER
                        constructorPage
                                .getTotalPrice()// Находит элемент TOTAL_PRICE
                                .getText()));   // Читает его text.


        System.out.println("Проверка");


    }


}
