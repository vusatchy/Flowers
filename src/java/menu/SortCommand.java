package menu;

import bouquet.Bouquet;

/**
 * Created by white on 14.05.2017.
 */
public class SortCommand implements Command {
    Bouquet bouquet;
    public SortCommand(Bouquet bouquet) {
        this.bouquet=bouquet;
    }
    public void execute(){
        bouquet.bouquetSorting();
        System.out.println("Bouquet sorted");
    }
}
