package concurrency;

public class PrintSequence {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(new MyRunnable(counter,1,1));
        Thread t2 = new Thread(new MyRunnable(counter,2,2));
        Thread t3 = new Thread(new MyRunnable(counter,3,3));
        Thread t4 = new Thread(new MyRunnable(counter,4,4));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    static class MyRunnable implements Runnable{
        Counter counter;
        int id;
        int start;

        MyRunnable(Counter counter, int id,int start){
            this.counter = counter;
            this.id = id;
            this.start = start;
        }
        public void run(){
            while(start < 50){
                synchronized (counter){
                    while(counter.chance != id){
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"-"+start);
                    start += 4;
                    counter.chance += 1;
                    if(counter.chance == 5)
                        counter.chance = 1;
                    counter.notifyAll();
                }
            }
        }
    }


    static class Counter{
        int chance = 1;
        Integer count = new Integer(1);
    }
}
