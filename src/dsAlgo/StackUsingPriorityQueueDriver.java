package dsAlgo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StackUsingPriorityQueueDriver {
    public static void main(String[] args) {
        // without any priority. default behavior of priority queue.
        /*


         */

        priorityQueueWithCustomeData();


    }

    private static void defaultBehaviourPriorityQueue(){
        StackUsingPriorityQueue<Integer> stackUsingPriorityQueue = new StackUsingPriorityQueue<>();
        stackUsingPriorityQueue.push(12);
        stackUsingPriorityQueue.push(750);
        stackUsingPriorityQueue.push(99);
        stackUsingPriorityQueue.push(1);
        stackUsingPriorityQueue.push(0);
        stackUsingPriorityQueue.ds().stream().forEach(System.out::println);
    }

    private static void priorityQueueWithCustomeData(){
        Comparator<PriorityQueueData> priorityComparator = (i1,i2) -> {return i2.getPriority()-i1.getPriority(); };
        StackUsingPriorityQueue<PriorityQueueData> stackUsingPriorityQueue = new StackUsingPriorityQueue<>(priorityComparator);
        stackUsingPriorityQueue.push(new PriorityQueueData(12,5));
        stackUsingPriorityQueue.push(new PriorityQueueData(750,4));
        stackUsingPriorityQueue.push(new PriorityQueueData(99,3));
        stackUsingPriorityQueue.push(new PriorityQueueData(120,2));
        stackUsingPriorityQueue.push(new PriorityQueueData(-1,1));
        stackUsingPriorityQueue.ds().stream().forEach(System.out::println);
        for(int i=0;i<stackUsingPriorityQueue.ds().size();i++)
        System.out.println("Pop->"+stackUsingPriorityQueue.pop().getData());
    }
}

class PriorityQueueData {
    private Integer data;
    private int priority;

    public PriorityQueueData(Integer data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

class StackUsingPriorityQueue<T>{
    private PriorityQueue<T> pq;
    private int top =0 ;

    StackUsingPriorityQueue(){
        pq = new PriorityQueue<>();
    }

    StackUsingPriorityQueue(Comparator comparator){
        pq = new PriorityQueue<>(comparator);
    }
    public void push(T t){
        pq.add(t);
    }

    public T pop(){
        return pq.poll();
    }
    public PriorityQueue<T> ds(){
        return pq;
    }
}


