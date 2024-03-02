package services.orderFeed;

import base.BaseService;
import com.codeborne.selenide.ElementsCollection;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class OrderFeedService extends BaseService {
    public void openOrderPage() {
        open(baseUrl+"/feed"); // open - метод открывает страницу. В параметрах baseurl - адрес основной, он же страница "Конструктор"
    }
    public void checkElementList (ElementsCollection orders, String orderId) { //проверка совпадения номера заказа
        String found = "0";
        for (int i = 0; i<orders.size(); i++) {
            if (orders
                    .get(i)
                    .text()
                    .equals(orderId)) {
                found = orders.get(i).text();
                assertEquals(found, orderId);
                break;
            }
            assertEquals(found, orderId);
        }
    }
}
