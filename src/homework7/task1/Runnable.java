package homework7.task1;

import java.io.InputStream;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Runnable {
    private final static int MAX_BUYERS_COUNT = 3;

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            int buyersCount = ThreadLocalRandom.current().nextInt(MAX_BUYERS_COUNT);

            IntStream.range(0, buyersCount).forEach(i -> {
                new Buyer().start();
            });

        }, 0, 1, TimeUnit.SECONDS);

        executor.schedule(() -> {
            future.cancel(true);
            executor.shutdown();
        }, 2, TimeUnit.MINUTES);
    }
}
