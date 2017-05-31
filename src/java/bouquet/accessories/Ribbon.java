package bouquet.accessories;

/**
 * Created by white on 13.05.2017.
 */
public class Ribbon {
    private  int price;

    public Ribbon(int amount){
        this.price=calculatePrice(amount);
    }
    private int calculatePrice(int amount){
        return 8/5*amount;            //some kind of semi equation;
    }
    public int getPrice() {
        return price;
    }
}
