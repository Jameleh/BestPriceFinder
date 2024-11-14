import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FlightService {

    public static CompletableFuture<Quate> getQuate(String site){


        System.out.println("Getting Quate from"+ site);
         var x =CompletableFuture.supplyAsync( () -> {
            LongTask.simulate(3000);
            Random random = new Random();
            int price = random.nextInt(1000);
            return new Quate(site, price);
        });
         return x;
    }
}
