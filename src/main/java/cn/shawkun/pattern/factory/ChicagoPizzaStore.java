package cn.shawkun.pattern.factory;

public class ChicagoPizzaStore implements PizzaStore {
    public Pizza createPizza() {
        return new ChicagoPizza();
    }
}
