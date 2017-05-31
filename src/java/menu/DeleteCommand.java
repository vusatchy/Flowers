package menu;

import bouquet.Bouquet;
import flowers.*;

import java.util.Scanner;

/**
 * Created by white on 14.05.2017.
 */
public class DeleteCommand implements Command {
    private Bouquet bouquet;

    public DeleteCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Choose number of flower to delete:");
            System.out.println(bouquet);
            System.out.print("Choice:");
            int number = scanner.nextInt();
            bouquet.deleteFlower(number);

    }
}
