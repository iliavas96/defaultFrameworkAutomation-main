package pages.construсtor;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.element;

public class ConstructorPage {
    /* Переменные*/

    private final By LINK_CONSTRUCTOR = By.xpath("//a[@aria-current='page']"); //находит  линк "Конструктор"
    private final By LINK_ORDER_FEED = By.xpath("//a[@href='/feed']"); // находит  линк "Лента заказов"
    private final By LINK_PERSONAL_CABINET = By.xpath("//a[@href='/profile']"); //находит линк "Личный кабинет"
    private final By BUTTON_CREATE_ORDER = By.xpath("//button[contains(., 'Оформить заказ')]"); //находит кнопку "Оформить заказ"
    private final By TAB_NAME_BREAD = By.xpath("//div[.='Булки']"); // находит кнопку таблицы  "Булки"
    private final By TAB_NAME_FILLING = By.xpath("//div[.='Начинки']"); // находит кнопку таблицы "Начинки"
    private final By TAB_NAME_SAUCE = By.xpath("//div[.='Соусы']"); // находит кнопку таблицы "Соусы"
    private final By BREAD_ADDITION_AREA = By.xpath("//div[.='Выберите булки']"); // область добавления булки "Выберете булки"
    private final By FILLING_ADDITION_AREA = By.xpath("//ul[@class='burger-constructor_elements__1mnPz']"); // область добавления начинки "Выберете начинку", туда же соусы
    private final By TOTAL_PRICE = By.xpath("//p[@class='text burger-constructor_text__1C_uq mr-2']"); // находит общую сумму заказа

    /* Список  xpath ингридиентов*/
    private static final ArrayList<By> LIST_INGREDIENT_ONE = new ArrayList<>(); //Список  ингридиентов тест кейс №1-9-1
    private static final ArrayList<By> LIST_INGREDIENT_TWO = new ArrayList<>(); //Список  ингридиентов тест кейс №1-9-2

    static {
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Краторная булка N-200i']/..")); // добавляет булку индекс 0
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Хрустящие минеральные кольца']/..")); // добавляет начинку  индекс 1
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Плоды Фалленианского дерева']/..")); // добавляет начинку  индекс 2
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Кристаллы марсианских альфа-сахаридов']/..")); // добавляет начинку  индекс 3
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Мини-салат Экзо-Плантаго']/..")); // добавляет начинку  индекс 4
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Соус Spicy-X']/.."));// добавляет соус индекс 5
        LIST_INGREDIENT_ONE.add(By.xpath("//p[.='Соус фирменный Space Sauce']/..")); // добавляет соус индекс 6

        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Флюоресцентная булка R2-D3']/..")); // добавляет булку индекс 0
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Сыр с астероидной плесенью']/..")); // добавляет начинку  индекс 1
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Филе Люминесцентного тетраодонтимформа']/..")); // добавляет начинку  индекс 2
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Мясо бессмертных моллюсков Protostomia']/..")); // добавляет начинку  индекс 3
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Биокотлета из марсианской Магнолии']/..")); // добавляет начинку индекс 4
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Говяжий метеорит (отбивная)']/..")); // добавляет начинку  индекс 5
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Соус традиционный галактический']/..")); // добавляет соус индекс 6
        LIST_INGREDIENT_TWO.add(By.xpath("//p[.='Соус с шипами Антарианского плоскоходца']/..")); // добавляет соус индекс 7
    }

    /* Список xpath стоимости ингридиентов*/

    private static final ArrayList<By> PRICE_INGREDIENT_ONE = new ArrayList<>(); //Список элементов из которых можно взять стоимость ингридиентов тест кейс №1-9-1
    private static final ArrayList<By> PRICE_INGREDIENT_TWO = new ArrayList<>(); //Список элементов из которых можно взять стоимость ингридиентов тест кейс №1-9-2

    static {
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Краторная булка N-200i']/..//p[@class='text text_type_digits-default mr-2']")); //добавляет цену булки индекс 0
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Краторная булка N-200i']/..//p[@class='text text_type_digits-default mr-2']")); //добавляет цену булки индекс 1 (всего 2 булки)
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Хрустящие минеральные кольца']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 2
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Плоды Фалленианского дерева']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 3
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Кристаллы марсианских альфа-сахаридов']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 4
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Мини-салат Экзо-Плантаго']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 5
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Соус Spicy-X']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену соуса индекс 6
        PRICE_INGREDIENT_ONE.add(By.xpath(
                "//p[.='Соус фирменный Space Sauce']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену соуса индекс 7


        PRICE_INGREDIENT_TWO.add(By.xpath(
         "//p[.='Флюоресцентная булка R2-D3']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену булки индекс 0
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Флюоресцентная булка R2-D3']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену булки индекс 1
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Сыр с астероидной плесенью']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 2
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Филе Люминесцентного тетраодонтимформа']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 3
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Мясо бессмертных моллюсков Protostomia']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 4
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Говяжий метеорит (отбивная)']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 5
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Биокотлета из марсианской Магнолии']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену начинки индекс 6

        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Соус традиционный галактический']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену соуса индекс 7
        PRICE_INGREDIENT_TWO.add(By.xpath(
                "//p[.='Соус с шипами Антарианского плоскоходца']/..//p[@class='text text_type_digits-default mr-2']")); // добавляет цену соуса индекс 8
    }

    /* Список элементов по xpath - ингридиентов после добавления их в конструктор бургера по тест кейсу №1-9-1*/
    private static ArrayList<By> SET_INGREDIENT_ONE = new ArrayList<>();

    static {
        SET_INGREDIENT_ONE.add(By.xpath(
                "//div[@class='burger-constructor_element__10R7L mb-4 mr-4']//span[.='Краторная булка N-200i (верх)']"));//  добавление элемента - булка

        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Хрустящие минеральные кольца']"));//добавление элемента начинки
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Плоды Фалленианского дерева']")); //добавление элемента начинки
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Кристаллы марсианских альфа-сахаридов']")); //добавление элемента начинки
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Мини-салат Экзо-Плантаго']"));//добавление элемента начинки
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Соус Spicy-X']"));//добавление элемента начинки
        SET_INGREDIENT_ONE.add(By.xpath("//ul[@class='burger-constructor_elements__1mnPz']//span[.='Соус фирменный Space Sauce']"));//добавление элемента начинки
        SET_INGREDIENT_ONE.add(By.xpath(
                "//div[@class='constructor-element constructor-element_pos_bottom']//span[.='Краторная булка N-200i (низ)']")); // добавление элемента - булка

    }


    public SelenideElement getLinkConstructor() {
        return element(LINK_CONSTRUCTOR); // геттер. возвращает element "Конструктор", с которым можно взаиможействовать на странице
    }

    public SelenideElement getLinkOrderFeed() {
        return element(LINK_ORDER_FEED); // геттер. возвращает element "Лента заказов", с которым можно взаиможействовать на странице
    }

    public SelenideElement getLink_Personal_Cabinet() {
        return element(LINK_PERSONAL_CABINET); // геттер. возвращает element "Личный кабинет", с которым можно взаиможействовать на странице
    }

    public SelenideElement getButton_Create_Order() {
        return element(BUTTON_CREATE_ORDER); // геттер. возвращает element "Оформить заказ", с которым можно взаиможействовать на странице
    }

    public SelenideElement getTab_Name_Bread() {
        return element(TAB_NAME_BREAD); // геттер. возвращает element "кнопка таблицы Булки", с которым можно взаиможействовать на странице
    }

    public SelenideElement getTab_Name_Filing() {
        return element(TAB_NAME_FILLING); // геттер. возвращает element "кнопка таблицы Начинки", с которым можно взаиможействовать на странице
    }

    public SelenideElement getTab_Name_Sauce() {
        return element(TAB_NAME_SAUCE); // геттер. возвращает element "кнопка таблицы соусы", с которым можно взаиможействовать на странице
    }

    public SelenideElement getBread_AdditionN_Area() {
        return element(BREAD_ADDITION_AREA); // геттер. возвращает element "область добавления булки", с которым можно взаиможействовать на странице
    }

    public SelenideElement getFilling_Addition_Area() {
        return element(FILLING_ADDITION_AREA); // геттер. возвращает element "область добавления начинки и соусы", с которым можно взаиможействовать на странице
    }

    public SelenideElement getTotalPrice() {
        return element(TOTAL_PRICE); // геттер. возвращает element "с общей ценой заказа", из которого можно взять int для сравнения цен
    }

    public SelenideElement getListIngredient_One(int index) {
        return element(
                LIST_INGREDIENT_ONE.get(index)  //возвращает элемент из списка ингридиентов 1. Параметры index - индекс ингридиента в  ArrayList. тест кейс №1-9-1
        );
    }

    public SelenideElement getListIngredient_Two(int index) {
        return element(
                LIST_INGREDIENT_TWO.get(index)  //возвращает элемент из списка ингридиентов 1. Параметры index - индекс ингридиента в  ArrayList. тест кейс №1-9-1
        );
    }

    public SelenideElement getPriceIngredient_One(int index) {
        return element(
                PRICE_INGREDIENT_ONE.get(index)  //возвращает элемент из списка цен ингридиентов 1. Параметры index - индекс ингридиента в  ArrayList. Можно взять int для сравнения цен
        );
    }

    public SelenideElement getPriceIngredient_Two(int index) {
        return element(
                PRICE_INGREDIENT_TWO.get(index)  //возвращает элемент из списка цен ингридиентов 2. Параметры index - индекс ингридиента в  ArrayList. Можно взять int для сравнения цен
        );
    }

    public SelenideElement getSetIngredient_One(int index) {
        return element(
                SET_INGREDIENT_ONE.get(index)  //возвращает элемент из списка ингридиентов. Для проверки конструктора бугеров.
        );
    }
    public ArrayList<By> listIngredient_One () {  //метод возвращает ArrayList ингридиентов 1
        return LIST_INGREDIENT_ONE;
    }

    public ArrayList<By> listIngredient_Two () {  //метод возвращает ArrayList ингридиентов 2
        return LIST_INGREDIENT_TWO;
    }

    public ArrayList<By> priceIngredient_One () {  //метод возвращает ArrayList цен ингридиентов 1
        return PRICE_INGREDIENT_ONE;
    }

    public ArrayList<By> priceIngredient_Two () {  //метод возвращает ArrayList цен ингридиентов 2
        return PRICE_INGREDIENT_TWO;
    }

    public ArrayList<By> setIngredient_One () {  //метод возвращает ArrayList  ингридиентов 1 в конструкторе бургеров (после добавления)
        return SET_INGREDIENT_ONE;
    }


}
