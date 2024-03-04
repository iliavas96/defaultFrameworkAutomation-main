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

    void dragIngredient() { //добаввление ингридиентов в конструктор бургеров
        for (int i = 0; i < constructorPage
                .listIngredientOne().size(); i++) {
            $(constructorPage
                    .getListIngredientOne(i))
                    .dragAndDropTo(
                            constructorPage.getFillingAdditionArea());
        }
    }

    void compareIngredient() {
        for (int i = 0; i < constructorPage
                .setIngredientOne().size(); i++) {
            constructorPage
                    .getSetIngredientOne(i)
                    .shouldBe(visible);
        }
    }

    void comparePrice() { //сравнение суммы цен отдельных ингридиентов и общей цены показанной на сайте
        int sumPrice = 0;
        for (int i = 0;
             i < constructorPage.priceIngredientOne().size(); i++) {
            sumPrice += Integer.parseInt(
                    constructorPage
                            .getPriceIngredientOne(i)
                            .getText());

        }
        assertEquals(sumPrice,
                Integer.parseInt(
                        constructorPage
                                .getTotalPrice()
                                .getText()));
    }
}
