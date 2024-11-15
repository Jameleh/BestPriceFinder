import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class DemoCompletableFuture {


    public static void show() {

   var service = new  FlightService();
        var start = Instant.now();
        var futres = service.getQuates()
                  .map(future -> future.thenAccept(System.out::println))
                  .collect(Collectors.toList());
        CompletableFuture.allOf(futres.toArray(new CompletableFuture[0])).
                thenRun(() ->{

                var end = Instant.now();
                var allTime = Duration.between(start,end).toMillis();
                    System.out.println(allTime);



        });


                  try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
