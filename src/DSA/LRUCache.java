package DSA;

import java.util.HashMap;

public class LRUCache {
    static class Node {
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    int cap;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    HashMap<Integer, Node> m = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    public void remove(Node oldNode){
        if(oldNode != null){
            Node oldNodeNext = oldNode.next;
            Node oldNodePrev = oldNode.prev;
            oldNodePrev.next = oldNodeNext;
            oldNodeNext.prev = oldNodePrev;
            oldNode.next = null;
            oldNode.prev = null;
        }else{
            if (tail.prev == head) return; 
            Node delNode = tail.prev;
            Node delNodeprev = delNode.prev;
            delNodeprev.next = tail;
            tail.prev = delNodeprev;
            m.remove(delNode.key);
        }
    }
    public Node addNode(int key, int value){
        Node newNode = new Node(key, value);
        Node nextNode = head.next;
        newNode.next = nextNode;
        nextNode.prev = newNode;
        head.next = newNode;
        newNode.prev = head;
        return newNode;
    }
    public void put(int key, int value){
        if(m.size() == cap && !m.containsKey(key)){
            remove(null);
        }else if(m.containsKey(key)){
            Node oldNode = m.get(key);
            remove(oldNode);
            m.remove(key);
        }
        Node newNode = addNode(key, value);
        m.put(key, newNode);
    }
    public int get(int key){
        if(!m.containsKey(key)) return -1;
        Node getNode = m.get(key);
        int ans = getNode.val;        
        remove(getNode);
        m.remove(key);
        Node newNode = addNode(key, ans);
        m.put(key, newNode);
        return ans;
    }
    public static void main(String[] args) {
        // Create cache with capacity 2
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1));

        // Insert another key (evicts key 2)
        cache.put(3, 3);

        // Key 2 should be evicted
        System.out.println(cache.get(2));

        // Insert another key (evicts key 1)
        cache.put(4, 4);

        // Key 1 should be evicted
        System.out.println(cache.get(1));

        // Key 3 should be present
        System.out.println(cache.get(3));

        // Key 4 should be present
        System.out.println(cache.get(4));
    }
    
    
}
