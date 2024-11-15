import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {

    public static CompletableFuture<Quate> getQuate(String site){


        System.out.println("Getting Quate from"+ site);
         var x =CompletableFuture.supplyAsync( () -> {
             Random random = new Random();
             LongTask.simulate(random.nextInt(2000)+1000);

            int price = random.nextInt(1000);
            return new Quate(site, price);
        });
         return x;
    }


    public static Stream<CompletableFuture<Quate>> getQuates(){

        var sites =  List.of("site1","site2","site3");
        return sites.stream()
                .map(site->getQuate(site));


    }
}
