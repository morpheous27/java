import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * This program implements LRU cache using linked list which is single pointer
 * and hence takes O(n) time for traversal.
 */
public class LRUCacheUsingLinkedList {


    static Map<Integer,Integer> cache;
    static LinkedList<Integer> keyCache;
    static int capacity;

    public LRUCacheUsingLinkedList(int capacity) {
        this.capacity = capacity;
        keyCache = new LinkedList<>();
        cache = new HashMap<>();
    }

    public int get(int key) {
        if(cache.containsKey(key)) {
            keyCache.remove(new Integer(key));
            keyCache.add(key);
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        //System.out.print("-"+keyCache.size()+" cap-"+capacity);
        if(cache.containsKey(key)){
            keyCache.remove(new Integer(key));
        }else if(keyCache.size() == capacity){
            int keyToRemove = keyCache.pollFirst();
            cache.remove(keyToRemove);
            //System.out.print(" keyToRemove -"+keyToRemove);
        }
        keyCache.add(key);
        cache.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */