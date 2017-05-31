package menu;

import bouquet.Bouquet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by white on 14.05.2017.
 */
public class Menu {
        private Switcher switcher;
        private List<String> options=new ArrayList<String>();
        public  Menu(Bouquet bouquet){
            switcher= new Switcher();
            switcher.addComand(new AddCommand(bouquet));
            options.add("0. Add flower");
            switcher.addComand(new DeleteCommand(bouquet));
            options.add("1. Delete flower");
            switcher.addComand(new SortCommand(bouquet));
            options.add("2. Sort bouquet");
            switcher.addComand(new GetFlowersWithLengthInRangeCommand(bouquet));
            options.add("3. Get flowers with length of stalk in some range");
            switcher.addComand(new InfoCommand(bouquet));
            options.add("4. Print information");

        }
        public void makeChoice(Integer number){
            switcher.execute(number);
        }
        public void printOptions(){
            for(int i=0;i<options.size();i++){
                System.out.println(options.get(i));
            }
        }
        public int getSize(){
            return options.size();
        }
}
