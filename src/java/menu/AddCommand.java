package menu;

import bouquet.Bouquet;
import flowers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by white on 14.05.2017.
 */
public class AddCommand implements Command{
    private Bouquet bouquet;
    private final List<String> flowersList=new ArrayList<String>();

    public AddCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
        for ( FlowersTypes type: FlowersTypes.values()
             ) {
            flowersList.add(type.toString().toLowerCase());
        }
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose number of flower to add:");
            for (int i = 0; i < flowersList.size(); i++) {
                System.out.println(i + "." + flowersList.get(i));
            }
            System.out.print("Choice:");
            int key = scanner.nextInt();
            if(key>=0&&key<FlowersTypes.values().length){
                Flower flower = new Flower(FlowersTypes.values()[key]);
                bouquet.addFlower(flower);
                break;
            }
            else System.out.println("Input value from list");
            }
        }
    }
