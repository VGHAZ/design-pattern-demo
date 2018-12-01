package cn.shawkun.pattern.factory;

public class NYPizzaStore implements PizzaStore {
    public Pizza createPizza() {
        return new NYPizza();
    }
}
