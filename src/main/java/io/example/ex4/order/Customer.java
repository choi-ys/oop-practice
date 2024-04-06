package io.example.ex4.order;

public class Customer {
    public Cook order(String menuItemName, Menu menu, Chef chef) {
        MenuItem choose = menu.choose(menuItemName);
        return chef.makeCook(choose);
    }
}
