package cn.shawkun.pattern.factory;

import org.junit.Assert;
import org.junit.Test;


public class FactoryMethodTest {
    @Test
    public void testCreatePizza(){
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Assert.assertEquals(chicagoPizzaStore.createPizza().getName(), ChicagoPizza.class.getSimpleName());

        PizzaStore nyPizzaStore = new NYPizzaStore();
        Assert.assertEquals(nyPizzaStore.createPizza().getName(), NYPizza.class.getSimpleName());
    }
}
