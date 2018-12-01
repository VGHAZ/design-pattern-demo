package cn.shawkun.pattern.factory;

public abstract class Pizza {
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
