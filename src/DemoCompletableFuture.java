public class DemoCompletableFuture {


    public static void show() {

   var service = new  FlightService();
          service.getQuate("site1").thenAccept(System.out::println);
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
