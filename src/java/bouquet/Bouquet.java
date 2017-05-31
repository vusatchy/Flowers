package bouquet;

import bouquet.accessories.Paper;
import bouquet.accessories.Ribbon;
import flowers.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by white on 13.05.2017.
 */
public class Bouquet {
    private List<Flower> flowers=new ArrayList<Flower>();
    private Ribbon ribbon;
    private Paper paper;
    private int price;

    public Bouquet(List<Flower> flowers) {
        this.flowers = flowers;
        price=priceCalculating();
    }

    public Bouquet() {}

    public void addFlower(Flower flower){
        flowers.add(flower);
        price=priceCalculating();
    }

    private int  priceCalculating(){
        int cost=0;
        for (Flower flower: flowers
             ) {
            cost+=flower.getFinallCost();
        }
        ribbon=new Ribbon(flowers.size());
        paper=new Paper(getLongestFlower().getStalkLength(),flowers.size());
        cost+=ribbon.getPrice()+paper.getPrice();
        return cost;
    }

    public void bouquetSorting(){
        Collections.sort(flowers);
    }

    public Flower getLongestFlower(){
        Flower longestFlower =Collections.max(flowers, new Comparator<Flower>() {
            public int compare(Flower o1, Flower o2) {
                return o1.getStalkLength()-o2.getStalkLength();
            }
        });
        return longestFlower;
    }

    public void deleteFlower(int number){
        if(number<flowers.size()&&number>=0) flowers.remove(number);
    }
    @Override
    public String toString(){
        String result="";
        for(int i=0;i<flowers.size();i++){
            result+=i+". "+flowers.get(i).toString()+"\n";
        }
        if(ribbon!=null) {
            result += "Ribbon cost:" + ribbon.getPrice() + "\n";
        }
        if(paper!=null) {
            result+="Paper cost:"+paper.getPrice()+"\n";
        }
        result+="Finally cost:"+price+"\n";
        return  result;
    }

    public List<Flower> getFlowersWithLengthInRange(int min,int max){
        List<Flower> flowersInRange = new ArrayList<Flower>();
        for (Flower flower:  flowers
             ) {
                if(min<=flower.getStalkLength()&&flower.getStalkLength()<=max){
                    flowersInRange.add(flower);
                }
        }
        return flowersInRange;
    }
}
