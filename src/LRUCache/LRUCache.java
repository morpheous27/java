package LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache<K, V> implements Cache<K, V> {

    private LinkedHashMap<K, V> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<K, V>(capacity) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() >= capacity;
            }
        };
        this.capacity = capacity;
    }

    @Override
    public Optional<V> get(K key) {
        V v = null;
        if (cache.containsKey(key)) {
            v = cache.remove(key);
            cache.put(key, v);
        }
        return Optional.of(v);
    }

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public int size() {
        return cache.size();
    }
}
