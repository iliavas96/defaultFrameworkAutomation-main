package services.orderFeed;

import base.BaseService;

import static com.codeborne.selenide.Selenide.open;

public class OrderFeedService extends BaseService {
    public void openOrderPage() {
        open(baseUrl+"/feed"); // open - метод открывает страницу. В параметрах baseurl - адрес основной, он же страница "Конструктор"
    }
}
