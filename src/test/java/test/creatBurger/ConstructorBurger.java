package test.creatBurger;


import com.codeborne.selenide.ElementsCollection;
import pages.construсtor.ConstructorPage;

import java.util.concurrent.atomic.AtomicInteger;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.testng.Assert.assertEquals;

public class ConstructorBurger {
    final private ConstructorPage constructorPage = new ConstructorPage();

    void addIngredientsByDrag() {
        constructorPage.getIngredient("Краторная").dragAndDropTo(constructorPage.getFillingAdditionArea());
        constructorPage.getIngredient("Хрустящие").dragAndDropTo(constructorPage.getFillingAdditionArea());
        constructorPage.getIngredient("Плоды").dragAndDropTo(constructorPage.getFillingAdditionArea());
        constructorPage.getIngredient("Кристаллы").dragAndDropTo(constructorPage.getFillingAdditionArea());
        constructorPage.getIngredient("салат").dragAndDropTo(constructorPage.getFillingAdditionArea());
        constructorPage.getIngredient("Spicy").dragAndDropTo(constructorPage.getFillingAdditionArea());
        constructorPage.getIngredient("Space").dragAndDropTo(constructorPage.getFillingAdditionArea());
    }

    void compareIngredient() {

        ElementsCollection elements = new ElementsCollection(webdriver().driver(), constructorPage.getAllPrice());
        elements.stream().forEach(x -> x.shouldBe(visible));
    }

    void comparePrice() {
        AtomicInteger sumPrice = new AtomicInteger();
        ElementsCollection elements = new ElementsCollection(webdriver().driver(), constructorPage.getAllPrice());
        elements.forEach(x -> sumPrice.addAndGet(Integer.parseInt(x.text())));

        assertEquals(sumPrice.get(),
                Integer.parseInt(
                        constructorPage
                                .getTotalPrice()
                                .getText()), "Не сходится сумма всех ингридиентов и общая цена");

    }
}
