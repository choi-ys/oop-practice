package io.example.ex4.order;

import java.util.List;

public class Menu {
    public static final String MENU_ITEM_NOT_EXIST_EXCEPTION_MESSAGE = "해당하는 메뉴가 존재하지 않습니다.";
    private final List<MenuItem> elements;

    private Menu(List<MenuItem> elements) {
        this.elements = elements;
    }

    public static Menu of(List<MenuItem> menuItems) {
        return new Menu(menuItems);
    }

    public MenuItem choose(String name) {
        return elements.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(MENU_ITEM_NOT_EXIST_EXCEPTION_MESSAGE));
    }
}
