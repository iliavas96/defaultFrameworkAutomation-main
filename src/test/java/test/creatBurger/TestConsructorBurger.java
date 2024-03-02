package test.creatBurger;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;
import pages.construсtor.ConstructorPage;
import pages.orderFeed.OrderFeedPage;
import services.orderFeed.OrderFeedService;
import test.authorization.Authorization;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;

public class TestConsructorBurger extends ConstructorBurger {
    final private ConstructorPage constructorPage = new ConstructorPage();

    private final Authorization authorization = new Authorization();
    private final ConstructorBurger constructorBurger = new ConstructorBurger();
    private final OrderFeedPage orderFeedPage = new OrderFeedPage();
    private final OrderFeedService orderFeedService = new OrderFeedService();

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
        ElementsCollection orders = new ElementsCollection(webdriver().driver(), orderFeedPage.get_All_ID());
        orderFeedService.checkElementList(orders, orderId);
    }
}


