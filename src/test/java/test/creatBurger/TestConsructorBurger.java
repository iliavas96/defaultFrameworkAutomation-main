package test.creatBurger;

import org.testng.annotations.Test;
import pages.construсtor.ConstructorPage;
import pages.orderFeed.OrderFeedPage;
import test.authorization.Authorization;
import java.util.List;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class TestConsructorBurger extends ConstructorBurger {
    final private ConstructorPage constructorPage = new ConstructorPage();

    private final Authorization authorization = new Authorization();
    private final ConstructorBurger constructorBurger = new ConstructorBurger();
    private OrderFeedPage orderFeedPage = new OrderFeedPage();

    @Test
    public void checkConstructorBurger() {

        authorization.checkAuthorization(); // авторизация
        constructorBurger.dragIngredient(); //переносит ингридиенты в конструктор бургера
        constructorBurger.compareIngredient(); //проверяет, что ингридиенты отобразились
        constructorBurger.comparePrice();// сравнивает цены
        constructorPage.getButton_Create_Order().click(); //нажимает на кнопку оформить заказ
        sleep(15000); //долгая загрузка бывает
        String orderId = constructorPage.getNumber_Order().text(); //читает номер заказа и переводит его в int
        constructorPage.getClose_Window().click(); // закрывает окно с id заказа
        constructorPage.getLinkOrderFeed().click(); // переходит в Ленту заказов
        List<String> lastOrders = $$(
                orderFeedPage.ger_All_ID()) //метод возвращает css селектор области где хранятся номера
                .texts(); //считывает в список номера последних заказов


        String found = "0"; //переменная для проверки совпадения ID заказа. Присвоится, если будет совпадение
        for (String element : lastOrders) {
            if (element.equals(orderId)) {
                found = element;
                assertEquals(found, orderId);
                break;
            }                                        // если при проходи List elements равен orderId, то found перезаписывается, если не равен то остается равна 0.
            assertEquals(found, orderId);     //потом found сравнивается с OrderId методом подходящим для тестов. Если перезаписали,
            // значит есть сопадение, если не презаписало то выдат ошибку теста
        }
        System.out.println();
        System.out.println(orderId);

    }
}

