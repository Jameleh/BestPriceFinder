import java.util.Random;

public class Quate {

    public Quate(){}


    public Quate(String site, int price) {
        this.site = site;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Quate{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }



    public String getSite() {
        return site;
    }

    public int getPrice() {
        return price;
    }
    public String site;
    public int price;


}
