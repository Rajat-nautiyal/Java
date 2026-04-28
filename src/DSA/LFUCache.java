package DSA;

import java.util.HashMap;


class LFUCache {
    class Node{
        int key;
        int freq;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }
    class List{
        Node head = new Node(0,0);
        Node tail = new Node(0,0);
        int size;
        List(){
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
        public void addfront(Node node){
            Node nextNode = head.next;
            node.next = nextNode;
            nextNode.prev = node;
            head.next = node;
            node.prev = head;
            size++;
        }
        public void removeNode(Node node){
            Node nodenext = node.next;
            Node nodeprev = node.prev;
            nodenext.prev = nodeprev;
            nodeprev.next = nodenext;
            size--;
        }        
    }
    HashMap<Integer, Node> mp;
    HashMap<Integer, List> fmp;
    int minfreq;
    int cap;
    public LFUCache(int capacity) {
        mp = new HashMap<>();
        fmp = new HashMap<>();
        minfreq = 0;
        cap = capacity;
    }
    
    public void updateList(Node node){
        fmp.get(node.freq).removeNode(node);
        if(node.freq == minfreq && fmp.get(node.freq).size == 0){
            minfreq++;
        }
        node.freq++;
        List nextList = fmp.getOrDefault(node.freq, new List());
        nextList.addfront(node);
        fmp.put(node.freq, nextList);        
    }
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        Node node = mp.get(key);
        int ans = node.val;
        updateList(node);
        return ans;
    }
    
    public void put(int key, int value) {
        if(cap == 0) return;
        if(mp.size() == cap && !mp.containsKey(key)){
            List ls = fmp.get(minfreq);
            Node nodeToRemove = ls.tail.prev;
            ls.removeNode(nodeToRemove);
            mp.remove(nodeToRemove.key);
            Node node = new Node(key, value);
            mp.put(key, node);
            minfreq = 1;
            List newls = fmp.getOrDefault(1, new List());
            newls.addfront(node);
            fmp.put(1, newls);
        }else if(mp.containsKey(key)){            
            Node node = mp.get(key);
            node.val = value;
            updateList(node);
        }else{
            minfreq = 1;
            List ls = fmp.getOrDefault(1, new List());
            Node node = new Node(key, value);
            ls.addfront(node);
            mp.put(key, node);
            fmp.put(minfreq, ls);
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */