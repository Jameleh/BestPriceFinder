import java.util.Random;

public class FlightService {

    public static Quate getQuate(String site){


        System.out.println("Getting Quate from"+ site);
        LongTask.simulate(3000);
        Random random = new Random();
        int price = random.nextInt(1000);
        return new Quate(site, price);
    }
}
