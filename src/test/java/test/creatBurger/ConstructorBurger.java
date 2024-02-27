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
    final private ConstructorService constructorService = new ConstructorService();
    private final AuthorizationService authorizationService = new AuthorizationService(); //создает объект класса AuthorizationServise
    private final AuthorizationPage authorizationPage = new AuthorizationPage(); // создает объект класса AuthorizationPage
    private final Authorization authorization = new Authorization();


    void dragIngredient () { //добаввление ингрилиентов в конструктор бургеров
        for (int i = 0; i < constructorPage
                .listIngredient_One().size(); i++)  //проверяет размер, не больше размера ArrayList ListIngridient_One
        {
            $(constructorPage
                    .getListIngredient_One(i)) //выводит элемент ArrayList по индексу
                    .dragAndDropTo(
                            constructorPage.getFilling_Addition_Area()); //переносит элементы ArrayList  List_Ingredient_One в область добавления ингридиентов)
        }
    }

      void compareIngredient() { // метод проверяет добавились ли ингрилиенты в конструктор
        for (int i = 0; i < constructorPage
                .setIngredient_One().size(); i++) { //проверяет размер, не больше размера ArrayList setIngridient_One
                    $(constructorPage
                        .getSetIngredient_One(i))
                        .shouldBe(visible); // проверяет наличия элемента на странице
        }
    }

      void comparePrice () { //сравнение суммы цен отдельных ингридиентов и общей цены показанной на сайте
        int sumPrice = 0; //для суммы всех ингдредиентов
        for (int i = 0;
             i < constructorPage.priceIngredient_One().size(); i++) {// i меньше size ArrayList PRICE_INGREDIENT_ONE
            sumPrice += Integer.parseInt(                            // Складывает общую стоимость. Переводит String в INTEGER и потом в int для дальнейшего сравнения
                    constructorPage
                            .getPriceIngredient_One(i)         //метод возвращает элемент ArrayList PriceIngridient_One
                            .getText());                             //Читает текст

        }
            assertEquals(sumPrice,                                //Сравнивает два int - равна ли цена кажого отдельного эллемента - общей стоимости показанно на сайте
                    Integer.parseInt(                               // Переводит String в INTEGER
                            constructorPage
                                    .getTotalPrice()                // Находит элемент TOTAL_PRICE
                                    .getText()));                   // Читает его text.
        }
}
