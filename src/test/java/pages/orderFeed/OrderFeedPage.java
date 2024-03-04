package pages.orderFeed;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class OrderFeedPage {
    private final By AREA_ORDER_ID = By.xpath(
            "//ul[@class='feed-info_list__1JWvG']/li[@class='feed-info_list_item__yrN7o']"); //находит  веб элемент, содержащий список id заков

    public SelenideElement getArea_Id() {
        return element(AREA_ORDER_ID); //возвращает element
    }

}
