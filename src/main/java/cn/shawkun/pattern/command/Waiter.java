package cn.shawkun.pattern.command;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Waiter {
    private Queue<MenuCommand> menuCommands;

    public Waiter(int capacity){
         menuCommands = new ArrayBlockingQueue<MenuCommand>(capacity);
    }

    public boolean order(MenuCommand menuCommand){
        return menuCommands.add(menuCommand);
    }

    public String[] pass(){
        String[] cookResult = new String[menuCommands.size()];
        int i = 0;
        while (!menuCommands.isEmpty()){
            cookResult[i] = menuCommands.poll().execute();
            i++;
        }

        return cookResult;
    }
}
