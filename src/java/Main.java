import bouquet.Bouquet;
import flowers.*;
import menu.Menu;

import java.util.Scanner;

/**
 * Created by white on 13.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bouquet bouquet=new Bouquet();
        Menu menu = new Menu(bouquet);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.printOptions();
            System.out.print("Your choise:");
            int choise = scanner.nextInt();
            if(choise<menu.getSize()) menu.makeChoice(choise);
        }
    }
}
