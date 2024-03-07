package test.creatBurger;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;
import pages.construсtor.ConstructorPage;
import pages.orderFeed.OrderFeedPage;
import services.orderFeed.OrderFeedService;
import test.authorization.Authorization;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.webdriver;

public class TestConstructorBurger extends ConstructorBurger {
    final private ConstructorPage constructorPage = new ConstructorPage();
    private final Authorization authorization = new Authorization();
    private final ConstructorBurger constructorBurger = new ConstructorBurger();
    private final OrderFeedPage orderFeedPage = new OrderFeedPage();
    private final OrderFeedService orderFeedService = new OrderFeedService();

    @Test
    public void checkConstructorBurger() {

        authorization.checkAuthorization();

        constructorBurger.addIngredientsByDrag();
        constructorBurger.compareIngredient();
        constructorBurger.comparePrice();
        constructorPage.getButtonCreateOrder().click();

        sleep(15000); //бывает долгая загрузка окна заказа
        String orderId = constructorPage.getNumberOrder().text();
        constructorPage.getCloseWindow().click();

        constructorPage.getLinkOrderFeed().click();
        ElementsCollection orders = new ElementsCollection(webdriver().driver(), orderFeedPage.getAllId());
        orderFeedService.checkElementsList(orders, orderId);
    }
}