package threading;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintOddEvenUsingSynchronized {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(2);
        Numbers numbers = new Numbers();
        es.submit(new OddNumberPrinter(numbers));
        es.submit(new EvenNumberPrinter(numbers));
        es.awaitTermination(2000, TimeUnit.MILLISECONDS);
        System.out.println("Main is finished");

    }
}

class OddNumberPrinter implements Runnable {

    private Numbers a;

    OddNumberPrinter(Numbers a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            while(a.numbersStillToPrint()) {
                a.printOdd();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class EvenNumberPrinter implements Runnable {
    private Numbers a;

    EvenNumberPrinter(Numbers a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            while(a.numbersStillToPrint()) {
                a.printEven();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Numbers {

    private List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    private int i = 0;
    private Lock lock = new ReentrantLock();
    private boolean printEven = true; // number starts with 0 and hence true by default

    public Integer getNext() {
        lock.lock();
        Integer value = list.get(i++);
        lock.unlock();
        return value;
    }

    public synchronized boolean numbersStillToPrint() {
        boolean flag = false;
        if (i <= list.size()) {
            flag = true;
        }
        return flag;
    }

    public synchronized void printOdd() throws InterruptedException {
        while (printEven) {
            wait();
        }
        System.out.println(getNext());
        printEven = true;
        notifyAll();
    }

    public synchronized void printEven() throws InterruptedException {
        while (!printEven) {
            wait();
        }
        System.out.println(getNext());
        printEven = false;
        notifyAll();
    }

}




