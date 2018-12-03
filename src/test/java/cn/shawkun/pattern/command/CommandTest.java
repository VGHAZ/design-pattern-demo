package cn.shawkun.pattern.command;

import org.junit.Assert;
import org.junit.Test;

public class CommandTest {
    @Test
    public void test(){
        Waiter waiterLiLei = new Waiter(20);

        Cook fishCookHanMeiMei = new FishCook();
        Cook meatCookWangZhe = new MeatCook();

        MenuCommand fishMenu = new commonMenuCommand(fishCookHanMeiMei);
        MenuCommand meatMenu = new commonMenuCommand(meatCookWangZhe);

        waiterLiLei.order(fishMenu);
        waiterLiLei.order(meatMenu);

        String[] results = waiterLiLei.pass();
        Assert.assertEquals("fish", results[0]);
        Assert.assertEquals("meat", results[1]);
    }
}
