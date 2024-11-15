import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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


    public  List<CompletableFuture<Quate>> getQuates(){

        var sites =  List.of("site1","site2","site3");
     return sites.stream()
                .map(site->getQuate(site))
                .collect(Collectors.toList());

    }
}
