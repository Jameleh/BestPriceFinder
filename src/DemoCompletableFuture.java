import java.util.stream.Collectors;

public class DemoCompletableFuture {


    public static void show() {

   var service = new  FlightService();
          service.getQuates()
                  .stream()
                  .map(future -> future.thenAccept(System.out::println))
                  .collect(Collectors.toList());

                  try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
