package pages.construсtor;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.element;

public class ConstructorPage {
    /* Переменные*/

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

    /* Список  xpath ингридиентов*/
    private static final ArrayList<By> LIST_INGREDIENT_ONE = new ArrayList<>();
    private static final ArrayList<By> LIST_INGREDIENT_TWO = new ArrayList<>();

    static {
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Краторная булка N-200i']/.."));
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Хрустящие минеральные кольца']/.."));
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Плоды Фалленианского дерева']/.."));
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Кристаллы марсианских альфа-сахаридов']/.."));
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Мини-салат Экзо-Плантаго']/.."));
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Соус Spicy-X']/.."));
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Соус фирменный Space Sauce']/.."));

        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Флюоресцентная булка R2-D3']/.."));
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Сыр с астероидной плесенью']/.."));
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Филе Люминесцентного тетраодонтимформа']/.."));
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Мясо бессмертных моллюсков Protostomia']/.."));
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Биокотлета из марсианской Магнолии']/.."));
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Говяжий метеорит (отбивная)']/.."));
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Соус традиционный галактический']/.."));
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Соус с шипами Антарианского плоскоходца']/.."));
    }

    /* Список xpath стоимости ингридиентов*/

    private static final ArrayList<By> PRICE_INGREDIENT_ONE = new ArrayList<>();
    private static final ArrayList<By> PRICE_INGREDIENT_TWO = new ArrayList<>();

    static {
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Краторная булка N-200i']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Краторная булка N-200i']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Хрустящие минеральные кольца']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Плоды Фалленианского дерева']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Кристаллы марсианских альфа-сахаридов']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Мини-салат Экзо-Плантаго']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Соус Spicy-X']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Соус фирменный Space Sauce']/..//p[@class='text text_type_digits-default mr-2']"));


        PRICE_INGREDIENT_TWO.add(By.xpath(
         "//p[.='Флюоресцентная булка R2-D3']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Флюоресцентная булка R2-D3']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Сыр с астероидной плесенью']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Филе Люминесцентного тетраодонтимформа']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Мясо бессмертных моллюсков Protostomia']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Говяжий метеорит (отбивная)']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Биокотлета из марсианской Магнолии']/..//p[@class='text text_type_digits-default mr-2']"));

        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Соус традиционный галактический']/..//p[@class='text text_type_digits-default mr-2']"));
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Соус с шипами Антарианского плоскоходца']/..//p[@class='text text_type_digits-default mr-2']"));
    }

    /* Список элементов по xpath - ингридиентов после добавления их в конструктор бургера по тест кейсу №1-9-1*/
    private static ArrayList<By> SET_INGREDIENT_ONE = new ArrayList<>();

    static {
        SET_INGREDIENT_ONE.add(By.xpath(
                "//div[@class='burger-constructor_element__10R7L mb-4 mr-4']//span[.='Краторная булка N-200i (верх)']"));

        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Хрустящие минеральные кольца']"));
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Плоды Фалленианского дерева']"));
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Кристаллы марсианских альфа-сахаридов']"));
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Мини-салат Экзо-Плантаго']"));
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Соус Spicy-X']"));
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Соус фирменный Space Sauce']"));
        SET_INGREDIENT_ONE.add(By.xpath(
                "//div[@class='constructor-element constructor-element_pos_bottom']//span[.='Краторная булка N-200i (низ)']"));

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




    /* Методы с ArrayList */

    public SelenideElement getTotalPrice() {
        return element(TOTAL_PRICE);
    }

    public SelenideElement getListIngredientOne(int index) {
        return element(
                LIST_INGREDIENT_ONE.get(index)
        );
    }

    public SelenideElement getListIngredientTwo(int index) {
        return element(
                LIST_INGREDIENT_TWO.get(index)
        );
    }

    public SelenideElement getPriceIngredientOne(int index) {
        return element(
                PRICE_INGREDIENT_ONE.get(index)
        );
    }

    public SelenideElement getPriceIngredientTwo(int index) {
        return element(
                PRICE_INGREDIENT_TWO.get(index)
        );
    }

    public SelenideElement getSetIngredientOne(int index) {
        return element(
                SET_INGREDIENT_ONE.get(index)
        );
    }
    public ArrayList<By> listIngredientOne () {  //метод возвращает ArrayList ингридиентов 1
        return LIST_INGREDIENT_ONE;
    }

    public ArrayList<By> listIngredientTwo () {  //метод возвращает ArrayList ингридиентов 2
        return LIST_INGREDIENT_TWO;
    }

    public ArrayList<By> priceIngredientOne () {  //метод возвращает ArrayList цен ингридиентов 1
        return PRICE_INGREDIENT_ONE;
    }

    public ArrayList<By> priceIngredientTwo () {  //метод возвращает ArrayList цен ингридиентов 2
        return PRICE_INGREDIENT_TWO;
    }

    public ArrayList<By> setIngredientOne () {  //метод возвращает ArrayList  ингридиентов 1 в конструкторе бургеров (после добавления)
        return SET_INGREDIENT_ONE;
    }


}
