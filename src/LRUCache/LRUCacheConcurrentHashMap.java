package LRUCache;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Stream;

public class LRUCacheConcurrentHashMap<K, V> implements Cache<K, V> {

    private ConcurrentHashMap<K, V> cache;
    private Deque<K> queue;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int capacity;

    public LRUCacheConcurrentHashMap(int capacity) {
        this.cache = new ConcurrentHashMap<>(capacity);
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    @Override
    public Optional<V> get(K key) {
        this.lock.readLock().lock();

        V v = null;
        try{
        if (cache.containsKey(key)) {
            v = cache.get(key);
            cache.put(key, v);
            queue.remove(key);
            queue.add(key);
        }}finally {
            this.lock.readLock().unlock();
        }
        return Optional.of(v);
    }

    @Override
    public void put(K key, V value) {
        this.lock.writeLock().lock();
        try{
            if(cache.containsKey(key)){
                queue.remove(key);
            }
            if(queue.size() >= capacity){
                K k = queue.poll();
                cache.remove(k);
            }
            cache.put(key, value);
            queue.add(key);
        }finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override
    public int size() {
        return cache.size();
    }

    public void print() {
        //this.cache.keySet().stream().forEach(System.out::println);
        this.queue.stream().forEach(System.out::println);
    }
}
