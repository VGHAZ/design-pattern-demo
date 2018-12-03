package cn.shawkun.pattern.command;

public class commonMenuCommand implements MenuCommand {

    private Cook cook;

    public commonMenuCommand(Cook cook){
        this.cook = cook;
    }

    public String execute() {
        return cook.cook();
    }
}
