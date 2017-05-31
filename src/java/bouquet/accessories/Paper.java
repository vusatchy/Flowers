package bouquet.accessories;

/**
 * Created by white on 13.05.2017.
 */
public class Paper {
    private  int price;

    public Paper(int maxLentgh,int amount){
        this.price=calculatePrice(maxLentgh,amount);
    }
    private int calculatePrice(int maxLength,int amount){
        return (int)(maxLength*1/4*amount*Math.PI);            //some kind of semi equation;
    }

    public int getPrice() {
        return price;
    }
}
