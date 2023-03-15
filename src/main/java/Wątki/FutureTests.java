package Wątki;

import java.util.concurrent.*;
import com.google.common.util.concurrent.*;

public class FutureTests {

    public void futureTest1() throws ExecutionException, InterruptedException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(5);

        Callable<Integer> callable = () -> {
            System.out.println("Inside the future: " +
                    Thread.currentThread().getName());
            System.out.println("Future priority: "
                    + Thread.currentThread().getPriority());
            Thread.sleep(5000);
            return 5 + 3;
        };

        System.out.println("In test: " +
                Thread.currentThread().getName());
        System.out.println("Main priority: " +
                Thread.currentThread().getPriority());

        Future<Integer> future = executorService.submit(callable);
        System.out.println("111");
        //This will block
        Integer result = future.get(); //block

        System.out.println("222");
        System.out.println("result = " + result);
        Integer result2 = future.get(); //block

        executorService.shutdown();

        executorService.awaitTermination(2, TimeUnit.SECONDS);

    }

    public void futureTest2() throws ExecutionException, InterruptedException{
        ExecutorService executorService =
                Executors.newCachedThreadPool();
        Callable<Integer> callable = () -> {
            Thread.sleep(3000);
            return 5 + 3;
        };

        Future<Integer> future = executorService.submit(callable);

        //NOTICE: This will not block, but it is awkward
        while (!future.isDone()) {
            System.out.println("I am doing something else on thread: " +
                    Thread.currentThread().getName());
        }
        System.out.println("poza whilem");

        Integer result = future.get();
        System.out.println("result = " + result);
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

    }

    public void futureTest3() throws ExecutionException, InterruptedException{
    ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<Integer> callable = () -> {
            Thread.sleep(3000);
            return 5 + 3;
        };
    ListeningExecutorService listeningExecutorService =
            MoreExecutors.listeningDecorator(executorService);

    ListenableFuture<Integer> listenableFuture =
            listeningExecutorService.submit(callable);  // mogłem lambdę tu bezpośrednio

        Futures.addCallback(listenableFuture,
            new FutureCallback<>() {
        @Override
        public void onSuccess(Integer result) {
            System.out.println(
                    "Got the result and the answer is? " + result);
        }

        @Override
        public void onFailure(Throwable t) {
            System.out.println("Things happened man. Bad things" + t.getMessage());
        }
    }, executorService
        );

        System.out.println("This should come before the result, I think!");
        Thread.sleep(5000);
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
    }
}
