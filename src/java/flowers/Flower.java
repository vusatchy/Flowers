package flowers;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by white on 13.05.2017.
 */
  public class Flower implements  Comparable<Flower> {
    private FlowersTypes name;
    private int price;
    private Freshness freshness;
    private int stalkLength;
    private static Logger logger = Logger.getLogger(Flower.class);

    public int getStalkLength() {
        return stalkLength;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public Flower(int price, Freshness freshness, int stalkLength) {
        this.price = price;
        this.freshness = freshness;
        this.stalkLength = stalkLength;
    }

    public Flower( FlowersTypes type){
        this.name=type;
        initialization();
    }

   protected void initialization( ){
       DOMConfigurator.configure("resources\\log4j\\noOverwrite.xml");
       List<String> lines=new ArrayList<String>();
       String path="resources\\files\\"+name.toString().toLowerCase()+".txt";
       BufferedReader reader = null;
       FileReader fr = null;
        try {
            fr = new FileReader(path);
            reader = new BufferedReader(fr);
            String line;
            reader=new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        catch (IOException e){
            logger.error("File " +path+" broken or wasn't found");
        }finally {

            try {

                if (reader!= null)
                    reader.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                logger.error("Smth wrong with closing "+path);

            }

        }
       this.price=Integer.parseInt(lines.get(0));
       this.freshness=Freshness.valueOf(lines.get(1));
       this.stalkLength=(int)(Integer.parseInt(lines.get(2))*(1.0+Math.random()));
    }

    public int compareTo(Flower o) {
        return o.freshness.getCost()-freshness.getCost();
    }

    public int  getFinallCost(){
        return price+freshness.getCost();
    }
    @Override
    public String toString(){
        return "Flower : " +name.toString().toLowerCase()+"| Start price: "+price+" | Freshness: "+freshness.toString()+" | Stalk length :"+stalkLength+" | Finally price:"+getFinallCost();
    }
}
