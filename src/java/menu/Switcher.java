package menu;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<Command> commands = new ArrayList<Command>();
    public Switcher(){};
    public void addComand(Command cmd) {
        this.commands.add(cmd); // optional
    }
    public void execute(Integer number){
        commands.get(number).execute();
    }
    public void printOptions(){

    }
}
