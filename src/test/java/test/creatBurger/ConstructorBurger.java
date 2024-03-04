package test.creatBurger;


import pages.authorization.AuthorizationPage;
import pages.construсtor.ConstructorPage;
import services.authorization.AuthorizationService;
import services.construcor.ConstructorService;
import test.authorization.Authorization;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import static org.testng.Assert.assertEquals;

public class ConstructorBurger {
    final private ConstructorPage constructorPage = new ConstructorPage();


    void dragIngredient () { //добаввление ингридиентов в конструктор бургеров
        for (int i = 0; i < constructorPage
                .listIngredient_One().size(); i++)
        {
            $(constructorPage
                    .getListIngredient_One(i))
                    .dragAndDropTo(
                            constructorPage.getFilling_Addition_Area());
        }
    }

      void compareIngredient() { // метод проверяет добавились ли ингрилиенты в конструктор
        for (int i = 0; i < constructorPage
                .setIngredient_One().size(); i++) {
                    $(constructorPage
                        .getSetIngredient_One(i))
                        .shouldBe(visible);
        }
    }

    void comparePrice() { //сравнение суммы цен отдельных ингридиентов и общей цены показанной на сайте
        int sumPrice = 0;
        for (int i = 0;
             i < constructorPage.priceIngredient_One().size(); i++) {
            sumPrice += Integer.parseInt(
                    constructorPage
                            .getPriceIngredient_One(i)
                            .getText());

        }
        assertEquals(sumPrice,
                Integer.parseInt(
                        constructorPage
                                .getTotalPrice()
                                .getText()));
        }
}
