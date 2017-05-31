package menu;

import bouquet.Bouquet;
import flowers.*;

import java.util.Scanner;

/**
 * Created by white on 14.05.2017.
 */
public class InfoCommand implements Command {
    private Bouquet bouquet;

    public InfoCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public void execute() {
        System.out.println(bouquet);
    }
}

