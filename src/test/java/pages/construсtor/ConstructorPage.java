package pages.construсtor;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.element;

public class ConstructorPage {


    private final By LINK_CONSTRUCTOR = By.xpath("//a[@aria-current='page']");
    private final By LINK_ORDER_FEED = By.xpath("//a[@href='/feed']");
    private final By LINK_PERSONAL_CABINET = By.xpath("//a[@href='/profile']");
    private final By BUTTON_CREATE_ORDER = By.xpath("//button[contains(., 'Оформить заказ')]");
    private final By TAB_NAME_BREAD = By.xpath("//div[.='Булки']");
    private final By TAB_NAME_FILLING = By.xpath("//div[.='Начинки']");
    private final By TAB_NAME_SAUCE = By.xpath("//div[.='Соусы']");
    private final By BREAD_ADDITION_AREA = By.xpath("//div[.='Выберите булки']");
    private final By FILLING_ADDITION_AREA = By.xpath("//ul[@class='burger-constructor_elements__1mnPz']");
    private final By TOTAL_PRICE = By.xpath("//p[@class='text burger-constructor_text__1C_uq mr-2']");
    private final By ORDER_READY = By.xpath("//p[.='Ваш заказ начали готовить']");
    private final By NUMBER_ORDER = By.xpath("//h2[@class='order-details_title__FoYOr text text_type_digits-large mt-2 mb-4']");
    private final By CLOSE_WINDOW_ID = By.xpath("//button[@class='modal_button__3_zvg']");
    private final String ALL_PRICE = ".burger-constructor_burger_constructor__jXyGp div div span span[class*='price'";
    public SelenideElement getIngredient (String text) {
        By by = By.xpath("//p[contains(.,'" + text + "')]");
        return element (by);
    }

    public String getAllPrice () {
        return ALL_PRICE;
    }

    public SelenideElement getLinkConstructor() {
        return element(LINK_CONSTRUCTOR);
    }

    public SelenideElement getLinkOrderFeed() {
        return element(LINK_ORDER_FEED);
    }

    public SelenideElement getLinkPersonalCabinet() {
        return element(LINK_PERSONAL_CABINET);
    }

    public SelenideElement getButtonCreateOrder() {
        return element(BUTTON_CREATE_ORDER);
    }

    public SelenideElement getTabNameBread() {
        return element(TAB_NAME_BREAD);
    }

    public SelenideElement getTabNameFiling() {
        return element(TAB_NAME_FILLING);
    }

    public SelenideElement getTabNameSauce() {
        return element(TAB_NAME_SAUCE);
    }

    public SelenideElement getBreadAdditionNArea() {
        return element(BREAD_ADDITION_AREA);
    }

    public SelenideElement getFillingAdditionArea() {
        return element(FILLING_ADDITION_AREA);
    }

    public SelenideElement getOrderReady() {
        return element(ORDER_READY);
    }

    public SelenideElement getNumberOrder() {
        return element(NUMBER_ORDER);
    }

    public SelenideElement getCloseWindow() {
        return element(CLOSE_WINDOW_ID);
    }

    public SelenideElement getTotalPrice() {
        return element(TOTAL_PRICE);
    }

}
