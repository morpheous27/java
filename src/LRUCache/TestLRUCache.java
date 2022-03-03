package LRUCache;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestLRUCache {

    public static void main(String[] args) throws InterruptedException {
        testLRUCache();
        testLRUCacheWithSynchronizedMap();
        testLRUCacheWithConcurentHashMap();

    }


    private static void testLRUCache(){
        int size = 100;

        LRUCache<Integer,String> cache = new LRUCache<Integer, String>(10);
        ExecutorService service = Executors.newFixedThreadPool(5    );
        CountDownLatch latch = new CountDownLatch(9);
        System.out.println(LocalDateTime.now());
        try {
            for(int i=0; i<size;i++){
                int finalI = i;
                service.submit(() -> {
                    cache.put(finalI,"value-"+finalI);
                });
            }
            /*IntStream.of(0, 9).forEach(k -> {
                service.submit(() -> {
                    cache.put(k, "value" + k);
                    latch.countDown();
                });
            });*/
            //latch.await();
        }finally {
            service.shutdown();
        }
        System.out.println(LocalDateTime.now());
        System.out.println("Insertion done");
        System.out.println(cache.size());
    }


    private static void testLRUCacheWithSynchronizedMap(){
        int size = 100;

        LRUCacheSynchronizedMap<Integer,String> cache = new LRUCacheSynchronizedMap<Integer, String>(10);
        ExecutorService service = Executors.newFixedThreadPool(5    );
        CountDownLatch latch = new CountDownLatch(9);
        System.out.println(LocalDateTime.now());
        try {
            for(int i=0; i<size;i++){
                int finalI = i;
                service.submit(() -> {
                    cache.put(finalI,"value-"+finalI);
                });
            }
            /*IntStream.of(0, 9).forEach(k -> {
                service.submit(() -> {
                    cache.put(k, "value" + k);
                    latch.countDown();
                });
            });*/
            //latch.await();
        }finally {
            service.shutdown();
        }
        System.out.println(LocalDateTime.now());
        System.out.println("Insertion done");
        System.out.println(cache.size());
    }


    private static void testLRUCacheWithConcurentHashMap(){
        int size = 100;

        LRUCacheConcurrentHashMap<Integer,String> cache = new LRUCacheConcurrentHashMap<Integer, String>(10);
        ExecutorService service = Executors.newFixedThreadPool(5    );
        CountDownLatch latch = new CountDownLatch(100);
        System.out.println(LocalDateTime.now());
        try {
            for(int i=0; i<size;i++){
                int finalI = i;
                service.submit(() -> {
                    cache.put(finalI,"value-"+finalI);
                    latch.countDown();
                });
            }
            /*IntStream.of(0, 9).forEach(k -> {
                service.submit(() -> {
                    cache.put(k, "value" + k);
                    latch.countDown();
                });
            });*/
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
        System.out.println(LocalDateTime.now());
        System.out.println("Insertion done");
        System.out.println(cache.size());
        cache.print();
    }


    private static void testLRUCacheWithStreamsAndConcurrentHashMap(){
        int size = 100;

        LRUCacheConcurrentHashMap<Integer,String> cache = new LRUCacheConcurrentHashMap<Integer, String>(10);
        ExecutorService service = Executors.newFixedThreadPool(5    );
        CountDownLatch latch = new CountDownLatch(size);
        System.out.println(LocalDateTime.now());
        try {
            for(int i=0; i<size;i++){
                int finalI = i;
                service.submit(() -> {
                    cache.put(finalI,"value-"+finalI);
                    latch.countDown();
                });
            }
            /*IntStream.of(0, 9).forEach(k -> {
                service.submit(() -> {
                    cache.put(k, "value" + k);
                    latch.countDown();
                });
            });*/
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }

        System.out.println(LocalDateTime.now());
        System.out.println("Insertion done");
        System.out.println(cache.size());

    }





}
