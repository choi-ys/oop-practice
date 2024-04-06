package io.example.ex4.order;

public class Chef {
    public Cook makeCook(MenuItem menuItem) {
        return Cook.from(menuItem);
    }
}
