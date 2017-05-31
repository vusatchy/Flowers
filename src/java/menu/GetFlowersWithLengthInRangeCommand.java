package menu;

import bouquet.Bouquet;
import flowers.Flower;

import java.util.Scanner;

/**
 * Created by white on 14.05.2017.
 */
public class GetFlowersWithLengthInRangeCommand implements Command {
    Bouquet bouquet;
    public GetFlowersWithLengthInRangeCommand(Bouquet bouquet) {
        this.bouquet=bouquet;
    }
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input min and max value:");
        for (Flower flower: bouquet.getFlowersWithLengthInRange(scanner.nextInt(),scanner.nextInt())
             ) {
            System.out.println(flower);
        }
    }
}
