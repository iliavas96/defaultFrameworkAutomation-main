package services.construcor;

import base.BaseService;

import static com.codeborne.selenide.Selenide.open;

public class ConstructorService extends BaseService { // наследник класса BaseService

    public void openConstructorPage() {
        open(baseUrl); // open - метод открывает страницу. В параметрах baseurl - адрес основной, он же страница "Конструктор"
    }

}
