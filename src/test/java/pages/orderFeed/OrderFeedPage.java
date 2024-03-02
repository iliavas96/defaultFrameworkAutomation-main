package pages.orderFeed;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class OrderFeedPage {
    private final By AREA_ORDER_ID = By.xpath(
            "//ul[@class='feed-info_list__1JWvG']/li[@class='feed-info_list_item__yrN7o']"); //находит  веб элемент, содержащий список id заков

    private final String AREA_ID = ".feed-info_list_item__yrN7o"; // css селектор того же элемента. Я их просто еще не учил, сделал пока так

    public String get_All_ID() { // возвращает css селектор
        return AREA_ID;
    }

    public SelenideElement getArea_Id() {
        return element(AREA_ORDER_ID); //возвращает element
    }


}
